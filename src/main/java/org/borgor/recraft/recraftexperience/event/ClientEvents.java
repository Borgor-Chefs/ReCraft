package org.borgor.recraft.recraftexperience.event;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.borgor.recraft.recraftexperience.ReCraftExperience;
import org.borgor.recraft.recraftexperience.common.BlockEntityRegistry;
import org.borgor.recraft.recraftexperience.entity.client.InfinityMatrixRenderer;
import org.jetbrains.annotations.NotNull;

@Mod.EventBusSubscriber(modid = ReCraftExperience.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEvents {
    @SubscribeEvent
    public static void registerRenderers(final EntityRenderersEvent.@NotNull RegisterRenderers event) {
        event.registerBlockEntityRenderer(BlockEntityRegistry.INFINITY_MATRIX_ENTITY.get(), InfinityMatrixRenderer::new);
    }
}
