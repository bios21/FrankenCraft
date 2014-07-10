package com.bios21.frankencraft.block;

import com.bios21.frankencraft.Frankencraft;
import com.bios21.frankencraft.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

/**
 * BaseBlockFC
 * FrankenCraft - 07/2014
 *
 * @author bios21
 */
public class BaseBlockFC extends Block {
    public BaseBlockFC(final Material material) {
        super(material);
        this.setBlockTextureName(Reference.MOD_ID + ":" + this.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
        this.setCreativeTab(Frankencraft.creativeTabsFrankencraft);
    }

    public BaseBlockFC() {
        this(Material.ground);
    }

    @Override
     public String getUnlocalizedName() {
        final StringBuilder sbName = new StringBuilder("tile.");
        sbName.append(Reference.MOD_ID.toLowerCase()).append(":");
        sbName.append(this.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));

        return sbName.toString();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(final IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    protected String getUnwrappedUnlocalizedName(final String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
