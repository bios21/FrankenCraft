package com.bios21.frankencraft;

import com.bios21.frankencraft.creativetab.CreativeTabsFrankencraft;
import com.bios21.frankencraft.handler.ConfigurationHandler;
import com.bios21.frankencraft.init.BlocksFC;
import com.bios21.frankencraft.init.ItemsFC;
import com.bios21.frankencraft.init.RecipesFC;
import com.bios21.frankencraft.init.RenderersFC;
import com.bios21.frankencraft.proxy.IProxy;
import com.bios21.frankencraft.reference.Reference;
import com.bios21.frankencraft.utils.FrankenLog;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.biome.BiomeGenBase;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class Frankencraft {
    @Mod.Instance(Reference.MOD_ID)
    public static Frankencraft instance;

    public static CreativeTabs creativeTabsFrankencraft = new CreativeTabsFrankencraft(Reference.MOD_NAME);
    public static BiomeGenBase biomeScientificPlot;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @EventHandler
    public void preInit(final FMLPreInitializationEvent event) {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        FrankenLog.info("Configuration loaded !");

        ItemsFC.init();
        BlocksFC.init();
    }

    @EventHandler
    public void init(final FMLInitializationEvent event) {
        RecipesFC.init();
        RenderersFC.init();
        FrankenLog.info("Recipes and renderers loaded !");
    }

    @EventHandler
    public void postInit(final FMLInitializationEvent event) {

    }
}
