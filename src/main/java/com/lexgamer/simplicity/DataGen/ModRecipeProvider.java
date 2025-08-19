package com.lexgamer.simplicity.DataGen;

import com.lexgamer.simplicity.Registry.BlockRegistry;
import com.lexgamer.simplicity.Registry.ItemRegistry;
import com.lexgamer.simplicity.Simplicity;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;

import java.util.concurrent.CompletableFuture;



public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(HolderLookup.Provider lookupProvider, RecipeOutput recipeOutput) {
        super(lookupProvider, recipeOutput);
    }



    @Override
    protected void buildRecipes() {

        HolderLookup.RegistryLookup<Item> registryLookup = this.registries.lookupOrThrow(Registries.ITEM);

        baseBlockRecipe(registryLookup, output, ItemRegistry.RUBY, BlockRegistry.RUBY_BLOCK.get());

    }

    public void baseBlockRecipe(HolderLookup.RegistryLookup<Item> registryLookup, RecipeOutput output, ItemLike ingredient, Block result) {
        ShapedRecipeBuilder.shaped(registryLookup, RecipeCategory.BUILDING_BLOCKS, result)
                .define('#', ingredient)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_" + ingredient.toString(), has(ingredient))
                .save(output);

        ShapelessRecipeBuilder.shapeless(registryLookup, RecipeCategory.MISC, ingredient, 9)
                .requires(result)
                .unlockedBy("has_" + result.toString(), has(result))
                .save(output, Simplicity.MODID + ":" + BuiltInRegistries.ITEM.getKey(ingredient.asItem()).getPath() + "_from_block");
    }

    public static final class Runner extends RecipeProvider.Runner {
        public Runner(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
            super(output, lookupProvider);
        }

        protected RecipeProvider createRecipeProvider(HolderLookup.Provider lookupProvider, RecipeOutput output) {
            return new ModRecipeProvider(lookupProvider, output);
        }

        public String getName() {
            return "Simplicity recipes";
        }

    }
}
