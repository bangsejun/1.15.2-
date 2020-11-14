package com.coldbreath.frost.init;

import com.coldbreath.frost.Frost;
import com.coldbreath.frost.entity.Entity.entity.RabbitEntity;
import net.minecraft.entity.*;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.network.FMLPlayMessages.SpawnEntity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.BiFunction;

public class ModEntity {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPE = DeferredRegister.create(ForgeRegistries.ENTITIES, Frost.MOD_ID);

    public static final RegistryObject<EntityType<RabbitEntity>> RABBIT = ModEntity.ENTITY_TYPE.register("rabbit", () -> createLivingEntity(RabbitEntity::new));

    public ModEntity() {
    }

    private static <E extends Entity> RegistryObject<EntityType<E>> registerEntityType(String name, EntityType.Builder<E> builder) {
        return ENTITY_TYPE.register(name, () -> builder.build("frost:" + name));
    }

    private static <T extends LivingEntity> EntityType<T> createLivingEntity(EntityType.IFactory<T> factory) {
        ResourceLocation location = new ResourceLocation("frost", "frost");
        return EntityType.Builder.create(factory, EntityClassification.CREATURE).size((float) 1.0, (float) 1.0).setTrackingRange(64).setShouldReceiveVelocityUpdates(true).setUpdateInterval(3).build(location.toString());
    }

    private static <T extends Entity> EntityType<T> createEntity(EntityType.IFactory<T> factory, BiFunction<SpawnEntity, World, T> clientFactory, EntityClassification entityClassification, String name, float width, float height) {
        ResourceLocation location = new ResourceLocation("frost", name);
        return EntityType.Builder.create(factory, entityClassification).size(width, height).setTrackingRange(64).setShouldReceiveVelocityUpdates(true).setUpdateInterval(3).setCustomClientFactory(clientFactory).build(location.toString());
    }

    private static <T extends LivingEntity> EntityType<T> createLivingNetherEntity(EntityType.IFactory<T> factory, EntityClassification entityClassification, String name, float width, float height) {
        ResourceLocation location = new ResourceLocation("frost", name);
        return EntityType.Builder.create(factory, entityClassification).size(width, height).setTrackingRange(64).setShouldReceiveVelocityUpdates(true).setUpdateInterval(3).func_225435_d().build(location.toString());
    }

    @SubscribeEvent
    public static void registerEntityTypes(RegistryEvent.Register<EntityType<?>> event) {
    }

    private static <T extends MobEntity> EntityType<T> build(String name, EntityType.Builder<T> builder, int eggPrimaryColor, int eggSecondaryColor) {
        EntityType<T> entityType = build(name, builder);
        return entityType;
    }

    private static <T extends Entity> EntityType<T> build(String name, EntityType.Builder<T> builder) {
        return null;
    }
}
