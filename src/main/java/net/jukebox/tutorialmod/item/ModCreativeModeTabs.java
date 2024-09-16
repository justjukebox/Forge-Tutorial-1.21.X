package net.jukebox.tutorialmod.item;

import net.jukebox.tutorialmod.TutorialMod;
import net.jukebox.tutorialmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.awt.*;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CRADLE_ITEMS_TAB = CREATIVE_MODE_TABS.register("cradle_items_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.ALEXANDRITE.get()))
                    .title(Component.translatable("creativetab.tutorialmod.cradle.items"))
                    .displayItems((itemDisplayParameters, output) ->
                    {
                        output.accept(ModItems.ALEXANDRITE.get());
                    })
                    .build());
    public static final RegistryObject<CreativeModeTab> CRADLE_BLOCKS_TAB = CREATIVE_MODE_TABS.register("cradle_blocks_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.ALEXANDRITE.get()))
                    .withTabsBefore(CRADLE_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.tutorialmod.cradle.block"))
                    .displayItems((itemDisplayParameters, output) ->
                    {
                        output.accept(ModBlocks.ALEXANDRITE_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
