package com.bios21.frankencraft.init;

import com.bios21.frankencraft.item.BaseItemFC;
import com.bios21.frankencraft.item.ItemPoil;
import com.bios21.frankencraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * ItemsFC
 * FrankenCraft - 07/2014
 *
 * @author bios21
 */
public class ItemsFC implements IInitable {
    public static final BaseItemFC itemPoil = new ItemPoil();

    public static void init() {
        GameRegistry.registerItem(itemPoil, Reference.Items.poil);
    }
}