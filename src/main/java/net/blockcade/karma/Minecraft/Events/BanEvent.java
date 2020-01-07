package net.blockcade.karma.Minecraft.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.UUID;

public class BanEvent extends Event {

    public static HandlerList handlerList = new HandlerList();

    private UUID victim;
    private UUID administer;
    private String reason;

    public BanEvent(UUID victim, UUID administer, String reason) {
        this.victim=victim;
        this.administer=administer;
        this.reason=reason;
    }

    public UUID getVictim() {
        return victim;
    }

    public UUID getAdminister() {
        return administer;
    }

    public String getReason() {
        return reason;
    }

    public HandlerList getHandlers() {
        return handlerList;
    }
    public static HandlerList getHandlerList() {
        return handlerList;
    }
}
