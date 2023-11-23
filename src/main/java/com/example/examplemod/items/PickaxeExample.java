package com.example.examplemod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class PickaxeExample extends ItemPickaxe {
    public PickaxeExample() {
        super(ToolMaterial.DIAMOND);
        setRegistryName("pickaxeexample");
        setUnlocalizedName("pickaxeexample");
        setCreativeTab(CreativeTabs.COMBAT);
    }
}
