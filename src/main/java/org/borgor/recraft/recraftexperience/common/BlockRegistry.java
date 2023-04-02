package org.borgor.recraft.recraftexperience.common;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.borgor.recraft.recraftexperience.ReCraftExperience;
import org.borgor.recraft.recraftexperience.block.InfinityMatrixBlock;
import org.borgor.recraft.recraftexperience.entity.client.InfinityMatrixRenderer;
import org.borgor.recraft.recraftexperience.item.AnimatedBlockItem;
import org.borgor.recraft.recraftexperience.misc.CreativeTabRegistry;

import java.util.function.Supplier;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ReCraftExperience.MODID);

    public static final RegistryObject<InfinityMatrixBlock> INFINITY_MATRIX = registerAnimatedBlock("infinity_matrix",
            () -> new InfinityMatrixBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion().lightLevel(value -> 7)),
            InfinityMatrixRenderer.MODEL_LOCATION, InfinityMatrixRenderer.TEXTURE_LOCATION,
            InfinityMatrixRenderer.ANIMATION_LOCATION);

    public static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> blockItem) {
        return ItemRegistry.registerItem(name, () ->
                new BlockItem(blockItem.get(), new Item.Properties().tab(CreativeTabRegistry.RECRAFT_EXPERIENCE_TAB)));
    }

    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> blockSupplier) {
        RegistryObject<T> blockRegistry = BLOCKS.register(name, blockSupplier);
        BlockRegistry.registerBlockItem(name, blockRegistry);
        return blockRegistry;
    }

    public static <T extends Block> RegistryObject<AnimatedBlockItem>
    registerAnimatedBlockItem(String name, RegistryObject<T> blockRegistry, String modelLocation, String textureLocation,
                              String animationLocation) {
        return ItemRegistry.registerItem(name, () -> new AnimatedBlockItem(blockRegistry.get(),
                new Item.Properties().tab(CreativeTabRegistry.RECRAFT_EXPERIENCE_TAB), modelLocation, textureLocation,
                animationLocation));
    }

    public static <T extends Block> RegistryObject<T>
    registerAnimatedBlock(String name, Supplier<T> blockSupplier, String modelLocation, String textureLocation,
                          String animationLocation) {
        RegistryObject<T> animatedBlockRegistry = BLOCKS.register(name, blockSupplier);
        registerAnimatedBlockItem(name, animatedBlockRegistry, modelLocation, textureLocation,
                animationLocation);
        return animatedBlockRegistry;
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
