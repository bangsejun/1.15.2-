package com.coldbreath.frost;

import com.coldbreath.frost.init.ModBlocks;
import com.coldbreath.frost.init.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("frost")
public class Frost {

    public static final String MOD_ID = "frost";

    public Frost() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        ModBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    MinecraftForge.EVENT_BUS.register(this);
    }
    private void setup(final FMLCommonSetupEvent event) {    }

    private void doClientStuff(final FMLClientSetupEvent event) {    }

    public static final ItemGroup TAB = new ItemGroup("frost") {

        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.FROZE.get());
        }
    };

}
