
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.allaboutengiethrowback.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.allaboutengiethrowback.world.features.ores.EngiOreFeature;
import net.mcreator.allaboutengiethrowback.world.features.ores.DeepslateEngiOreFeature;
import net.mcreator.allaboutengiethrowback.world.features.ores.CyberOreFeature;
import net.mcreator.allaboutengiethrowback.world.features.ores.BloodOreFeature;
import net.mcreator.allaboutengiethrowback.world.features.ThrowbackHouseSpawnerFeature;
import net.mcreator.allaboutengiethrowback.world.features.ThrowbackHouseFeature;
import net.mcreator.allaboutengiethrowback.AllAboutEngieThrowbackMod;

@Mod.EventBusSubscriber
public class AllAboutEngieThrowbackModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, AllAboutEngieThrowbackMod.MODID);
	public static final RegistryObject<Feature<?>> ENGI_ORE = REGISTRY.register("engi_ore", EngiOreFeature::feature);
	public static final RegistryObject<Feature<?>> DEEPSLATE_ENGI_ORE = REGISTRY.register("deepslate_engi_ore", DeepslateEngiOreFeature::feature);
	public static final RegistryObject<Feature<?>> THROWBACK_HOUSE = REGISTRY.register("throwback_house", ThrowbackHouseFeature::feature);
	public static final RegistryObject<Feature<?>> THROWBACK_HOUSE_SPAWNER = REGISTRY.register("throwback_house_spawner", ThrowbackHouseSpawnerFeature::feature);
	public static final RegistryObject<Feature<?>> CYBER_ORE = REGISTRY.register("cyber_ore", CyberOreFeature::feature);
	public static final RegistryObject<Feature<?>> BLOOD_ORE = REGISTRY.register("blood_ore", BloodOreFeature::feature);
}
