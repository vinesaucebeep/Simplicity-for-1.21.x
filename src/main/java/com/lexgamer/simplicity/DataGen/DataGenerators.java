package com.lexgamer.simplicity.DataGen;

import com.lexgamer.simplicity.Simplicity;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = Simplicity.MODID, value = Dist.CLIENT)
public class DataGenerators {
    private DataGenerators() {

    }

    @SuppressWarnings("unused")
    @SubscribeEvent
    public static void onGatherData(final GatherDataEvent.Client event)
    {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        event.addProvider(new ModModelProvider(packOutput, Simplicity.MODID));
        event.addProvider(new ModLootTableProvider(packOutput, lookupProvider));
        event.addProvider(new ModTagsProvider(packOutput, lookupProvider, Simplicity.MODID));
        event.addProvider(new ModRecipeProvider.Runner(packOutput, lookupProvider));
    }
}
