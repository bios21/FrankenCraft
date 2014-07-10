package com.bios21.frankencraft.item;

import com.bios21.frankencraft.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;

public class ItemPoil extends BaseItemFC {
	public ItemPoil() {
        super();
		this.setUnlocalizedName(Reference.Items.poil);
		this.setNoRepair();
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(final ItemStack itemStack){
		return EnumRarity.rare;
	}
}
