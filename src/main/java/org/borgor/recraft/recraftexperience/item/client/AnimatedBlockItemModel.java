package org.borgor.recraft.recraftexperience.item.client;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import org.borgor.recraft.recraftexperience.ReCraftExperience;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class AnimatedBlockItemModel<T extends BlockItem & IAnimatable> extends AnimatedGeoModel<T> {
    private final ResourceLocation modelResource;
    private final ResourceLocation textureResource;
    private final ResourceLocation animationResource;

    public AnimatedBlockItemModel(String modelLocation, String textureLocation, String animationLocation) {
        modelResource = new ResourceLocation(ReCraftExperience.MODID, modelLocation);
        textureResource = new ResourceLocation(ReCraftExperience.MODID, textureLocation);
        animationResource = new ResourceLocation(ReCraftExperience.MODID, animationLocation);
    }

    @Override
    public ResourceLocation getModelResource(T object) {
        return modelResource;
    }

    @Override
    public ResourceLocation getTextureResource(T object) {
        return textureResource;
    }

    @Override
    public ResourceLocation getAnimationResource(T animatable) {
        return animationResource;
    }
}
