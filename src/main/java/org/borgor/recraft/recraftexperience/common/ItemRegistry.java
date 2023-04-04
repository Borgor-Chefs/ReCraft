package org.borgor.recraft.recraftexperience.common;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.borgor.recraft.recraftexperience.ReCraftExperience;
import org.borgor.recraft.recraftexperience.misc.CreativeTabRegistry;

import java.util.function.Supplier;

public class ItemRegistry {
    private static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ReCraftExperience.MODID);

    public static final RegistryObject<Item> INFINITY_INGOT = registerItem("infinity_ingot",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFT_EXPERIENCE_TAB)));

    public static <T extends Item> RegistryObject<T> registerItem(String name, Supplier<T> itemSupplier) {
        return ITEMS.register(name, itemSupplier);
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
