package com.exoticproject.common;

import com.exoticproject.common.metatileentities.GSMetaTileEntities;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod.EventBusSubscriber(modid = "gregsolaris")
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e) {
        GSMetaTileEntities.init();
    }

    public void init(FMLInitializationEvent e) {
    }

    public void postInit(FMLPostInitializationEvent e) {
    }

}
