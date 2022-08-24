package me.darkeyedragon.combatlogger.player;

import org.bukkit.event.entity.EntityDamageEvent;

public record PlayerTag(long startTime, EntityDamageEvent.DamageCause cause) {

}
