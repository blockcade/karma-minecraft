package net.blockcade.karma.Minecraft.hooks.Misc;

import net.blockcade.karma.Minecraft.hooks.HookHandler;
import org.bukkit.Bukkit;

// Remove like 1k score if they use Essentials
public class Essentials extends HookHandler {

    public Essentials() {
        super(Bukkit.getPluginManager().getPlugin("Essentials"));
    }

}
