package net.blockcade.karma.Minecraft.hooks.banning;

import litebans.api.Entry;
import litebans.api.Events;
import net.blockcade.karma.Minecraft.hooks.HookHandler;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;

import java.util.UUID;

public class LiteBans extends HookHandler {

    public LiteBans() {
        super(Bukkit.getPluginManager().getPlugin("LiteBans"));

        Events.get().register(new Events.Listener() {
            @Override
            public void entryAdded(Entry entry) {
                if (entry.getType().equals("ban"))
                    registerBan(entry.getExecutorUUID()!=null?UUID.fromString(entry.getExecutorUUID()):null, entry.getUuid()!=null?UUID.fromString(entry.getUuid()):null, entry.getReason());
            }
            @Override
            public void entryRemoved(Entry entry) {
                if (entry.getType().equals("ban"))
                    registerPardon(entry.getExecutorUUID()!=null?UUID.fromString(entry.getExecutorUUID()):null, entry.getUuid()!=null?UUID.fromString(entry.getUuid()):null, entry.getReason());
            }

        });
    }

}
