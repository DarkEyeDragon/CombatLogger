package me.darkeyedragon.combatlogger.listener;

import me.darkeyedragon.combatlogger.CombatLogger;
import me.darkeyedragon.combatlogger.TagManager;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.plugin.Plugin;

public class PlayerDamageListener implements Listener {

    private final CombatLogger plugin;
    private final TagManager tagManager;

    public PlayerDamageListener(CombatLogger plugin) {
        this.plugin = plugin;
        this.tagManager = plugin.getTagManager();
    }

    public void onPlayerDamage(EntityDamageByEntityEvent event) {
        if (event.getEntity() instanceof Player player) {
            if(!tagManager.shouldTag(event.getCause())) return;
            tagManager.addPlayer(player.getUniqueId(), event.getCause());
        }
    }

}
