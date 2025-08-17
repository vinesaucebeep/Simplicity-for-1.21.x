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
                        .add(BlockRegistry.RUBY_BLOCK.get());

        tag(BlockTags.NEEDS_IRON_TOOL).addTags()
                .add(BlockRegistry.RUBY_BLOCK.get());

    }
}
