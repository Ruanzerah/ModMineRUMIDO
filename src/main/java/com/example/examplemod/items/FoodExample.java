package com.example.examplemod.items;
import com.example.examplemod.ExampleMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class FoodExample extends ItemFood {
    public FoodExample(){
        super(1, 4,false);
        setRegistryName("foodexample");
        setUnlocalizedName("foodexample");
        setCreativeTab(CreativeTabs.FOOD);
        this.maxStackSize = 64;
        ExampleMod.initTexturesItems.add(this);
    }
}
