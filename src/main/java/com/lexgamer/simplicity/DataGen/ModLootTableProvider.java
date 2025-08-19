package com.lexgamer.simplicity.DataGen;

import com.lexgamer.simplicity.Registry.BlockRegistry;
import com.lexgamer.simplicity.Registry.ItemRegistry;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.WritableRegistry;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.data.loot.packs.VanillaLootTableProvider;
import net.minecraft.util.ProblemReporter;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.neoforge.registries.DeferredHolder;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class ModLootTableProvider extends LootTableProvider
{
    private final List<SubProviderEntry> tables = List.of(new SubProviderEntry(ModBlockLootSubProvider::new, LootContextParamSets.BLOCK));

    public ModLootTableProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries)
    {
        super(packOutput, Set.of(), VanillaLootTableProvider.create(packOutput, registries).getTables(), registries);
    }

    @Override
    public List<SubProviderEntry> getTables()
    {
        return this.tables;
    }

    @Override
    protected void validate(WritableRegistry<LootTable> registry, ValidationContext context, ProblemReporter.Collector reporter)
    {
    }

    private static class ModBlockLootSubProvider extends BlockLootSubProvider
    {
        protected ModBlockLootSubProvider(HolderLookup.Provider provider)
        {
            super(Set.of(), FeatureFlags.REGISTRY.allFlags(), provider);
        }

        @Override
        protected void generate()
        {
            dropSelf(BlockRegistry.RUBY_BLOCK.get());

            dropSelf(BlockRegistry.CHISELED_RED_NETHER_BRICKS.get());
            dropSelf(BlockRegistry.BLUE_NETHER_BRICKS.get());
            dropSelf(BlockRegistry.CHISELED_BLUE_NETHER_BRICKS.get());
            dropSelf(BlockRegistry.CRACKED_BLUE_NETHER_BRICKS.get());

            add(BlockRegistry.RUBY_ORE.get(),
                    block -> createOreDrop(BlockRegistry.RUBY_ORE.get(), ItemRegistry.RUBY.get()));
            add(BlockRegistry.DEEPSLATE_RUBY_ORE.get(),
                    block -> createOreDrop(BlockRegistry.DEEPSLATE_RUBY_ORE.get(), ItemRegistry.RUBY.get()));

        }

        @Override
        protected Iterable<Block> getKnownBlocks()
        {
            return BlockRegistry.BLOCKS.getEntries().stream().map(DeferredHolder::get).collect(Collectors.toList());
        }
    }
}