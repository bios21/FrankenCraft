package com.bios21.frankencraft;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class CreativeTabsFrankencraft extends CreativeTabs {

	public CreativeTabsFrankencraft(final String tabLabel) {
		super(tabLabel);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		return Item.getItemFromBlock(FrankencraftMain.blockPoil);
	}

}
