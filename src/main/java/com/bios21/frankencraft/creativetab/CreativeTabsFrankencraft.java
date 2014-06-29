package com.bios21.frankencraft.creativetab;

import com.bios21.frankencraft.Frankencraft;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabsFrankencraft extends CreativeTabs {

	public CreativeTabsFrankencraft(final String tabLabel) {
		super(tabLabel);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		return Item.getItemFromBlock(Frankencraft.blockPoil);
	}

}
