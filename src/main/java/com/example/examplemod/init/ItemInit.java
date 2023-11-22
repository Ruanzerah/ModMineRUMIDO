package com.example.examplemod.init;

import com.example.examplemod.init.objects.items.ItemBase;
import net.minecraft.item.Item;
import java.util.ArrayList;
import java.util.List;

public class ItemInit {
    public static final List<Item> ITEMS = new ArrayList<>();

    public static final Item MYSTERY_PICKAXE = new ItemBase("pickaxe_mystery");

}
