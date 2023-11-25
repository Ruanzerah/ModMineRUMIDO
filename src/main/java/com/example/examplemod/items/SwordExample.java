package com.example.examplemod.items;
import com.example.examplemod.ExampleMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

import javax.annotation.ParametersAreNonnullByDefault;

public class SwordExample extends ItemSword {

    public SwordExample() {
        super(ToolMaterial.DIAMOND);
        setRegistryName("swordexample");
        setUnlocalizedName("swordexample");
        setCreativeTab(CreativeTabs.COMBAT);
        ExampleMod.initTexturesItems.add(this);
    }
    @Override
    @ParametersAreNonnullByDefault
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        World world = target.world;
        world.addWeatherEffect(new EntityLightningBolt(world, target.posX, target.posY, target.posZ, false));
        return super.hitEntity(stack, target, attacker);
    }

}
