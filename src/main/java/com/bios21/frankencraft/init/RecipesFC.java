package com.bios21.frankencraft.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

/**
 * RecipesFC
 * FrankenCraft - 07/2014
 *
 * @author bios21
 */
public class RecipesFC implements IInitable {
    private static final ItemStack poilStack9 = new ItemStack(ItemsFC.itemPoil, 9);
    private static final ItemStack poilStack = new ItemStack(ItemsFC.itemPoil);
    private static final ItemStack blockPoilStack = new ItemStack(BlocksFC.blockPoilBlock);

    public static void init() {
        initShapedRecipes();
        initShapelessRecipes();
    }

    private static void initShapedRecipes() {
        GameRegistry.addShapedRecipe(blockPoilStack, "xxx", "xxx", "xxx", 'x', poilStack);
    }

    private static void initShapelessRecipes() {
        GameRegistry.addShapelessRecipe(poilStack9, blockPoilStack);
    }
}