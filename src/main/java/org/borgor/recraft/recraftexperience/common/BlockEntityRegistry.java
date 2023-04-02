package org.borgor.recraft.recraftexperience.common;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.borgor.recraft.recraftexperience.ReCraftExperience;
import org.borgor.recraft.recraftexperience.block.entity.InfinityMatrixEntity;

public class BlockEntityRegistry {
    private static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ReCraftExperience.MODID);

    public static final RegistryObject<BlockEntityType<InfinityMatrixEntity>> INFINITY_MATRIX_ENTITY =
            BLOCK_ENTITIES.register("infinity_matrix_entity", () -> BlockEntityType.Builder.of(InfinityMatrixEntity::new,
                    BlockRegistry.INFINITY_MATRIX.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
