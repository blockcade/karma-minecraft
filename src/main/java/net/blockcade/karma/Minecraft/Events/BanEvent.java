package net.blockcade.karma.Minecraft.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.UUID;

public class BanEvent extends Event {

    public static HandlerList handlerList = new HandlerList();

    private UUID victom;
    private UUID administer;
    private String reason;

    public BanEvent(UUID victom, UUID administer, String reason) {
        this.victom=victom;
        this.administer=administer;
        this.reason=reason;
    }

    public UUID getVictom() {
        return victom;
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
