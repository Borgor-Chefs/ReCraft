package org.borgor.recraft.recraftexperience.block;

import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.borgor.recraft.recraftexperience.common.BlockEntityRegistry;
import org.borgor.recraft.recraftexperience.common.ParticleRegistry;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class InfinityMatrixBlock extends BaseEntityBlock {
    private static final VoxelShape COLLISION_BOX = Block.box(2, 2, 2, 14, 14, 14);
    private static final Double[] LIST_INIT = {3.0, 2.5, 2.0};

    private List<Double> vec;

    public InfinityMatrixBlock(Properties properties) {
        super(properties);
        vec = new ArrayList<>(Arrays.asList(LIST_INIT));
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter blockGetter, BlockPos pos, CollisionContext collisionContext) {
        return InfinityMatrixBlock.COLLISION_BOX;
    }

    @Override
    public void animateTick(BlockState state, Level level, BlockPos pos, @NotNull RandomSource random) {
        if (random.nextDouble() > 0.2) {
            return;
        }

        Collections.shuffle(vec);
        vec = vec.stream().map(val -> random.nextDouble() > 0.5 ? val * 1.0 : val * -1.0).collect(Collectors.toList());

        level.addParticle(random.nextDouble() > 0.5 ? ParticleRegistry.BINARY_ZERO.get() : ParticleRegistry.BINARY_ONE.get(),
                pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5,
                vec.get(0), vec.get(1), vec.get(2));

    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return BlockEntityRegistry.INFINITY_MATRIX_ENTITY.get().create(pos, state);
    }

    @Override
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.ENTITYBLOCK_ANIMATED;
    }
}
