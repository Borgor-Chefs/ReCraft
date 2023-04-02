package org.borgor.recraft.recraftexperience.item;

import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import org.borgor.recraft.recraftexperience.item.client.AnimatedBlockItemModel;
import org.borgor.recraft.recraftexperience.item.client.AnimatedBlockItemRenderer;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.util.GeckoLibUtil;

import java.util.function.Consumer;

public class AnimatedBlockItem extends BlockItem implements IAnimatable {
    private final AnimationFactory factory = GeckoLibUtil.createFactory(this);
    private final BlockEntityWithoutLevelRenderer renderer;

    public AnimatedBlockItem(Block block, Properties properties, String modelLocation, String textureLocation, String animationLocation) {
        super(block, properties);
        renderer = new AnimatedBlockItemRenderer<>(
                new AnimatedBlockItemModel<AnimatedBlockItem>(modelLocation, textureLocation, animationLocation)
        );
    }

    private <T extends IAnimatable> PlayState predicate(@NotNull AnimationEvent<T> event) {
        return PlayState.CONTINUE;
    }

    @Override
    public void initializeClient(@NotNull Consumer<IClientItemExtensions> consumer) {
                consumer.accept(new IClientItemExtensions() {
                    @Override
                    public BlockEntityWithoutLevelRenderer getCustomRenderer() {
                        return renderer;
                    }
                });
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
