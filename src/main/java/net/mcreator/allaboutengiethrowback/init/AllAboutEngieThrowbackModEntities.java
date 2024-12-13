
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.allaboutengiethrowback.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.allaboutengiethrowback.entity.SharkoTamedEntity;
import net.mcreator.allaboutengiethrowback.entity.SharkoLayEntity;
import net.mcreator.allaboutengiethrowback.entity.SharkoEntity;
import net.mcreator.allaboutengiethrowback.entity.RareSharkoTamedEntity;
import net.mcreator.allaboutengiethrowback.entity.RareSharkoLayEntity;
import net.mcreator.allaboutengiethrowback.entity.RareSharkoEntity;
import net.mcreator.allaboutengiethrowback.entity.RareEngieSharkoTamedEntity;
import net.mcreator.allaboutengiethrowback.entity.RareEngieSharkoTamed2Entity;
import net.mcreator.allaboutengiethrowback.entity.RareEngieSharkoLayEntity;
import net.mcreator.allaboutengiethrowback.entity.RareEngieSharkoLay2Entity;
import net.mcreator.allaboutengiethrowback.entity.RareEngieSharkoEntity;
import net.mcreator.allaboutengiethrowback.entity.RareEngieSharko2Entity;
import net.mcreator.allaboutengiethrowback.entity.QuizEntity;
import net.mcreator.allaboutengiethrowback.entity.ProtogenEntity;
import net.mcreator.allaboutengiethrowback.entity.MythicSharkoTamedEntity;
import net.mcreator.allaboutengiethrowback.entity.MythicSharkoLayEntity;
import net.mcreator.allaboutengiethrowback.entity.MythicSharkoEntity;
import net.mcreator.allaboutengiethrowback.entity.MadEngiEntity;
import net.mcreator.allaboutengiethrowback.entity.LegendarySharkoTamedEntity;
import net.mcreator.allaboutengiethrowback.entity.LegendarySharkoLayEntity;
import net.mcreator.allaboutengiethrowback.entity.LegendarySharkoEntity;
import net.mcreator.allaboutengiethrowback.entity.ExoticSharkoTamedEntity;
import net.mcreator.allaboutengiethrowback.entity.ExoticSharkoLayEntity;
import net.mcreator.allaboutengiethrowback.entity.ExoticSharkoEntity;
import net.mcreator.allaboutengiethrowback.entity.EnragedEngiEntity;
import net.mcreator.allaboutengiethrowback.entity.EngieSharkoTamedEntity;
import net.mcreator.allaboutengiethrowback.entity.EngieSharkoLayEntity;
import net.mcreator.allaboutengiethrowback.entity.EngieSharkoEntity;
import net.mcreator.allaboutengiethrowback.entity.EngiEntity;
import net.mcreator.allaboutengiethrowback.entity.DevEngiEntity;
import net.mcreator.allaboutengiethrowback.entity.CreatorEntity;
import net.mcreator.allaboutengiethrowback.entity.BloodyEngiEntity;
import net.mcreator.allaboutengiethrowback.entity.AngryEngiEntity;
import net.mcreator.allaboutengiethrowback.entity.AngryCreatorEntity;
import net.mcreator.allaboutengiethrowback.entity.AlbinoSharkoTamedEntity;
import net.mcreator.allaboutengiethrowback.entity.AlbinoSharkoLayEntity;
import net.mcreator.allaboutengiethrowback.entity.AlbinoSharkoEntity;
import net.mcreator.allaboutengiethrowback.AllAboutEngieThrowbackMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AllAboutEngieThrowbackModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, AllAboutEngieThrowbackMod.MODID);
	public static final RegistryObject<EntityType<SharkoEntity>> SHARKO = register("sharko",
			EntityType.Builder.<SharkoEntity>of(SharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<SharkoTamedEntity>> SHARKO_TAMED = register("sharko_tamed",
			EntityType.Builder.<SharkoTamedEntity>of(SharkoTamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SharkoTamedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SharkoLayEntity>> SHARKO_LAY = register("sharko_lay",
			EntityType.Builder.<SharkoLayEntity>of(SharkoLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SharkoLayEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<AlbinoSharkoEntity>> ALBINO_SHARKO = register("albino_sharko",
			EntityType.Builder.<AlbinoSharkoEntity>of(AlbinoSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AlbinoSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<AlbinoSharkoTamedEntity>> ALBINO_SHARKO_TAMED = register("albino_sharko_tamed",
			EntityType.Builder.<AlbinoSharkoTamedEntity>of(AlbinoSharkoTamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AlbinoSharkoTamedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AlbinoSharkoLayEntity>> ALBINO_SHARKO_LAY = register("albino_sharko_lay",
			EntityType.Builder.<AlbinoSharkoLayEntity>of(AlbinoSharkoLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AlbinoSharkoLayEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<RareSharkoEntity>> RARE_SHARKO = register("rare_sharko",
			EntityType.Builder.<RareSharkoEntity>of(RareSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RareSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<RareSharkoTamedEntity>> RARE_SHARKO_TAMED = register("rare_sharko_tamed",
			EntityType.Builder.<RareSharkoTamedEntity>of(RareSharkoTamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RareSharkoTamedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RareSharkoLayEntity>> RARE_SHARKO_LAY = register("rare_sharko_lay",
			EntityType.Builder.<RareSharkoLayEntity>of(RareSharkoLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RareSharkoLayEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<LegendarySharkoEntity>> LEGENDARY_SHARKO = register("legendary_sharko",
			EntityType.Builder.<LegendarySharkoEntity>of(LegendarySharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LegendarySharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<LegendarySharkoTamedEntity>> LEGENDARY_SHARKO_TAMED = register("legendary_sharko_tamed",
			EntityType.Builder.<LegendarySharkoTamedEntity>of(LegendarySharkoTamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(LegendarySharkoTamedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<LegendarySharkoLayEntity>> LEGENDARY_SHARKO_LAY = register("legendary_sharko_lay",
			EntityType.Builder.<LegendarySharkoLayEntity>of(LegendarySharkoLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LegendarySharkoLayEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<MythicSharkoEntity>> MYTHIC_SHARKO = register("mythic_sharko",
			EntityType.Builder.<MythicSharkoEntity>of(MythicSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MythicSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<MythicSharkoTamedEntity>> MYTHIC_SHARKO_TAMED = register("mythic_sharko_tamed",
			EntityType.Builder.<MythicSharkoTamedEntity>of(MythicSharkoTamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MythicSharkoTamedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MythicSharkoLayEntity>> MYTHIC_SHARKO_LAY = register("mythic_sharko_lay",
			EntityType.Builder.<MythicSharkoLayEntity>of(MythicSharkoLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MythicSharkoLayEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<ExoticSharkoEntity>> EXOTIC_SHARKO = register("exotic_sharko",
			EntityType.Builder.<ExoticSharkoEntity>of(ExoticSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ExoticSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<ExoticSharkoTamedEntity>> EXOTIC_SHARKO_TAMED = register("exotic_sharko_tamed",
			EntityType.Builder.<ExoticSharkoTamedEntity>of(ExoticSharkoTamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ExoticSharkoTamedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ExoticSharkoLayEntity>> EXOTIC_SHARKO_LAY = register("exotic_sharko_lay",
			EntityType.Builder.<ExoticSharkoLayEntity>of(ExoticSharkoLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ExoticSharkoLayEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<EngieSharkoEntity>> ENGIE_SHARKO = register("engie_sharko",
			EntityType.Builder.<EngieSharkoEntity>of(EngieSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EngieSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<EngieSharkoTamedEntity>> ENGIE_SHARKO_TAMED = register("engie_sharko_tamed",
			EntityType.Builder.<EngieSharkoTamedEntity>of(EngieSharkoTamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EngieSharkoTamedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EngieSharkoLayEntity>> ENGIE_SHARKO_LAY = register("engie_sharko_lay",
			EntityType.Builder.<EngieSharkoLayEntity>of(EngieSharkoLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EngieSharkoLayEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<RareEngieSharkoEntity>> RARE_ENGIE_SHARKO = register("rare_engie_sharko",
			EntityType.Builder.<RareEngieSharkoEntity>of(RareEngieSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RareEngieSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<RareEngieSharkoTamedEntity>> RARE_ENGIE_SHARKO_TAMED = register("rare_engie_sharko_tamed",
			EntityType.Builder.<RareEngieSharkoTamedEntity>of(RareEngieSharkoTamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(RareEngieSharkoTamedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RareEngieSharkoLayEntity>> RARE_ENGIE_SHARKO_LAY = register("rare_engie_sharko_lay",
			EntityType.Builder.<RareEngieSharkoLayEntity>of(RareEngieSharkoLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RareEngieSharkoLayEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<RareEngieSharko2Entity>> RARE_ENGIE_SHARKO_2 = register("rare_engie_sharko_2",
			EntityType.Builder.<RareEngieSharko2Entity>of(RareEngieSharko2Entity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RareEngieSharko2Entity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<RareEngieSharkoTamed2Entity>> RARE_ENGIE_SHARKO_TAMED_2 = register("rare_engie_sharko_tamed_2",
			EntityType.Builder.<RareEngieSharkoTamed2Entity>of(RareEngieSharkoTamed2Entity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(RareEngieSharkoTamed2Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RareEngieSharkoLay2Entity>> RARE_ENGIE_SHARKO_LAY_2 = register("rare_engie_sharko_lay_2",
			EntityType.Builder.<RareEngieSharkoLay2Entity>of(RareEngieSharkoLay2Entity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RareEngieSharkoLay2Entity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<EngiEntity>> ENGI = register("engi",
			EntityType.Builder.<EngiEntity>of(EngiEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EngiEntity::new)

					.sized(0.6f, 2f));
	public static final RegistryObject<EntityType<CreatorEntity>> CREATOR = register("creator",
			EntityType.Builder.<CreatorEntity>of(CreatorEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CreatorEntity::new)

					.sized(0.6f, 2f));
	public static final RegistryObject<EntityType<ProtogenEntity>> PROTOGEN = register("protogen",
			EntityType.Builder.<ProtogenEntity>of(ProtogenEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ProtogenEntity::new)

					.sized(0.6f, 2f));
	public static final RegistryObject<EntityType<DevEngiEntity>> DEV_ENGI = register("dev_engi",
			EntityType.Builder.<DevEngiEntity>of(DevEngiEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DevEngiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<QuizEntity>> QUIZ = register("quiz",
			EntityType.Builder.<QuizEntity>of(QuizEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(QuizEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MadEngiEntity>> MAD_ENGI = register("mad_engi",
			EntityType.Builder.<MadEngiEntity>of(MadEngiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MadEngiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AngryEngiEntity>> ANGRY_ENGI = register("angry_engi",
			EntityType.Builder.<AngryEngiEntity>of(AngryEngiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AngryEngiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedEngiEntity>> ENRAGED_ENGI = register("enraged_engi",
			EntityType.Builder.<EnragedEngiEntity>of(EnragedEngiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedEngiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AngryCreatorEntity>> ANGRY_CREATOR = register("angry_creator",
			EntityType.Builder.<AngryCreatorEntity>of(AngryCreatorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AngryCreatorEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BloodyEngiEntity>> BLOODY_ENGI = register("bloody_engi",
			EntityType.Builder.<BloodyEngiEntity>of(BloodyEngiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BloodyEngiEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			SharkoEntity.init();
			SharkoTamedEntity.init();
			SharkoLayEntity.init();
			AlbinoSharkoEntity.init();
			AlbinoSharkoTamedEntity.init();
			AlbinoSharkoLayEntity.init();
			RareSharkoEntity.init();
			RareSharkoTamedEntity.init();
			RareSharkoLayEntity.init();
			LegendarySharkoEntity.init();
			LegendarySharkoTamedEntity.init();
			LegendarySharkoLayEntity.init();
			MythicSharkoEntity.init();
			MythicSharkoTamedEntity.init();
			MythicSharkoLayEntity.init();
			ExoticSharkoEntity.init();
			ExoticSharkoTamedEntity.init();
			ExoticSharkoLayEntity.init();
			EngieSharkoEntity.init();
			EngieSharkoTamedEntity.init();
			EngieSharkoLayEntity.init();
			RareEngieSharkoEntity.init();
			RareEngieSharkoTamedEntity.init();
			RareEngieSharkoLayEntity.init();
			RareEngieSharko2Entity.init();
			RareEngieSharkoTamed2Entity.init();
			RareEngieSharkoLay2Entity.init();
			EngiEntity.init();
			CreatorEntity.init();
			ProtogenEntity.init();
			DevEngiEntity.init();
			QuizEntity.init();
			MadEngiEntity.init();
			AngryEngiEntity.init();
			EnragedEngiEntity.init();
			AngryCreatorEntity.init();
			BloodyEngiEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(SHARKO.get(), SharkoEntity.createAttributes().build());
		event.put(SHARKO_TAMED.get(), SharkoTamedEntity.createAttributes().build());
		event.put(SHARKO_LAY.get(), SharkoLayEntity.createAttributes().build());
		event.put(ALBINO_SHARKO.get(), AlbinoSharkoEntity.createAttributes().build());
		event.put(ALBINO_SHARKO_TAMED.get(), AlbinoSharkoTamedEntity.createAttributes().build());
		event.put(ALBINO_SHARKO_LAY.get(), AlbinoSharkoLayEntity.createAttributes().build());
		event.put(RARE_SHARKO.get(), RareSharkoEntity.createAttributes().build());
		event.put(RARE_SHARKO_TAMED.get(), RareSharkoTamedEntity.createAttributes().build());
		event.put(RARE_SHARKO_LAY.get(), RareSharkoLayEntity.createAttributes().build());
		event.put(LEGENDARY_SHARKO.get(), LegendarySharkoEntity.createAttributes().build());
		event.put(LEGENDARY_SHARKO_TAMED.get(), LegendarySharkoTamedEntity.createAttributes().build());
		event.put(LEGENDARY_SHARKO_LAY.get(), LegendarySharkoLayEntity.createAttributes().build());
		event.put(MYTHIC_SHARKO.get(), MythicSharkoEntity.createAttributes().build());
		event.put(MYTHIC_SHARKO_TAMED.get(), MythicSharkoTamedEntity.createAttributes().build());
		event.put(MYTHIC_SHARKO_LAY.get(), MythicSharkoLayEntity.createAttributes().build());
		event.put(EXOTIC_SHARKO.get(), ExoticSharkoEntity.createAttributes().build());
		event.put(EXOTIC_SHARKO_TAMED.get(), ExoticSharkoTamedEntity.createAttributes().build());
		event.put(EXOTIC_SHARKO_LAY.get(), ExoticSharkoLayEntity.createAttributes().build());
		event.put(ENGIE_SHARKO.get(), EngieSharkoEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_TAMED.get(), EngieSharkoTamedEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_LAY.get(), EngieSharkoLayEntity.createAttributes().build());
		event.put(RARE_ENGIE_SHARKO.get(), RareEngieSharkoEntity.createAttributes().build());
		event.put(RARE_ENGIE_SHARKO_TAMED.get(), RareEngieSharkoTamedEntity.createAttributes().build());
		event.put(RARE_ENGIE_SHARKO_LAY.get(), RareEngieSharkoLayEntity.createAttributes().build());
		event.put(RARE_ENGIE_SHARKO_2.get(), RareEngieSharko2Entity.createAttributes().build());
		event.put(RARE_ENGIE_SHARKO_TAMED_2.get(), RareEngieSharkoTamed2Entity.createAttributes().build());
		event.put(RARE_ENGIE_SHARKO_LAY_2.get(), RareEngieSharkoLay2Entity.createAttributes().build());
		event.put(ENGI.get(), EngiEntity.createAttributes().build());
		event.put(CREATOR.get(), CreatorEntity.createAttributes().build());
		event.put(PROTOGEN.get(), ProtogenEntity.createAttributes().build());
		event.put(DEV_ENGI.get(), DevEngiEntity.createAttributes().build());
		event.put(QUIZ.get(), QuizEntity.createAttributes().build());
		event.put(MAD_ENGI.get(), MadEngiEntity.createAttributes().build());
		event.put(ANGRY_ENGI.get(), AngryEngiEntity.createAttributes().build());
		event.put(ENRAGED_ENGI.get(), EnragedEngiEntity.createAttributes().build());
		event.put(ANGRY_CREATOR.get(), AngryCreatorEntity.createAttributes().build());
		event.put(BLOODY_ENGI.get(), BloodyEngiEntity.createAttributes().build());
	}
}
