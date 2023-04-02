package org.borgor.recraft.recraftexperience.event;

import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.borgor.recraft.recraftexperience.ReCraftExperience;
import org.borgor.recraft.recraftexperience.common.ParticleRegistry;
import org.borgor.recraft.recraftexperience.particle.BinaryParticle;
import org.jetbrains.annotations.NotNull;

@Mod.EventBusSubscriber(modid = ReCraftExperience.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientServerEvents {
    @SubscribeEvent
    public static void registerParticleProviders(final @NotNull RegisterParticleProvidersEvent event) {
        event.register(ParticleRegistry.BINARY_ZERO.get(), BinaryParticle.Provider::new);
        event.register(ParticleRegistry.BINARY_ONE.get(), BinaryParticle.Provider::new);
    }
}
