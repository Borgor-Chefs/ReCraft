package org.borgor.recraft.recraftexperience.misc;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.borgor.recraft.recraftexperience.blocks.BlockRegistry;

public class CreativeTabRegistry {
    public static final CreativeModeTab RECRAFT_EXPERIENCE_TAB = new CreativeModeTab("recraftexperiencetab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(BlockRegistry.INFINITY_MATRIX.get().asItem());
        }
    };
}
