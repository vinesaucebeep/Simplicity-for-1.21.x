package com.lexgamer.simplicity.Registry;

import com.lexgamer.simplicity.Simplicity;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BlockRegistry {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Simplicity.MODID);

    public static final DeferredBlock<Block> RUBY_BLOCK = BLOCKS.registerSimpleBlock("ruby_block", BlockBehaviour.Properties.ofFullCopy(Blocks.EMERALD_BLOCK));
    public static final DeferredBlock<Block> RUBY_ORE = BLOCKS.registerSimpleBlock("ruby_ore", BlockBehaviour.Properties.ofFullCopy(Blocks.EMERALD_ORE));
    public static final DeferredBlock<Block> DEEPSLATE_RUBY_ORE = BLOCKS.registerSimpleBlock("deepslate_ruby_ore", BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_EMERALD_ORE));


}

