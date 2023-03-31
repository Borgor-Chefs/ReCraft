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

    //Silver Texturing
    public static final RegistryObject<Item> SILVER_DUST = ITEMS.register("silver_dust",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> SILVER_GEAR = ITEMS.register("silver_gear",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> SILVER_PLATE = ITEMS.register("silver_plate",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> SILVER_ROD = ITEMS.register("silver_rod",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));

    //Lead Texturing
    public static final RegistryObject<Item> LEAD_DUST = ITEMS.register("lead_dust",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> LEAD_GEAR = ITEMS.register("lead_gear",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> LEAD_PLATE = ITEMS.register("lead_plate",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> LEAD_ROD = ITEMS.register("lead_rod",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> RAW_LEAD = ITEMS.register("raw_lead",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));

    //Tin Texturing
    public static final RegistryObject<Item> TIN_DUST = ITEMS.register("tin_dust",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> TIN_GEAR = ITEMS.register("tin_gear",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> TIN_PLATE = ITEMS.register("tin_plate",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> TIN_ROD = ITEMS.register("tin_rod",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));

    //Steel Texturing
    public static final RegistryObject<Item> STEEL_DUST = ITEMS.register("steel_dust",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> STEEL_GEAR = ITEMS.register("steel_gear",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> STEEL_PLATE = ITEMS.register("steel_plate",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));

    //Aluminum Texturing
    public static final RegistryObject<Item> ALUMINUM_DUST = ITEMS.register("aluminum_dust",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> ALUMINUM_GEAR = ITEMS.register("aluminum_gear",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> ALUMINUM_PLATE = ITEMS.register("aluminum_plate",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> ALUMINUM_ROD = ITEMS.register("aluminum_rod",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> RAW_ALUMINUM = ITEMS.register("raw_aluminum",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));

    // Osmium Texturing
    public static final RegistryObject<Item> OSMIUM_DUST = ITEMS.register("osmium_dust",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> OSMIUM_GEAR = ITEMS.register("osmium_gear",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> OSMIUM_PLATE = ITEMS.register("osmium_plate",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> OSMIUM_ROD = ITEMS.register("osmium_rod",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> OSMIUM_INGOT = ITEMS.register("osmium_ingot",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> OSMIUM_NUGGET = ITEMS.register("osmium_nugget",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> RAW_OSMIUM = ITEMS.register("raw_osmium",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));

    // Uranium Texturing
    public static final RegistryObject<Item> URANIUM_DUST = ITEMS.register("uranium_dust",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> URANIUM_ROD = ITEMS.register("uranium_rod",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> URANIUM_INGOT = ITEMS.register("uranium_ingot",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> URANIUM_NUGGET = ITEMS.register("uranium_nugget",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> RAW_URANIUM = ITEMS.register("raw_uranium",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));

    // Electrum Texturing
    public static final RegistryObject<Item> ELECTRUM_DUST = ITEMS.register("electrum_dust",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> ELECTRUM_GEAR = ITEMS.register("electrum_gear",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> ELECTRUM_PLATE = ITEMS.register("electrum_plate",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> ELECTRUM_ROD = ITEMS.register("electrum_rod",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> ELECTRUM_INGOT = ITEMS.register("electrum_ingot",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> ELECTRUM_NUGGET = ITEMS.register("electrum_nugget",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));

    // Nickel Texturing
    public static final RegistryObject<Item> NICKEL_DUST = ITEMS.register("nickel_dust",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> NICKEL_GEAR = ITEMS.register("nickel_gear",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> NICKEL_PLATE = ITEMS.register("nickel_plate",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> NICKEL_ROD = ITEMS.register("nickel_rod",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> NICKEL_NUGGET = ITEMS.register("nickel_nugget",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    public static final RegistryObject<Item> RAW_NICKEL = ITEMS.register("raw_nickel",
            () -> new Item(new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
