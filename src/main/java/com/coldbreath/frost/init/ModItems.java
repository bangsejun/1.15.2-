package com.coldbreath.frost.init;

import com.coldbreath.frost.Frost;
import com.coldbreath.frost.blocks.BlockItemBase;
import com.coldbreath.frost.items.ItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Frost.MOD_ID);

    //Items
    public static final RegistryObject<Item> FROZE = ITEMS.register("froze", ItemBase::new);

    // blockItems
    public static final RegistryObject<Item> FROZE_ORE_ITEM = ITEMS.register("frozeore",
            () -> new BlockItemBase(ModBlocks.FROZE_ORE.get()));
    public static final RegistryObject<Item> PORTAL_FRAME_ITEM = ITEMS.register("portalframe",
            () -> new BlockItemBase(ModBlocks.PORTAL_FRAME.get()));
}
