package com.example.examplemod;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.item.*;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import javax.annotation.ParametersAreNonnullByDefault;

@Mod(modid = ExampleMod.MODID, name = ExampleMod.NAME, version = ExampleMod.VERSION)
public class ExampleMod {
    public static final String MODID = "examplemod";
    public static final String NAME = "RumidoModder";
    public static final String VERSION = "1.0";

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
    }


    @SubscribeEvent
    public void registerModels(ModelRegistryEvent event){
        Item sword = new SwordExample();
        ModelLoader.setCustomModelResourceLocation(sword, 0, new ModelResourceLocation(sword.getRegistryName(), "inventory"));
    }

    @SubscribeEvent
    public void register(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new PickaxeExample());
        event.getRegistry().register(new SwordExample());
        event.getRegistry().register(new AxeExample());
    }
}

class PickaxeExample extends ItemPickaxe {
    public PickaxeExample() {
        super(ToolMaterial.DIAMOND);
        setRegistryName("pickaxeexample");
        setUnlocalizedName("pickaxeexample");
        setCreativeTab(CreativeTabs.COMBAT);
    }
}

class AxeExample extends ItemAxe{

    public AxeExample(){
        super(ToolMaterial.DIAMOND);
        setRegistryName("axeexample");
        setUnlocalizedName("axeexample");
        setCreativeTab(CreativeTabs.TOOLS);
        setMaxDamage(12);
    }
}


class SwordExample extends ItemSword {

    public SwordExample(){
        super(ToolMaterial.DIAMOND);
        setRegistryName("swordexample");
        setUnlocalizedName("swordexample");
        setCreativeTab(CreativeTabs.COMBAT);

    }

    @Override
    @ParametersAreNonnullByDefault
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        World world = target.world;
        world.addWeatherEffect(new EntityLightningBolt(world, target.posX,target.posY,target.posZ, false));
        return super.hitEntity(stack,target,attacker);
    }
}


