package com.bios21.frankencraft.block;

import com.bios21.frankencraft.entity.effect.EntitySoftBolt;
import com.bios21.frankencraft.reference.Reference;
import cpw.mods.fml.common.FMLLog;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import org.apache.logging.log4j.Level;

public class BlockPoilBlock extends BaseBlockFC {

    private boolean striked = false;

	public BlockPoilBlock() {
		this.setBlockName(Reference.Blocks.poilBlock);
		this.setHardness(1.0f);
	}
	
	@Override
	public boolean onBlockActivated(World world, int x,
			int y, int z, EntityPlayer entityPlayer,
			int p_149727_6_, float p_149727_7_, float p_149727_8_,
			float p_149727_9_) {

        world.addWeatherEffect(new EntitySoftBolt(world, x, y + 1, z));
        System.out.println("Right click on poil block");
        FMLLog.log(Level.DEBUG, "Something just gettin serious ...");

		
		return true;
	}
	
	public boolean onBlockElectrocuted(World world, int x, int y, int z) {
		System.out.println("STRIKE");
		return true;
	}

}
