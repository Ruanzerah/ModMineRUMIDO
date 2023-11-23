package com.example.examplemod.items;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class FoodExample extends ItemFood {
    public FoodExample(){
        super(64, 4,false);
        setRegistryName("foodexample");
        setUnlocalizedName("foodexample");
        setCreativeTab(CreativeTabs.FOOD);
    }
}
