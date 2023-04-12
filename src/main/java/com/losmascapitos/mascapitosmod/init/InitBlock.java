package com.losmascapitos.mascapitosmod.init;

import com.losmascapitos.mascapitosmod.Mascapitosmod;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class InitBlock {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Mascapitosmod.MODID);

    private static <T extends Block> RegistryObject<T> register(
            String name,
            Supplier<T> supplier,
            Item.Properties properties) {
        RegistryObject<T> block = BLOCKS.register(name, supplier);
        InitItems.ITEMS.register(name, () -> new BlockItem(block.get(), properties));
        return block;
    }

    public static final RegistryObject<Block> PORUSITO_BLOCK = register("porusito_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(5.0f).requiresCorrectToolForDrops()),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> GARASNITA_BLOCK = register("garasnita_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(5.0f).requiresCorrectToolForDrops()),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> SANTINITA_BLOCK = register("santinita_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(5.0f).requiresCorrectToolForDrops()),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
}
