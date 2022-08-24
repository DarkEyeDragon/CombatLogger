package me.darkeyedragon.combatlogger;

import me.darkeyedragon.combatlogger.player.PlayerTag;
import org.bukkit.event.entity.EntityDamageEvent;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class TagManager {
    private static final Map<UUID, PlayerTag> playerTagMap = new HashMap<>();

    public void addPlayer(UUID playerUUID, EntityDamageEvent.DamageCause cause) {
        playerTagMap.computeIfAbsent(playerUUID, uuid -> new PlayerTag(System.currentTimeMillis(), cause));

    }

    public boolean shouldTag(EntityDamageEvent.DamageCause cause) {
        throw new IllegalStateException("Not implemented");
    }
}
