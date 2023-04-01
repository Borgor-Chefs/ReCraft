package org.borgor.recraft.recraftexperience;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.borgor.recraft.recraftexperience.common.BlockRegistry;
import org.borgor.recraft.recraftexperience.common.MobEffectRegistry;
import org.borgor.recraft.recraftexperience.common.PotionRegistry;
import org.borgor.recraft.recraftexperience.event.PlayerMovementEvent;
import org.borgor.recraft.recraftexperience.common.ItemRegistry;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ReCraftExperience.MODID)
public class ReCraftExperience
{
    public static final String MODID = "recraftexperience";
    public static final Logger LOGGER = LogUtils.getLogger();

    public ReCraftExperience() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemRegistry.register(modEventBus);
        BlockRegistry.register(modEventBus);
        PotionRegistry.register(modEventBus);
        MobEffectRegistry.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
        PlayerMovementEvent.registerEvents();
    }
}
