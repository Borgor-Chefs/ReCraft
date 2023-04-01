package org.borgor.recraft.recraftexperience.common;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.borgor.recraft.recraftexperience.ReCraftExperience;

public class PotionRegistry {
    private static final DeferredRegister<Potion> POTIONS =
            DeferredRegister.create(ForgeRegistries.POTIONS, ReCraftExperience.MODID);

    public static final RegistryObject<Potion> CONFUSION_POTION = POTIONS.register("confusion_potion",
            () -> new Potion(new MobEffectInstance(MobEffectRegistry.CONFUSION_EFFECT.get(), 600)));
    public static final RegistryObject<Potion> LONG_CONFUSION_POTION = POTIONS.register("long_confusion_potion",
            () -> new Potion(new MobEffectInstance(MobEffectRegistry.CONFUSION_EFFECT.get(), 1200)));
    public static final RegistryObject<Potion> STRONG_CONFUSION_POTION = POTIONS.register("strong_confusion_potion",
            () -> new Potion(new MobEffectInstance(MobEffectRegistry.CONFUSION_EFFECT.get(), 400, 1)));

    public static void register(IEventBus eventBus) {
        POTIONS.register(eventBus);
    }
}
