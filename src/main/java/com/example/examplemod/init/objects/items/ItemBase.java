package com.example.examplemod.init.objects.items;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.init.ItemInit;
import com.example.examplemod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.TOOLS);

        ItemInit.ITEMS.add(this);
    }
    @Override
    public void registerModels() {
        ExampleMod.proxy.registerItemRenderer(this,0,"inventory");
    }
}
