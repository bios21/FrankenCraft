package com.bios21.frankencraft.entity.effect;

import com.bios21.frankencraft.block.BlockPoilBlock;
import net.minecraft.block.Block;
import net.minecraft.entity.effect.EntityWeatherEffect;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntitySoftBolt extends EntityWeatherEffect {
	/**
	 * Declares which state the lightning bolt is in. Whether it's in the air,
	 * hit the ground, etc.
	 */
	private int lightningState;
	/**
	 * A random long that is used to change the vertex of the lightning rendered
	 * in RenderLightningBolt
	 */
	public long boltVertex;
	/**
	 * Determines the time before the EntityLightningBolt is destroyed. It is a
	 * random integer decremented over time.
	 */
	private int boltLivingTime;

	public EntitySoftBolt(World world, double x, double y, double z) {
		super(world);
		this.setLocationAndAngles(x, y, z, 0.0F, 0.0F);
		this.lightningState = 2;
		this.boltVertex = this.rand.nextLong();
		this.boltLivingTime = this.rand.nextInt(3) + 1;

        if (!this.worldObj.isRemote) {
            int i = MathHelper.floor_double(this.posX);
            int j = MathHelper.floor_double(this.posY);
            int k = MathHelper.floor_double(this.posZ);
            Block block = this.worldObj.getBlock(i, j - 1, k);

            if (block instanceof BlockPoilBlock) {
                ((BlockPoilBlock) block).onBlockElectrocuted(this.worldObj, i, j - 1, k);
            }
        }
}

    @Override
    protected void entityInit() {
    }

    /**
	 * Called to update the entity's position/logic.
	 */
	public void onUpdate() {
		super.onUpdate(); // squiz damage effects from lightning bolt, but keep rendering and updating

		if (this.lightningState == 2) {
			this.worldObj.playSoundEffect(this.posX, this.posY, this.posZ,
					"ambient.weather.thunder", 1.0F,
					0.8F + this.rand.nextFloat() * 0.2F);
//			this.worldObj
//					.playSoundEffect(this.posX, this.posY, this.posZ,
//							"random.explode", 0.5F,
//							0.5F + this.rand.nextFloat() * 0.2F);
		}

		--this.lightningState;

		if (this.lightningState < 0) {
			if (this.boltLivingTime == 0) {
				this.setDead();
			} else if (this.lightningState < -this.rand.nextInt(10)) {
				--this.boltLivingTime;
				this.lightningState = 1;
				this.boltVertex = this.rand.nextLong();
			}
		}

		if (this.lightningState >= 0) {
			if (this.worldObj.isRemote) {
				this.worldObj.lastLightningBolt = 2;
			}
		}
	}

    @Override
    protected void readEntityFromNBT(NBTTagCompound var1) {

    }

    @Override
    protected void writeEntityToNBT(NBTTagCompound var1) {

    }
}
