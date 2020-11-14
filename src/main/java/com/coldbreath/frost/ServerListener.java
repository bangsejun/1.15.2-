package com.coldbreath.frost;

import com.coldbreath.frost.init.ModEntity;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

import java.util.Iterator;

    @EventBusSubscriber(
            modid = "frost",
            bus = Bus.FORGE
    )
    public class ServerListener {
        public ServerListener() {

        }

        public static void onSetup(FMLCommonSetupEvent event) {
            RegistryObject var2;
            for (Iterator var1 = ModEntity.ENTITY_TYPE.getEntries().iterator();
                 var1.hasNext();
                 var2 = (RegistryObject) var1.next()) {
            }

        }
    }