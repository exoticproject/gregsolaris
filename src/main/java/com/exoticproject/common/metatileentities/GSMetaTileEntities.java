package com.exoticproject.common.metatileentities;

import gregtech.api.GTValues;
import gregtech.api.util.GTLog;
import static gregtech.common.metatileentities.MetaTileEntities.registerMetaTileEntity;

import net.minecraft.util.ResourceLocation;

public class GSMetaTileEntities {
    public static PermanentLightSolarBoiler STEAM_BOILER_PERMANENT_LIGHT_SOLAR_BRONZE;
    public static PermanentLightSolarBoiler STEAM_BOILER_PERMANENT_LIGHT_SOLAR_STEEL;
    public static void init(){
        GTLog.logger.info("[GSolaris]Registering ExF MetatileEntities");

        STEAM_BOILER_PERMANENT_LIGHT_SOLAR_BRONZE = registerMetaTileEntity(11000, new PermanentLightSolarBoiler(gregtechId("steam_boiler_permanent_light_solar_bronze"),false));
        STEAM_BOILER_PERMANENT_LIGHT_SOLAR_STEEL = registerMetaTileEntity(11001, new PermanentLightSolarBoiler(gregtechId("steam_boiler_permanent_light_solar_steel"),true));

    }

    private static ResourceLocation gregtechId(String name) {
        return new ResourceLocation("gregsolaris", name);
    }
}
