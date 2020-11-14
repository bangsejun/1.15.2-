package com.coldbreath.frost.entity.Entity.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.SegmentedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib.model.AnimatedGeoModel;

public class RabbitModel<T extends Entity> extends SegmentedModel<T> {
    public RabbitModel() {
        new AnimatedGeoModel() {
            @Override
            public ResourceLocation getAnimationFileLocation(Object o) {
                return null;
            }

            @Override
            public ResourceLocation getModelLocation(Object o) {
                return new ResourceLocation("frost", "geo/RabbitEntityModel.geo.json");
            }

            @Override
            public ResourceLocation getTextureLocation(Object o) {
                return new ResourceLocation("frost", "textures/model/entity/rabbit.png");
            }
        };
    }

    @Override
    public void func_225597_a_(T p_225597_1_, float p_225597_2_, float p_225597_3_, float p_225597_4_, float p_225597_5_, float p_225597_6_) {

    }

    @Override
    public void func_225598_a_(MatrixStack p_225598_1_, IVertexBuilder p_225598_2_, int p_225598_3_, int p_225598_4_, float p_225598_5_, float p_225598_6_, float p_225598_7_, float p_225598_8_) {

    }

    @Override
    public Iterable<ModelRenderer> func_225601_a_() {
        return null;
    }
}
