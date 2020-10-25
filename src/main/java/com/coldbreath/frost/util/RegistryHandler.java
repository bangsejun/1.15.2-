package com.coldbreath.frost.util;

import com.coldbreath.frost.Frost;
import com.coldbreath.frost.blocks.BlockItemBase;
import com.coldbreath.frost.blocks.FrozeOre;
import com.coldbreath.frost.blocks.PortalFrame;
import com.coldbreath.frost.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Frost.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Frost.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Items
    public static final RegistryObject<Item> FROZE = ITEMS.register("froze", ItemBase::new);

    //Blocks
    public static final RegistryObject<Block> FROZE_ORE = BLOCKS.register("froze_ore", FrozeOre::new);

    //BlockItem
    public static final RegistryObject<Item> FROZE_ORE_ITEM = ITEMS.register("froze_ore", () -> new BlockItemBase(FROZE_ORE.get()));

    //Blocks
    public static final RegistryObject<Block> PORTAL_FRAME = BLOCKS.register("portal_frame", PortalFrame::new);

    //BlockItem
    public static final RegistryObject<Item> PORTAL_FRAME_ITEM = ITEMS.register("portal_frame", () -> new BlockItemBase(PORTAL_FRAME.get()));
}
