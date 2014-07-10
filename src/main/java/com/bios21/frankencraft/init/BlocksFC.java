package com.bios21.frankencraft.init;

import com.bios21.frankencraft.block.BaseBlockFC;
import com.bios21.frankencraft.block.BlockPoilBlock;
import com.bios21.frankencraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * BlocksFC
 * FrankenCraft - 07/2014
 *
 * @author bios21
 */
public class BlocksFC {
    public static final BaseBlockFC blockPoilBlock = new BlockPoilBlock();

    public static void init() {
        GameRegistry.registerBlock(blockPoilBlock, Reference.Blocks.poilBlock);
    }
}