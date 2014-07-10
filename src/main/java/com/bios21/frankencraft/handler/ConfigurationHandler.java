package com.bios21.frankencraft.handler;

import com.bios21.frankencraft.reference.Reference;
import com.bios21.frankencraft.utils.FrankenLog;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * ConfigurationHandler
 * FrankenCraft - 07/2014
 *
 * @author bios21
 */
public class ConfigurationHandler {
    public static Configuration configuration;
    public static boolean debugMode = false;

    public static void init(File configFile) {
        if (configuration == null) {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent onConfigChangedEvent) {
        if (onConfigChangedEvent.modID.equalsIgnoreCase(Reference.MOD_ID)) {
            loadConfiguration();
        }
    }

    private static void loadConfiguration() {
        debugMode = configuration.get(Configuration.CATEGORY_GENERAL, "debugMode", false, "Run mod in debug mode ?").getBoolean();

        if (configuration.hasChanged()) {
            configuration.save();
            if (debugMode) {
                FrankenLog.info("Configuration saved !");
                FrankenLog.info("DEBUG MODE IS ACTIVE !");
            }
        }
    }
}