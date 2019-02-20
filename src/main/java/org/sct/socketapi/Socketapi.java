package org.sct.socketapi;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author Alchemy
 */
public final class Socketapi extends JavaPlugin {

    private static Socketapi instance;

    @Override
    public void onEnable() {
        instance = this;

    }

    @Override
    public void onDisable() {

    }

    public static Socketapi getInstance() {
        return instance;
    }
}
