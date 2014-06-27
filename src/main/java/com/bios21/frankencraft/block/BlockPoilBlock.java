package com.bios21.frankencraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import com.bios21.frankencraft.FrankencraftMain;
import com.bios21.frankencraft.entity.effect.EntitySoftBolt;

import cpw.mods.fml.common.registry.EntityRegistry;

public class BlockPoilBlock extends Block {

	public BlockPoilBlock() {
		super(Material.ground);
		this.setBlockName("poilBlock");
		this.setBlockTextureName(FrankencraftMain.MODID + ":" + "poilBlock");
		this.setCreativeTab(FrankencraftMain.creativeTabsFrankencraft);
		this.setHardness(3.0f);
	}
	
	@Override
	public boolean onBlockActivated(World world, int x,
			int y, int z, EntityPlayer entityPlayer,
			int p_149727_6_, float p_149727_7_, float p_149727_8_,
			float p_149727_9_) {
		// world.setThunderStrength(50f);
		// world.getWorldInfo().setThundering(true);
		// EntityRegistry.addSpawn(EntityLightningBolt.class, 50, 1, 5, EnumCreatureType.ambient, world.getBiomeGenForCoords(x, z));
		// EntityRegistry.addSpawn(EntityWolf.class, 50, 1, 12, EnumCreatureType.monster, world.getBiomeGenForCoords(x, z));
		world.addWeatherEffect(new EntitySoftBolt(world, x, y+1, z));
		System.out.println("Right click on poil block");
		
		return true;
	}
	
	public boolean onBlockElectrocuted(World world, int x, int y, int z) {
		System.out.println("STRIKE");
		return true;
	}

}
