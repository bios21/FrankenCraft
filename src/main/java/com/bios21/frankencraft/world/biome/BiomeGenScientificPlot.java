package com.bios21.frankencraft.world.biome;

import com.bios21.frankencraft.FrankencraftMain;

import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenScientificPlot extends BiomeGenBase {

	public BiomeGenScientificPlot(int par1) {
		super(par1);
		this.topBlock = FrankencraftMain.blockPoil;
		this.fillerBlock = FrankencraftMain.blockPoil;
		this.theBiomeDecorator.treesPerChunk = -999;
        this.theBiomeDecorator.deadBushPerChunk = -999;
        this.theBiomeDecorator.reedsPerChunk = -999;
        this.theBiomeDecorator.cactiPerChunk = -999;
        this.rootHeight = -2;
        this.setHeight(new BiomeGenBase.Height(0f, 0f));
        this.setBiomeName("Scientific Plot");
        this.setTemperatureRainfall(50f, 100f);
        this.flowers.clear();
	}

}
