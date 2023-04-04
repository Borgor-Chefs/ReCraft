package org.borgor.recraft.recraftexperience.block;

import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.borgor.recraft.recraftexperience.common.BlockEntityRegistry;
import org.borgor.recraft.recraftexperience.common.ParticleRegistry;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class InfinityMatrixBlock extends BaseEntityBlock {
    private static final VoxelShape COLLISION_BOX = Block.box(2, 2, 2, 14, 14, 14);

    public InfinityMatrixBlock(Properties properties) {
        super(properties);
    }

    private double randomDirection(@NotNull RandomSource random) {
        return (random.nextDouble() > 0.5 ? 1.0 : -1.0) * random.nextDouble() / 20.0D;
    }

    @Override
    public void animateTick(BlockState state, Level level, BlockPos pos, @NotNull RandomSource random) {
        if (random.nextDouble() > 0.6) {
            return;
        }

        level.addParticle(random.nextDouble() > 0.5 ? ParticleRegistry.BINARY_ZERO.get() : ParticleRegistry.BINARY_ONE.get(),
                pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5,
                randomDirection(random), randomDirection(random), randomDirection(random));
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return BlockEntityRegistry.INFINITY_MATRIX_ENTITY.get().create(pos, state);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter blockGetter, BlockPos pos, CollisionContext collisionContext) {
        return InfinityMatrixBlock.COLLISION_BOX;
    }

    @Override
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.ENTITYBLOCK_ANIMATED;
    }
}