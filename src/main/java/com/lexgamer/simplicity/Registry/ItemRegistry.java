package com.lexgamer.simplicity.Registry;

import com.lexgamer.simplicity.Simplicity;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemRegistry {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Simplicity.MODID);

    public static final DeferredItem<BlockItem> RUBY_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("ruby_block", BlockRegistry.RUBY_BLOCK);
    public static final DeferredItem<Item> RUBY = ITEMS.registerItem("ruby", Item::new);

}
