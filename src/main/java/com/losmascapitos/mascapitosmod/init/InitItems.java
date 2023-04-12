package com.losmascapitos.mascapitosmod.init;


import com.losmascapitos.mascapitosmod.Mascapitosmod;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class InitItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(
        ForgeRegistries.ITEMS, Mascapitosmod.MODID
    );
}
