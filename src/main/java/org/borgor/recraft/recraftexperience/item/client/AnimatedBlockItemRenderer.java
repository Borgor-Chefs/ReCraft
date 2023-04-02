package org.borgor.recraft.recraftexperience.item.client;

import net.minecraft.world.item.BlockItem;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class AnimatedBlockItemRenderer<T extends BlockItem & IAnimatable> extends GeoItemRenderer<T> {
    public AnimatedBlockItemRenderer(AnimatedGeoModel<T> modelProvider) {
        super(modelProvider);
    }
}
