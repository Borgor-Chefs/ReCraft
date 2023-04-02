package org.borgor.recraft.recraftexperience.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.borgor.recraft.recraftexperience.common.BlockEntityRegistry;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.builder.ILoopType;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.util.GeckoLibUtil;

public class InfinityMatrixEntity extends BlockEntity implements IAnimatable {
    private final AnimationFactory factory = GeckoLibUtil.createFactory(this);

    public InfinityMatrixEntity(BlockPos pos, BlockState state) {
        super(BlockEntityRegistry.INFINITY_MATRIX_ENTITY.get(), pos, state);
    }

    private <T extends IAnimatable> PlayState predicate(@NotNull AnimationEvent<T> event) {
        event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.infinity_matrix.levitate",
                ILoopType.EDefaultLoopTypes.LOOP));

        return PlayState.CONTINUE;
    }

    @Override
    public void registerControllers(@NotNull AnimationData data) {
    data.addAnimationController(new AnimationController<>(this, "controller", 0, this::predicate));
    }

    @Override
    public AnimationFactory getFactory() {
        return factory;
    }
}
