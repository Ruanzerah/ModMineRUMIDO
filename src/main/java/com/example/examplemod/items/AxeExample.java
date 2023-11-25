package com.example.examplemod.items;

import com.example.examplemod.ExampleMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class AxeExample extends ItemAxe {
    public AxeExample(){
        super(ToolMaterial.DIAMOND);
        setRegistryName("axeexample");
        setUnlocalizedName("axeexample");
        setCreativeTab(CreativeTabs.TOOLS);
        setMaxDamage(12);
        ExampleMod.initTexturesItems.add(this);
    }

}
