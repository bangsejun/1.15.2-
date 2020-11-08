package com.coldbreath.frost;

import com.coldbreath.frost.init.ModBiomes;
import com.coldbreath.frost.init.ModBlocks;
import com.coldbreath.frost.init.ModEntityTypes;
import com.coldbreath.frost.init.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("frost")
public class Frost {
    public static Frost instance;

    public static final String MOD_ID = "frost";

    public Frost() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        bus.addListener(ServerListener::onSetup);
        ModBlocks.BLOCKS.register(bus);
        ModItems.ITEMS.register(bus);
        ModEntityTypes.ENTITY_TYPE.register(bus);
        ModBiomes.BIOMES.register(bus);
        instance = this;

    MinecraftForge.EVENT_BUS.register(this);
    }

    public static final ItemGroup TAB = new ItemGroup("frost") {

        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.FROZE.get());
        }
    };

    @SubscribeEvent
    public static void onRegisterBiomes(final RegistryEvent.Register<Biome> event) {
        ModBiomes.registerBiomes();
    }
}
