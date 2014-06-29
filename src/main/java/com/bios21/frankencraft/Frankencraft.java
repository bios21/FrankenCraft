package com.bios21.frankencraft;

import com.bios21.frankencraft.block.BlockPoilBlock;
import com.bios21.frankencraft.client.renderer.RenderSoftBolt;
import com.bios21.frankencraft.creativetab.CreativeTabsFrankencraft;
import com.bios21.frankencraft.entity.effect.EntitySoftBolt;
import com.bios21.frankencraft.item.ItemPoil;
import com.bios21.frankencraft.proxy.IProxy;
import com.bios21.frankencraft.reference.Reference;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class Frankencraft {
    @Mod.Instance(Reference.MOD_ID)
    public static Frankencraft instance;

    public static Block blockPoil;
    public static Item itemPoil;
    public static CreativeTabs creativeTabsFrankencraft = new CreativeTabsFrankencraft(Reference.MOD_NAME);
    public static BiomeGenBase biomeScientificPlot;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;
    
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
        RenderingRegistry.registerEntityRenderingHandler(EntitySoftBolt.class, new RenderSoftBolt());
    }

    @EventHandler
    public void postInit(final FMLInitializationEvent event) {

    }
}
