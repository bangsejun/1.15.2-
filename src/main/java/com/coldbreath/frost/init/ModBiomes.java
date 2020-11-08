package com.coldbreath.frost.init;

import com.coldbreath.frost.Frost;
import com.coldbreath.frost.world.biomes.FrozenLand;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBiomes {
    public static final DeferredRegister<Biome> BIOMES = DeferredRegister.create(ForgeRegistries.BIOMES, Frost.MOD_ID);

    public static final RegistryObject<Biome> FROZEN_LAND = BIOMES.register("frozen_land", () -> new FrozenLand(new Biome.Builder().precipitation(Biome.RainType.SNOW).scale(1.2F).temperature(-10F).waterColor(3093116).waterFogColor(15532031).surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(ModBlocks.FROZE_ORE.get().getDefaultState(), ModBlocks.PORTAL_FRAME.get().getDefaultState(), Blocks.ACACIA_PLANKS.getDefaultState())).category(Biome.Category.PLAINS).downfall(0.5F).depth(0.12F).parent(null)));

    public static void registerBiomes() {
        registerBiome(FROZEN_LAND.get(), BiomeDictionary.Type.OVERWORLD, BiomeDictionary.Type.PLAINS);
    }

    private static void registerBiome(Biome biome, BiomeDictionary.Type... types) {
        BiomeDictionary.addTypes(biome, types);
        BiomeManager.addSpawnBiome(biome);
    }
}
