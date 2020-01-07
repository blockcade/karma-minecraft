package net.blockcade.karma.Minecraft;

import net.blockcade.karma.Minecraft.hooks.HookHandler;
import org.bukkit.Bukkit;
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
