package net.blockcade.karma.Minecraft.hooks;

import net.blockcade.karma.Minecraft.Events.BanEvent;
import net.blockcade.karma.Minecraft.Events.PardonEvent;
import net.blockcade.karma.Minecraft.hooks.AntiCheat.Matrix;
import net.blockcade.karma.Minecraft.hooks.Misc.Essentials;
import net.blockcade.karma.Minecraft.hooks.Misc.Vault;
import net.blockcade.karma.Minecraft.hooks.banning.LiteBans;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;
import java.util.UUID;

public class HookHandler implements Listener {

    public HookHandler(Plugin hook) {
        if(hook==null)
            return;
        Bukkit.getLogger().info("Successfully hooked with "+hook.getName()+" V "+hook.getDescription().getVersion());
    }

    public void registerBan(UUID victim, UUID administer, String reason) {
        // Call event for any hooked plugins
        Bukkit.getPluginManager().callEvent(new BanEvent(victim,administer,reason));

        // Log it
        Bukkit.getLogger().info("Someone was banned "+ Objects.requireNonNull(Bukkit.getPlayer(victim)).getName());
    }
    public void registerPardon(UUID victim, UUID administer, String reason) {
        // Call event for any hooked plugins
        Bukkit.getPluginManager().callEvent(new PardonEvent(victim,administer,reason));

        Bukkit.getLogger().info("Someone was pardoned "+ Objects.requireNonNull(Bukkit.getPlayer(victim)).getName());
    }

    public static void registerHooks(PluginManager pluginManager, JavaPlugin plugin) {
        Bukkit.getLogger().info("Checking for possible hooks");

        // Hook with LiteBans
        if(pluginManager.isPluginEnabled("LiteBans"))
            pluginManager.registerEvents(new LiteBans(),plugin);

        // Hook with Vault
        if(pluginManager.isPluginEnabled("Vault"))
            pluginManager.registerEvents(new Vault(),plugin);

        // Hook with Essentials
        if(pluginManager.isPluginEnabled("Essentials"))
            pluginManager.registerEvents(new Essentials(),plugin);

        // Hook with Matrix
        if(pluginManager.isPluginEnabled("Matrix"))
            pluginManager.registerEvents(new Matrix(),plugin);
    }
}
