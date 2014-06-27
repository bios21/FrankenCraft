package com.bios21.frankencraft.utils;

import net.minecraft.block.Block;
import net.minecraft.world.World;

public class FcWorldWrapper {
	
	public final World world;
	
	public FcWorldWrapper(final World world) {
		this.world = world;
	}

	public final int getBlockId(final int x, final int y, final int z) {
		final Block block = this.world.getBlock(x, y, z);
		int blockId = block.getIdFromBlock(block);
		return blockId;
		
	}

}
