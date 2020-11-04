package com.coldbreath.frost.entity.Entity.entity;


import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.world.World;
import software.bernie.geckolib.core.IAnimatable;
import software.bernie.geckolib.core.manager.AnimationData;
import software.bernie.geckolib.core.manager.AnimationFactory;

public class RabbitEntity extends MonsterEntity implements IAnimatable {
    private AnimationFactory controller;


    public RabbitEntity(EntityType<RabbitEntity> type, World worldIn) {
        super(type, worldIn);
        this.controller = new AnimationFactory(this);
    }

    protected boolean func_225511_J_() {
        return true;
    }

    @Override
    public void registerControllers(AnimationData animationData) {

    }

    public AnimationFactory getFactory() {
        return this.controller;
    }
}
