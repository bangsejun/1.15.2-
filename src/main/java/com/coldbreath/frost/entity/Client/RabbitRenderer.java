package com.coldbreath.frost.entity.Client;

import com.coldbreath.frost.entity.Entity.entity.RabbitEntity;
import com.coldbreath.frost.entity.Entity.model.RabbitModel;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib.renderers.geo.GeoEntityRenderer;

public class RabbitRenderer extends GeoEntityRenderer<RabbitEntity> {
    public RabbitRenderer(EntityRendererManager renderManager) {
        super(renderManager, new RabbitModel());
    }

    public RenderType getRenderType(RabbitEntity animatable, float partialTicks, MatrixStack stack, IRenderTypeBuffer renderTypeBuffer, IVertexBuilder vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
        stack.func_227862_a_(2.0F, 2.0F, 2.0F);
        return RenderType.func_228644_e_(this.getTextureLocation(animatable));
    }
}