package org.borgor.recraft.recraftexperience.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.borgor.recraft.recraftexperience.block.entity.InfinityMatrixEntity;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

public class InfinityMatrixRenderer extends GeoBlockRenderer<InfinityMatrixEntity> {
    public static final String MODEL_LOCATION = "geo/infinity_matrix.geo.json";
    public static final String TEXTURE_LOCATION = "textures/block/infinity_matrix.png";
    public static final String ANIMATION_LOCATION = "animations/infinity_matrix.animation.json";

    public InfinityMatrixRenderer(BlockEntityRendererProvider.Context rendererProvider) {
        super(rendererProvider, new AnimatedBlockModel<>(MODEL_LOCATION, TEXTURE_LOCATION, ANIMATION_LOCATION));
    }

    @Override
    public RenderType getRenderType(InfinityMatrixEntity animatable, float partialTick, PoseStack poseStack, @Nullable MultiBufferSource bufferSource, @Nullable VertexConsumer buffer, int packedLight, ResourceLocation texture) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }
}
