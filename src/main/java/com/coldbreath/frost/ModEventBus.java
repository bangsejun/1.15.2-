package com.coldbreath.frost;

import com.coldbreath.frost.entity.Client.RabbitRenderer;
import com.coldbreath.frost.entity.Entity.entity.RabbitEntity;
import com.coldbreath.frost.init.ModEntity;
import net.minecraft.entity.EntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(
        modid = "frost",
        bus = Bus.MOD,
        value = {Dist.CLIENT}
)
public class ModEventBus {
    public ModEventBus() {
    }

    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public static void registerEntityRenderer(FMLClientSetupEvent event) {
        RenderingRegistry.registerEntityRenderingHandler((EntityType<RabbitEntity>) ModEntity.RABBIT.get(), RabbitRenderer::new);
    }
}
