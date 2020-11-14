package com.coldbreath.frost.entity.Client;

import com.coldbreath.frost.Frost;
import com.coldbreath.frost.entity.Entity.entity.RabbitEntity;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class RabbitRenderer extends EntityRenderer<RabbitEntity> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(Frost.MOD_ID, "textures/model/entity/rabbit.png");

    public RabbitRenderer(EntityRendererManager rendererManager) {
        super(rendererManager);
    }

    @Nullable
    @Override
    public ResourceLocation getEntityTexture(RabbitEntity entity) { return TEXTURE; }
}