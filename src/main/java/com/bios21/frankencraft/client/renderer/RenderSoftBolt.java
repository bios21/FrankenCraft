package com.bios21.frankencraft.client.renderer;

import com.bios21.frankencraft.entity.effect.EntitySoftBolt;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import java.util.Random;

/**
 * RenderSoftBolt
 * FrankenCraft - 06/2014
 *
 * @author bios21
 */
@SideOnly(Side.CLIENT)
public class RenderSoftBolt extends Render {

    @Override
    public void doRender(Entity entity, double x, double y, double z, float par4, float par5) {
        this.doRender((EntitySoftBolt)entity, x, y, z, par4, par5);
    }

    public void doRender(EntitySoftBolt entitySoftBolt, double x, double y, double z, float par8, float par9) {
        Tessellator tessellator = Tessellator.instance;
        GL11.glDisable(GL11.GL_TEXTURE_2D);
        GL11.glDisable(GL11.GL_LIGHTING);
        GL11.glEnable(GL11.GL_BLEND);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE);
        double[] adouble = new double[8];
        double[] adouble1 = new double[8];
        double d3 = 0.0D;
        double d4 = 0.0D;
        Random random = new Random(entitySoftBolt.boltVertex);

        for (int i = 7; i >= 0; --i)
        {
            adouble[i] = d3;
            adouble1[i] = d4;
            d3 += (double)(random.nextInt(11) - 5);
            d4 += (double)(random.nextInt(11) - 5);
        }

        for (int k1 = 0; k1 < 4; ++k1)
        {
            Random random1 = new Random(entitySoftBolt.boltVertex);

            for (int j = 0; j < 3; ++j)
            {
                int k = 7;
                int l = 0;

                if (j > 0)
                {
                    k = 7 - j;
                }

                if (j > 0)
                {
                    l = k - 2;
                }

                double d5 = adouble[k] - d3;
                double d6 = adouble1[k] - d4;

                for (int i1 = k; i1 >= l; --i1)
                {
                    double d7 = d5;
                    double d8 = d6;

                    if (j == 0)
                    {
                        d5 += (double)(random1.nextInt(11) - 5);
                        d6 += (double)(random1.nextInt(11) - 5);
                    }
                    else
                    {
                        d5 += (double)(random1.nextInt(31) - 15);
                        d6 += (double)(random1.nextInt(31) - 15);
                    }

                    tessellator.startDrawing(5);
                    float f2 = 0.5F;
                    tessellator.setColorRGBA_F(0.9F, 0.1F * f2, 0.1F * f2, 0.6F);
                    double d9 = 0.1D + (double)k1 * 0.2D;

                    if (j == 0)
                    {
                        d9 *= (double)i1 * 0.1D + 1.0D;
                    }

                    double d10 = 0.1D + (double)k1 * 0.2D;

                    if (j == 0)
                    {
                        d10 *= (double)(i1 - 1) * 0.1D + 1.0D;
                    }

                    for (int j1 = 0; j1 < 5; ++j1)
                    {
                        double d11 = x + 0.5D - d9;
                        double d12 = z + 0.5D - d9;

                        if (j1 == 1 || j1 == 2)
                        {
                            d11 += d9 * 2.0D;
                        }

                        if (j1 == 2 || j1 == 3)
                        {
                            d12 += d9 * 2.0D;
                        }

                        double d13 = x + 0.5D - d10;
                        double d14 = z + 0.5D - d10;

                        if (j1 == 1 || j1 == 2)
                        {
                            d13 += d10 * 2.0D;
                        }

                        if (j1 == 2 || j1 == 3)
                        {
                            d14 += d10 * 2.0D;
                        }

                        double d15 = x + 0.5D - d13;
                        double d16 = z + 0.5D - d14;

                        tessellator.addVertex(d13 + d5, y + (double)(i1 * 16), d14 + d6);
                        tessellator.addVertex(d11 + d7, y + (double)((i1 + 1) * 16), d12 + d8);
                        tessellator.addVertex(d13 + d5, y + (double)(i1 * 16), d14 + d6);
                        tessellator.addVertex(d11 + d7, y + (double)((i1 + 1) * 16), d12 + d8);
                    }

                    tessellator.draw();
                }
            }
        }

        GL11.glDisable(GL11.GL_BLEND);
        GL11.glEnable(GL11.GL_LIGHTING);
        GL11.glEnable(GL11.GL_TEXTURE_2D);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
        return this.getEntityTexture((EntitySoftBolt) entity);
    }
    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntitySoftBolt par1EntityLightningBolt)
    {
        return null;
    }
}
