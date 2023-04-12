package com.losmascapitos.mascapitosmod;

import com.losmascapitos.mascapitosmod.init.InitBlock;
import com.losmascapitos.mascapitosmod.init.InitConfigureFeaturePorusito;
import com.losmascapitos.mascapitosmod.init.InitItems;
import com.losmascapitos.mascapitosmod.init.InitPlacedFeature;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.IEventBus;

@Mod(Mascapitosmod.MODID)
public class Mascapitosmod {
    public static final String MODID = "mascapitosmod";

    public Mascapitosmod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        InitItems.ITEMS.register(bus);
        InitBlock.BLOCKS.register(bus);
        InitConfigureFeaturePorusito.CONFIGURED_FEATURES.register(bus);
        InitPlacedFeature.PLACED_FEATURE.register(bus);
    }

}
