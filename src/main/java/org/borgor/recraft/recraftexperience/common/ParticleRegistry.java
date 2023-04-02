package org.borgor.recraft.recraftexperience.common;

import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.borgor.recraft.recraftexperience.ReCraftExperience;

public class ParticleRegistry {
    private static final DeferredRegister<ParticleType<?>> PARTICLES =
            DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, ReCraftExperience.MODID);

    public static final RegistryObject<SimpleParticleType> BINARY_ZERO = PARTICLES.register("binary_0",
            () -> new SimpleParticleType(false));
    public static final RegistryObject<SimpleParticleType> BINARY_ONE = PARTICLES.register("binary_1",
            () -> new SimpleParticleType(false));

    public static void register(IEventBus eventBus) {
        PARTICLES.register(eventBus);
    }
}
