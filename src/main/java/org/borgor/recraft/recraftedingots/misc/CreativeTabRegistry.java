package org.borgor.recraft.recraftedingots.misc;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.borgor.recraft.recraftedingots.items.ItemRegistry;

public class CreativeTabRegistry {

    public static final CreativeModeTab RECRAFTED_ORES_TAB = new CreativeModeTab("recraftedingotstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemRegistry.IRON_DUST.get());
        }
    };

}
