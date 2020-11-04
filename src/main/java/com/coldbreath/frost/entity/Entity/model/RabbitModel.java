package com.coldbreath.frost.entity.Entity.model;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib.core.event.predicate.AnimationEvent;
import software.bernie.geckolib.model.AnimatedGeoModel;

public class RabbitModel<T extends LivingEntity> extends AnimatedGeoModel {
    public RabbitModel() {
    }

    public ResourceLocation getModelLocation(Object entity) {
        return new ResourceLocation("frost", "geo/RabbitEntityModel.geo.json");
    }
    public ResourceLocation getTextureLocation(Object entity) {
        return new ResourceLocation("frost", "textures/model/entity/rabbit.png");
    }

    @Override
    public void setLivingAnimations(Object o, Integer integer, AnimationEvent animationEvent) {

    }

    @Override
    public ResourceLocation getAnimationFileLocation(Object o) {
        return null;
    }
}
