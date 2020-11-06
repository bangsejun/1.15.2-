package com.coldbreath.frost.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class PortalFrame extends Block {

    public PortalFrame() {
        super(net.minecraft.block.Block.Properties.create(Material.PORTAL)
                .hardnessAndResistance(150000000000.0F,6.0f)
                .sound(SoundType.METAL)
                .harvestLevel(5)
                .harvestTool(ToolType.PICKAXE)


        );
    }
}
