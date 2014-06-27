package com.bios21.frankencraft;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenOcean;
import net.minecraft.world.biome.BiomeGenPlains;

import org.apache.commons.lang3.ArrayUtils;

import com.bios21.frankencraft.block.BlockPoilBlock;
import com.bios21.frankencraft.item.ItemPoil;
import com.bios21.frankencraft.world.biome.BiomeGenScientificPlot;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = FrankencraftMain.MODID, version = FrankencraftMain.VERSION)
public class FrankencraftMain {
    public static final String MODID = "FrankenCraft";
    public static final String VERSION = "1.7.2-0.1a";
    
    public static Block blockPoil;
    public static Item itemPoil;
    public static CreativeTabs creativeTabsFrankencraft = new CreativeTabsFrankencraft("FrankenCraft");
    public static BiomeGenBase biomeScientificPlot;
    
    @EventHandler
    public void preInit(final FMLPreInitializationEvent event) {
    	blockPoil = new BlockPoilBlock();
    	itemPoil = new ItemPoil();
    	GameRegistry.registerBlock(blockPoil, blockPoil.getUnlocalizedName().substring(5));
    	GameRegistry.registerItem(itemPoil, itemPoil.getUnlocalizedName());
    }
    
    @EventHandler
    public void init(final FMLInitializationEvent event) {
    	final ItemStack poilStack9 = new ItemStack(itemPoil, 9);
    	final ItemStack poilStack = new ItemStack(itemPoil);
    	final ItemStack blockPoilStack = new ItemStack(blockPoil);
		GameRegistry.addShapelessRecipe(poilStack9, blockPoilStack);
		GameRegistry.addShapedRecipe(blockPoilStack, "xxx", "xxx", "xxx", 'x', poilStack);
		
		ArrayUtils.removeAll(BiomeGenBase.getBiomeGenArray());
		BiomeGenBase ocean = (new BiomeGenOcean(0)).setColor(112).setBiomeName("Ocean").setHeight(new BiomeGenBase.Height(-1.0F, 0.1F));
	    BiomeGenBase plains = (new BiomeGenPlains(1)).setColor(9286496).setBiomeName("Plains");
		int biomeScientificPlotID = 1;
    	for (BiomeGenBase bgb : BiomeGenBase.getBiomeGenArray()) {
			if (bgb != null && bgb.biomeID < 128 && bgb.biomeID > biomeScientificPlotID) {
				biomeScientificPlotID = bgb.biomeID + 1;
			}
		}
    	biomeScientificPlot = new BiomeGenScientificPlot(biomeScientificPlotID);
    	BiomeGenBase.explorationBiomesList.add(biomeScientificPlot);
    	biomeScientificPlot.createMutation();
//    	BiomeGenBase.explorationBiomesList.remove(BiomeGenBase.plains);
//    	BiomeGenBase.explorationBiomesList.remove(BiomeGenBase.desert);
//    	BiomeGenBase.explorationBiomesList.remove(BiomeGenBase.forest);
//    	BiomeGenBase.explorationBiomesList.remove(BiomeGenBase.taiga);
//    	BiomeGenBase.explorationBiomesList.remove(BiomeGenBase.swampland);
//    	BiomeGenBase.explorationBiomesList.remove(BiomeGenBase.icePlains);
//    	BiomeGenBase.explorationBiomesList.remove(BiomeGenBase.jungle);
//    	BiomeGenBase.explorationBiomesList.remove(BiomeGenBase.jungleEdge);
//    	BiomeGenBase.explorationBiomesList.remove(BiomeGenBase.coldTaiga);
//    	BiomeGenBase.explorationBiomesList.remove(BiomeGenBase.savanna);
//    	BiomeGenBase.explorationBiomesList.remove(BiomeGenBase.savannaPlateau);
//    	BiomeGenBase.explorationBiomesList.remove(BiomeGenBase.mesa);
//    	BiomeGenBase.explorationBiomesList.remove(BiomeGenBase.mesaPlateau_F);
//    	BiomeGenBase.explorationBiomesList.remove(BiomeGenBase.mesaPlateau);
//    	BiomeGenBase.explorationBiomesList.remove(BiomeGenBase.birchForest);
//    	BiomeGenBase.explorationBiomesList.remove(BiomeGenBase.birchForestHills);
//    	BiomeGenBase.explorationBiomesList.remove(BiomeGenBase.roofedForest);
//    	BiomeGenBase.explorationBiomesList.remove(BiomeGenBase.megaTaiga);
//    	BiomeGenBase.explorationBiomesList.remove(BiomeGenBase.extremeHills);
//    	BiomeGenBase.explorationBiomesList.remove(BiomeGenBase.extremeHillsPlus);
    }
}
