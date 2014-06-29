package com.bios21.frankencraft.item;

import com.bios21.frankencraft.Frankencraft;
import com.bios21.frankencraft.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemPoil extends Item {
	public ItemPoil() {
		this.setUnlocalizedName("poil");
		this.setCreativeTab(Frankencraft.creativeTabsFrankencraft);
		this.setNoRepair();
		this.setTextureName(Reference.MOD_ID + ":" + "poil");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(final ItemStack par1ItemStack){
		return EnumRarity.rare;
	}
}
