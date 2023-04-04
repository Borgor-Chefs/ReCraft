package org.borgor.recraft.recraftexperience.event;

import net.minecraft.client.Minecraft;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.ai.goal.WrappedGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.client.event.MovementInputUpdateEvent;
import net.minecraftforge.event.entity.living.MobEffectEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.borgor.recraft.recraftexperience.ReCraftExperience;
import org.borgor.recraft.recraftexperience.item.alchemy.effect.ConfusionEffect;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;

@Mod.EventBusSubscriber(modid = ReCraftExperience.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ForgeEvents {
    @SubscribeEvent
    public static void movementInputUpdate(final MovementInputUpdateEvent event) {
        Player player = Minecraft.getInstance().player;
        Optional<MobEffectInstance> confusedEffect;

        if (player == null)
            return;

        confusedEffect = player.getActiveEffects().stream().filter(effect -> effect.getEffect() instanceof ConfusionEffect).findFirst();

        if (confusedEffect.isPresent()) {
            boolean forward = event.getInput().up;
            boolean backward = event.getInput().down;
            boolean left = event.getInput().left;
            boolean right = event.getInput().right;

            event.getInput().up = backward;
            event.getInput().down = forward;
            event.getInput().left = right;
            event.getInput().right = left;

            if (confusedEffect.get().getAmplifier() == 1) {
                boolean jump = event.getInput().jumping;
                event.getInput().jumping = event.getInput().shiftKeyDown;
                event.getInput().shiftKeyDown = jump;
            }

            event.getInput().forwardImpulse *= -1;
            event.getInput().leftImpulse *= -1;
        }
    }

    @SubscribeEvent
    public static void mobEffectAdded(final MobEffectEvent.@NotNull Added event) {
        if (!(event.getEntity() instanceof Monster victim)) {
            return;
        }

        if (!(event.getEffectInstance().getEffect() instanceof ConfusionEffect effect)) {
            return;
        }

        victim.setTarget(null);
        effect.setPreviousGoals(victim);
        victim.targetSelector.removeAllGoals();
        victim.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(victim, Monster.class, true));
    }

    @SubscribeEvent
    public static void mobEffectExpired(final MobEffectEvent.@NotNull Expired event) {
        if (!(event.getEntity() instanceof Monster victim)) {
            return;
        }

        if (!(event.getEffectInstance().getEffect() instanceof ConfusionEffect effect)) {
            return;
        }

        if (effect.getPreviousGoals() == null) {
            return;
        }

        victim.targetSelector.removeAllGoals();
        for (WrappedGoal goal : effect.getPreviousGoals()) {
            victim.targetSelector.addGoal(goal.getPriority(), goal.getGoal());
        }

        victim.setTarget(null);
    }
}
