package com.bios21.frankencraft.item;

import com.bios21.frankencraft.Frankencraft;
import com.bios21.frankencraft.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * BaseItemFC
 * FrankenCraft - 07/2014
 *
 * @author bios21
 */
public class BaseItemFC extends Item {
    public BaseItemFC() {
       super();
       this.setCreativeTab(Frankencraft.creativeTabsFrankencraft);
    }

    @Override
    public String getUnlocalizedName() {
        final StringBuilder sbName = new StringBuilder("item.");
        sbName.append(Reference.MOD_ID.toLowerCase()).append(":");
        sbName.append(this.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));

        return sbName.toString();
    }

    @Override
    public String getUnlocalizedName(final ItemStack itemStack) {
        return this.getUnlocalizedName();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    protected String getUnwrappedUnlocalizedName(final String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }


}