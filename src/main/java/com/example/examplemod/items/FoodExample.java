package com.example.examplemod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import javax.annotation.ParametersAreNonnullByDefault;

public class FoodExample extends ItemFood {
    public FoodExample(){
        super(64, 4,false);
        setRegistryName("foodexample");
        setUnlocalizedName("foodexample");
        setCreativeTab(CreativeTabs.FOOD);
    }

    @Override
    @ParametersAreNonnullByDefault
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {

        super.onFoodEaten(stack, worldIn, player);
    }
}
