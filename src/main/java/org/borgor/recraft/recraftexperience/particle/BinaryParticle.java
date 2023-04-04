package org.borgor.recraft.recraftexperience.particle;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.*;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.Nullable;

public class BinaryParticle extends TextureSheetParticle {

    public BinaryParticle(ClientLevel level, SpriteSet sprite, double xPos, double yPos, double zPos, double xDirection,
                          double yDirection, double zDirection) {
        super(level, xPos, yPos, zPos, xDirection, yDirection, zDirection);
        this.setSpriteFromAge(sprite);

        this.xd = xDirection;
        this.yd = yDirection;
        this.zd = zDirection;
        this.lifetime = 20;
        this.hasPhysics = false;
        this.quadSize = 0.1f;
    }

    @OnlyIn(Dist.CLIENT)
    public static class Provider implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet sprite;

        public Provider(SpriteSet sprite) {
            this.sprite = sprite;
        }

        @Nullable
        @Override
        public Particle createParticle(SimpleParticleType type, ClientLevel level, double xPos, double yPos, double zPos,
                                       double xDirection, double yDirection, double zDirection) {
            return new BinaryParticle(level, sprite, xPos, yPos, zPos, xDirection, yDirection, zDirection);
        }
    }

    @Override
    public ParticleRenderType getRenderType() {
        return ParticleRenderType.PARTICLE_SHEET_TRANSLUCENT;
    }
}
