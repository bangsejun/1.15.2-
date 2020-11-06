package com.coldbreath.frost.entity.Entity.entity;


import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.world.World;
import software.bernie.geckolib.core.IAnimatable;
import software.bernie.geckolib.core.manager.AnimationData;
import software.bernie.geckolib.core.manager.AnimationFactory;

import javax.annotation.Nullable;

public class RabbitEntity extends AnimalEntity implements IAnimatable {

    public RabbitEntity(EntityType<RabbitEntity> type, World worldIn) {
        super(type, worldIn);
    }

    @Nullable
    @Override
    public AgeableEntity createChild(AgeableEntity ageable) {
        return null;
    }

    @Override
    public void registerControllers(AnimationData animationData) {

    }

    @Override
    public AnimationFactory getFactory() {
        return null;
    }
}
