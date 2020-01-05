package net.blockcade.karma.Minecraft.hooks.Karma;

import net.blockcade.karma.Minecraft.Karma;
import net.blockcade.karma.Minecraft.hooks.HookHandler;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class Chat extends HookHandler {

    public Chat(){
        super(Karma.getPlugin(Karma.class));
    }

    @EventHandler
    public void PlayerChat(AsyncPlayerChatEvent chatEvent){

    }

}
