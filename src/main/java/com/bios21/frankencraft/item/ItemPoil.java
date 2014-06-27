package com.bios21.frankencraft.item;

import com.bios21.frankencraft.FrankencraftMain;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemPoil extends Item {
	public ItemPoil() {
		this.setUnlocalizedName("poil");
		this.setCreativeTab(FrankencraftMain.creativeTabsFrankencraft);
		this.setNoRepair();
		this.setTextureName(FrankencraftMain.MODID + ":" + "poil");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(final ItemStack par1ItemStack){
		return EnumRarity.rare;
	}
}
