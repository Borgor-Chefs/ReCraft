package org.borgor.recraft.recraftedingots.blocks;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.borgor.recraft.recraftedingots.ReCraftedIngots;
import org.borgor.recraft.recraftedingots.items.ItemRegistry;
import org.borgor.recraft.recraftedingots.misc.CreativeTabRegistry;

import java.util.function.Supplier;

public class BlockRegistry {

    public static DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ReCraftedIngots.MODID);

    //Metal Blocks
    public static final RegistryObject<Block> ALUMINUM_BLOCK = registerBlock("aluminum_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(6f)));
    public static final RegistryObject<Block> BRASS_BLOCK = registerBlock("brass_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(6f)));
    public static final RegistryObject<Block> BRONZE_BLOCK = registerBlock("bronze_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(6f)));
    public static final RegistryObject<Block> ELECTRUM_BLOCK = registerBlock("electrum_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(6f)));
    public static final RegistryObject<Block> INVAR_BLOCK = registerBlock("invar_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(6f)));
    public static final RegistryObject<Block> LEAD_BLOCK = registerBlock("lead_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(6f)));
    public static final RegistryObject<Block> NICKEL_BLOCK = registerBlock("nickel_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(6f)));
    public static final RegistryObject<Block> OSMIUM_BLOCK = registerBlock("osmium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(6f)));
    public static final RegistryObject<Block> SILVER_BLOCK = registerBlock("silver_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(6f)));
    public static final RegistryObject<Block> TIN_BLOCK = registerBlock("tin_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(6f)));
    public static final RegistryObject<Block> URANIUM_BLOCK = registerBlock("uranium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(6f)));
    public static final RegistryObject<Block> ZINC_BLOCK = registerBlock("zinc_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(6f)));

    //Raw Ore Blocks
    public static final RegistryObject<Block> RAW_ALUMINUM_BLOCK = registerBlock("raw_aluminum_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(4f)));
    public static final RegistryObject<Block> RAW_COPPER_BLOCK = registerBlock("raw_copper_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(4f)));
    public static final RegistryObject<Block> RAW_GOLD_BLOCK = registerBlock("raw_gold_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(4f)));
    public static final RegistryObject<Block> RAW_LEAD_BLOCK = registerBlock("raw_lead_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(4f)));
    public static final RegistryObject<Block> RAW_NICKEL_BLOCK = registerBlock("raw_nickel_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(4f)));
    public static final RegistryObject<Block> RAW_OSMIUM_BLOCK = registerBlock("raw_osmium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(4f)));
    public static final RegistryObject<Block> RAW_SILVER_BLOCK = registerBlock("raw_silver_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(4f)));
    public static final RegistryObject<Block> RAW_TIN_BLOCK = registerBlock("raw_tin_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(4f)));
    public static final RegistryObject<Block> RAW_URANIUM_BLOCK = registerBlock("raw_uranium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(4f)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return ItemRegistry.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(CreativeTabRegistry.RECRAFTED_ORES_TAB)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
