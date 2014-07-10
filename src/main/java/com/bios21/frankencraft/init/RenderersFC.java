package com.bios21.frankencraft.init;

import com.bios21.frankencraft.client.renderer.RenderSoftBolt;
import com.bios21.frankencraft.entity.effect.EntitySoftBolt;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.renderer.entity.Render;

/**
 * RenderersFC
 * FrankenCraft - 07/2014
 *
 * @author bios21
 */
public class RenderersFC implements IInitable {
    public static final Render renderSoftBolt = new RenderSoftBolt();

    public static void init() {
        RenderingRegistry.registerEntityRenderingHandler(EntitySoftBolt.class, renderSoftBolt);
    }
}