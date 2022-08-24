package me.darkeyedragon.combatlogger;

import me.darkeyedragon.combatlogger.listener.PlayerDamageListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class CombatLogger extends JavaPlugin {

    private TagManager tagManager;

    @Override
    public void onEnable() {
        // Plugin startup logic
        tagManager = new TagManager();
        this.getServer().getPluginManager().registerEvents(new PlayerDamageListener(this), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public TagManager getTagManager() {
        return tagManager;
    }
}
