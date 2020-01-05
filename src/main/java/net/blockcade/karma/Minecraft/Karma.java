package net.blockcade.karma.Minecraft;

import net.blockcade.karma.Minecraft.hooks.HookHandler;
import net.blockcade.karma.Minecraft.hooks.Misc.Vault;
import net.blockcade.karma.Minecraft.hooks.banning.LiteBans;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Karma extends JavaPlugin {

    @Override
    public void onEnable() {
        // Save default configuration file
        saveDefaultConfig();

        // Fet PluginManager
        PluginManager pluginManager = Bukkit.getPluginManager();

        // Hook with any plugins we support
        HookHandler.registerHooks(pluginManager,this);
    }

}
