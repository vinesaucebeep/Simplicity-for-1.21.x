package com.lexgamer.simplicity.DataGen;

import com.lexgamer.simplicity.Registry.BlockRegistry;
import com.lexgamer.simplicity.Registry.ItemRegistry;
import com.lexgamer.simplicity.Simplicity;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;

public class ModModelProvider extends ModelProvider {
    public ModModelProvider(PackOutput output, String modid) {
        super(output, Simplicity.MODID);
    }

    @Override
    protected  void registerModels(BlockModelGenerators blockModels,ItemModelGenerators itemModels) {
        blockModels.createTrivialCube(BlockRegistry.RUBY_BLOCK.get());
        blockModels.createTrivialCube(BlockRegistry.RUBY_ORE.get());
        blockModels.createTrivialCube(BlockRegistry.DEEPSLATE_RUBY_ORE.get());
        itemModels.generateFlatItem(ItemRegistry.RUBY.get(), ModelTemplates.FLAT_ITEM);
    }
}
