package com.coldbreath.frost.init;

import com.coldbreath.frost.Frost;
import com.coldbreath.frost.blocks.FrozeOre;
import com.coldbreath.frost.blocks.PortalFrame;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Frost.MOD_ID);

    //Blocks
    public static final RegistryObject<Block> FROZE_ORE = ModBlocks.BLOCKS.register("froze_ore", FrozeOre::new);
    public static final RegistryObject<Block> PORTAL_FRAME = ModBlocks.BLOCKS.register("portal_frame", PortalFrame::new);

}

