package com.lexgamer.simplicity.DataGen;

import com.lexgamer.simplicity.Registry.BlockRegistry;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;

import java.util.concurrent.CompletableFuture;

public class ModTagsProvider extends BlockTagsProvider {
    public ModTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries, String modId)
    {
        super(output, registries, modId);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        tag(BlockTags.MINEABLE_WITH_PICKAXE).addTags()
                .add(BlockRegistry.RUBY_ORE.get())
                .add(BlockRegistry.DEEPSLATE_RUBY_ORE.get())
                .add(BlockRegistry.RUBY_BLOCK.get())

                .add(BlockRegistry.CHISELED_RED_NETHER_BRICKS.get())
                .add(BlockRegistry.BLUE_NETHER_BRICKS.get())
                .add(BlockRegistry.CHISELED_BLUE_NETHER_BRICKS.get())
                .add(BlockRegistry.CRACKED_BLUE_NETHER_BRICKS.get());

        tag(BlockTags.NEEDS_IRON_TOOL).addTags()
                .add(BlockRegistry.RUBY_ORE.get())
                .add(BlockRegistry.DEEPSLATE_RUBY_ORE.get())
                .add(BlockRegistry.RUBY_BLOCK.get());

        tag(BlockTags.NEEDS_STONE_TOOL).addTags()
                .add(BlockRegistry.CHISELED_RED_NETHER_BRICKS.get())
                .add(BlockRegistry.BLUE_NETHER_BRICKS.get())
                .add(BlockRegistry.CHISELED_BLUE_NETHER_BRICKS.get())
                .add(BlockRegistry.CRACKED_BLUE_NETHER_BRICKS.get());

    }
}
