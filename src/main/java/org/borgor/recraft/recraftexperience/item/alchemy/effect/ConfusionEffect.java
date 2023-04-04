package org.borgor.recraft.recraftexperience.item.alchemy.effect;

import com.google.common.collect.Sets;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.goal.WrappedGoal;
import net.minecraft.world.entity.monster.Monster;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class ConfusionEffect extends MobEffect {
    private Set<WrappedGoal> previousGoals = null;

    public ConfusionEffect() {
        super(MobEffectCategory.HARMFUL, 0x444444);
    }

    public void setPreviousGoals(@NotNull Monster victim) {
        previousGoals = Sets.newLinkedHashSet(victim.targetSelector.getAvailableGoals());
    }

    public Set<WrappedGoal> getPreviousGoals() {
        return previousGoals;
    }
}
