package com.lexgamer.simplicity.Registry;

import com.lexgamer.simplicity.Simplicity;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BlockRegistry {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Simplicity.MODID);


    // Ruby
    public static final DeferredBlock<Block> RUBY_BLOCK = BLOCKS.registerSimpleBlock("ruby_block", BlockBehaviour.Properties.ofFullCopy(Blocks.EMERALD_BLOCK));
    public static final DeferredBlock<Block> RUBY_ORE = BLOCKS.registerSimpleBlock("ruby_ore", BlockBehaviour.Properties.ofFullCopy(Blocks.EMERALD_ORE));
    public static final DeferredBlock<Block> DEEPSLATE_RUBY_ORE = BLOCKS.registerSimpleBlock("deepslate_ruby_ore", BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_EMERALD_ORE));

    // Nether Bricks
    public static final DeferredBlock<Block> CHISELED_RED_NETHER_BRICKS = BLOCKS.registerSimpleBlock("chiseled_red_nether_bricks", BlockBehaviour.Properties.ofFullCopy(Blocks.CHISELED_NETHER_BRICKS));
    public static final DeferredBlock<Block> BLUE_NETHER_BRICKS = BLOCKS.registerSimpleBlock("blue_nether_bricks", BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS));
    public static final DeferredBlock<Block> CHISELED_BLUE_NETHER_BRICKS = BLOCKS.registerSimpleBlock("chiseled_blue_nether_bricks", BlockBehaviour.Properties.ofFullCopy(Blocks.CHISELED_NETHER_BRICKS));
    public static final DeferredBlock<Block> CRACKED_BLUE_NETHER_BRICKS = BLOCKS.registerSimpleBlock("cracked_blue_nether_bricks", BlockBehaviour.Properties.ofFullCopy(Blocks.CRACKED_NETHER_BRICKS));


}

