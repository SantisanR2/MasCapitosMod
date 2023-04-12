package com.losmascapitos.mascapitosmod.init;

import com.losmascapitos.mascapitosmod.Mascapitosmod;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import java.util.List;

public class InitPlacedFeature {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURE =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, Mascapitosmod.MODID);

    public static final RegistryObject<PlacedFeature> PORUSITO_ORE = PLACED_FEATURE.register(
            "porusito_ore",
            () -> new PlacedFeature(InitConfigureFeaturePorusito.PORUSITO_ORE.getHolder().get(),
                    commonOrePlacement(5, HeightRangePlacement.triangle(
                            VerticalAnchor.bottom(),
                            VerticalAnchor.absolute(30)))
            ));

    private static List<PlacementModifier> commonOrePlacement(int countPerChunk, PlacementModifier height) {
        return List.of(CountPlacement.of(countPerChunk), InSquarePlacement.spread(), height, BiomeFilter.biome());
    }
}
