package com.losmascapitos.mascapitosmod.init;

import com.losmascapitos.mascapitosmod.Mascapitosmod;
import com.google.common.base.Suppliers;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import java.util.List;
import java.util.function.Supplier;

public class InitConfigureFeaturePorusito {
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, Mascapitosmod.MODID);

    private static final Supplier<List<OreConfiguration.TargetBlockState>> ORES_CUSTOM_OVERWORLD_REPLACE =
            Suppliers.memoize(() -> List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, InitBlock.PORUSITO_BLOCK.get().defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, InitBlock.PORUSITO_BLOCK.get().defaultBlockState())
            ));

    public static final RegistryObject<ConfiguredFeature<?, ?>> PORUSITO_ORE = CONFIGURED_FEATURES.register(
            "porusito_ore", () -> new ConfiguredFeature<>(
                    Feature.ORE,
                    new OreConfiguration(ORES_CUSTOM_OVERWORLD_REPLACE.get(), 3))
    );
}