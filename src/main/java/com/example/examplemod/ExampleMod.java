package com.example.examplemod;
import com.example.examplemod.items.*;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.*;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import java.util.ArrayList;
import java.util.List;

@Mod(modid = ExampleMod.MODID, name = ExampleMod.NAME, version = ExampleMod.VERSION)
public class ExampleMod {
    public static final String MODID = "rmd";
    public static final String NAME = "RumidoModder";
    public static final String VERSION = "1.0";

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
    }
    public static List<Item> initTexturesItems = new ArrayList<>();

    @SubscribeEvent
    public void registerModels(ModelRegistryEvent event){
        initTexturesItems.forEach(item -> ModelLoader.setCustomModelResourceLocation(item, 0,
                new ModelResourceLocation(item.getRegistryName(), "inventory")));
    }

    @SubscribeEvent
    public void register(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new PickaxeExample());
        event.getRegistry().register(new SwordExample());
        event.getRegistry().register(new AxeExample());
        event.getRegistry().register(new FoodExample());
    }
}


