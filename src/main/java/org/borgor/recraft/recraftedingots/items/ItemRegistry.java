package org.borgor.recraft.recraftedingots.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.borgor.recraft.recraftedingots.ReCraftedIngots;
import org.borgor.recraft.recraftedingots.misc.CreativeTabRegistry;

public class ItemRegistry {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ReCraftedIngots.MODID);

    //Just an Example Item. No Texture or anything set up just making sure the mod loads.
    public static final RegistryObject<Item> TEST_ITEM = ITEMS.register("test_item",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    //Iron Texturing
    public static final RegistryObject<Item> IRON_DUST = ITEMS.register("iron_dust",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> IRON_GEAR = ITEMS.register("iron_gear",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> IRON_PLATE = ITEMS.register("iron_plate",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> IRON_ROD = ITEMS.register("iron_rod",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));

    //Gold Texturing
    public static final RegistryObject<Item> GOLD_DUST = ITEMS.register("gold_dust",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> GOLD_GEAR = ITEMS.register("gold_gear",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> GOLD_PLATE = ITEMS.register("gold_plate",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> GOLD_ROD = ITEMS.register("gold_rod",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> RAW_GOLD = ITEMS.register("raw_gold",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));

    //Copper Texturing
    public static final RegistryObject<Item> COPPER_DUST = ITEMS.register("copper_dust",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> COPPER_GEAR = ITEMS.register("copper_gear",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> COPPER_PLATE = ITEMS.register("copper_plate",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> COPPER_ROD = ITEMS.register("copper_rod",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> RAW_COPPER = ITEMS.register("raw_copper",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));

    //Zinc Texturing
    public static final RegistryObject<Item> ZINC_DUST = ITEMS.register("zinc_dust",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> ZINC_GEAR = ITEMS.register("zinc_gear",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> ZINC_PLATE = ITEMS.register("zinc_plate",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> ZINC_ROD = ITEMS.register("zinc_rod",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> RAW_ZINC = ITEMS.register("raw_zinc",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> ZINC_INGOT = ITEMS.register("zinc_ingot",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> ZINC_NUGGET = ITEMS.register("zinc_nugget",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));


    //Zinc Texturing
    public static final RegistryObject<Item> BRASS_DUST = ITEMS.register("brass_dust",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> BRASS_GEAR = ITEMS.register("brass_gear",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> BRASS_PLATE = ITEMS.register("brass_plate",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> BRASS_ROD = ITEMS.register("brass_rod",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> BRASS_INGOT = ITEMS.register("brass_ingot",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> BRASS_NUGGET = ITEMS.register("brass_nugget",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
