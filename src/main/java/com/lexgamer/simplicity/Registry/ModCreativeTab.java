package com.lexgamer.simplicity.Registry;

import com.lexgamer.simplicity.Simplicity;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeTab {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Simplicity.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> SIMPLICITY_TAB = CREATIVE_MODE_TABS.register("simplicity_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.simplicity"))
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> ItemRegistry.RUBY_BLOCK_ITEM.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(ItemRegistry.RUBY_BLOCK_ITEM.get());
                output.accept(ItemRegistry.RUBY_ORE_BLOCK_ITEM);
                output.accept(ItemRegistry.DEEPSLATE_RUBY_ORE_BLOCK_ITEM);
                output.accept(ItemRegistry.BLUE_NETHER_BRICKS_ITEM);
                output.accept(ItemRegistry.CHISELED_RED_NETHER_BRICKS_ITEM);
                output.accept(ItemRegistry.CHISELED_BLUE_NETHER_BRICKS_ITEM);
                output.accept(ItemRegistry.CRACKED_BLUE_NETHER_BRICKS_ITEM);
                output.accept(ItemRegistry.RUBY);
            }).build());
}
