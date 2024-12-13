
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.allaboutengiethrowback.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.allaboutengiethrowback.item.SharkoClothItem;
import net.mcreator.allaboutengiethrowback.item.SharkItem;
import net.mcreator.allaboutengiethrowback.item.RareSharkoClothItem;
import net.mcreator.allaboutengiethrowback.item.RareSharkItem;
import net.mcreator.allaboutengiethrowback.item.MythicSharkoClothItem;
import net.mcreator.allaboutengiethrowback.item.MythicSharkItem;
import net.mcreator.allaboutengiethrowback.item.MiniBanHammerItem;
import net.mcreator.allaboutengiethrowback.item.LegendarySharkoClothItem;
import net.mcreator.allaboutengiethrowback.item.LegendarySharkItem;
import net.mcreator.allaboutengiethrowback.item.ExoticSharkoClothItem;
import net.mcreator.allaboutengiethrowback.item.ExoticSharkItem;
import net.mcreator.allaboutengiethrowback.item.EnragedEngisItem;
import net.mcreator.allaboutengiethrowback.item.EnragedEngiShovelItem;
import net.mcreator.allaboutengiethrowback.item.EnragedEngiPickaxeItem;
import net.mcreator.allaboutengiethrowback.item.EnragedEngiEssenceItem;
import net.mcreator.allaboutengiethrowback.item.EnragedEngiAxeItem;
import net.mcreator.allaboutengiethrowback.item.EngisItem;
import net.mcreator.allaboutengiethrowback.item.EngieSharkItem;
import net.mcreator.allaboutengiethrowback.item.EngiShovelItem;
import net.mcreator.allaboutengiethrowback.item.EngiSharkoClothItem;
import net.mcreator.allaboutengiethrowback.item.EngiPickaxeItem;
import net.mcreator.allaboutengiethrowback.item.EngiItemItem;
import net.mcreator.allaboutengiethrowback.item.EngiAxeItem;
import net.mcreator.allaboutengiethrowback.item.CyberbloodKatanaItem;
import net.mcreator.allaboutengiethrowback.item.CyberbloodItem;
import net.mcreator.allaboutengiethrowback.item.CyberbloodIngotItem;
import net.mcreator.allaboutengiethrowback.item.CyberbloodBattleAxeItem;
import net.mcreator.allaboutengiethrowback.item.CyberSpaceItem;
import net.mcreator.allaboutengiethrowback.item.CyberKatanaItem;
import net.mcreator.allaboutengiethrowback.item.CyberIngotItem;
import net.mcreator.allaboutengiethrowback.item.Cyb3rItem;
import net.mcreator.allaboutengiethrowback.item.BloodSpaceItem;
import net.mcreator.allaboutengiethrowback.item.BloodIngotItem;
import net.mcreator.allaboutengiethrowback.item.BloodBattleAxeItem;
import net.mcreator.allaboutengiethrowback.item.Bl00dItem;
import net.mcreator.allaboutengiethrowback.item.BiggestBanHammerItem;
import net.mcreator.allaboutengiethrowback.item.BiggerBanHammerItem;
import net.mcreator.allaboutengiethrowback.item.BigBanHammerItem;
import net.mcreator.allaboutengiethrowback.item.BanHammerItem;
import net.mcreator.allaboutengiethrowback.item.AngryEngisItem;
import net.mcreator.allaboutengiethrowback.item.AngryEngiShovelItem;
import net.mcreator.allaboutengiethrowback.item.AngryEngiPickaxeItem;
import net.mcreator.allaboutengiethrowback.item.AngryEngiEssenceItem;
import net.mcreator.allaboutengiethrowback.item.AngryEngiAxeItem;
import net.mcreator.allaboutengiethrowback.item.AlbinoSharkoClothItem;
import net.mcreator.allaboutengiethrowback.item.AlbinoSharkItem;
import net.mcreator.allaboutengiethrowback.AllAboutEngieThrowbackMod;

public class AllAboutEngieThrowbackModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AllAboutEngieThrowbackMod.MODID);
	public static final RegistryObject<Item> ENGI_AXE = REGISTRY.register("engi_axe", () -> new EngiAxeItem());
	public static final RegistryObject<Item> ENGI_ITEM = REGISTRY.register("engi_item", () -> new EngiItemItem());
	public static final RegistryObject<Item> ENGI_PICKAXE = REGISTRY.register("engi_pickaxe", () -> new EngiPickaxeItem());
	public static final RegistryObject<Item> ENGI_SHOVEL = REGISTRY.register("engi_shovel", () -> new EngiShovelItem());
	public static final RegistryObject<Item> ANGRY_ENGI_ESSENCE = REGISTRY.register("angry_engi_essence", () -> new AngryEngiEssenceItem());
	public static final RegistryObject<Item> ANGRY_ENGI_AXE = REGISTRY.register("angry_engi_axe", () -> new AngryEngiAxeItem());
	public static final RegistryObject<Item> ANGRY_ENGI_PICKAXE = REGISTRY.register("angry_engi_pickaxe", () -> new AngryEngiPickaxeItem());
	public static final RegistryObject<Item> ANGRY_ENGI_SHOVEL = REGISTRY.register("angry_engi_shovel", () -> new AngryEngiShovelItem());
	public static final RegistryObject<Item> SHARKO_SPAWN_EGG = REGISTRY.register("sharko_spawn_egg",
			() -> new ForgeSpawnEggItem(AllAboutEngieThrowbackModEntities.SHARKO, -12420148, -1, new Item.Properties().tab(AllAboutEngieThrowbackModTabs.TAB_SHARKOS)));
	public static final RegistryObject<Item> ALBINO_SHARKO_SPAWN_EGG = REGISTRY.register("albino_sharko_spawn_egg",
			() -> new ForgeSpawnEggItem(AllAboutEngieThrowbackModEntities.ALBINO_SHARKO, -1644826, -1, new Item.Properties().tab(AllAboutEngieThrowbackModTabs.TAB_SHARKOS)));
	public static final RegistryObject<Item> RARE_SHARKO_SPAWN_EGG = REGISTRY.register("rare_sharko_spawn_egg",
			() -> new ForgeSpawnEggItem(AllAboutEngieThrowbackModEntities.RARE_SHARKO, -1644826, -10450, new Item.Properties().tab(AllAboutEngieThrowbackModTabs.TAB_SHARKOS)));
	public static final RegistryObject<Item> LEGENDARY_SHARKO_SPAWN_EGG = REGISTRY.register("legendary_sharko_spawn_egg",
			() -> new ForgeSpawnEggItem(AllAboutEngieThrowbackModEntities.LEGENDARY_SHARKO, -12544, -7680, new Item.Properties().tab(AllAboutEngieThrowbackModTabs.TAB_SHARKOS)));
	public static final RegistryObject<Item> MYTHIC_SHARKO_SPAWN_EGG = REGISTRY.register("mythic_sharko_spawn_egg",
			() -> new ForgeSpawnEggItem(AllAboutEngieThrowbackModEntities.MYTHIC_SHARKO, -1512448, -196818, new Item.Properties().tab(AllAboutEngieThrowbackModTabs.TAB_SHARKOS)));
	public static final RegistryObject<Item> EXOTIC_SHARKO_SPAWN_EGG = REGISTRY.register("exotic_sharko_spawn_egg",
			() -> new ForgeSpawnEggItem(AllAboutEngieThrowbackModEntities.EXOTIC_SHARKO, -16714511, -12845059, new Item.Properties().tab(AllAboutEngieThrowbackModTabs.TAB_SHARKOS)));
	public static final RegistryObject<Item> ENGIE_SHARKO_SPAWN_EGG = REGISTRY.register("engie_sharko_spawn_egg",
			() -> new ForgeSpawnEggItem(AllAboutEngieThrowbackModEntities.ENGIE_SHARKO, -16250872, -7271155, new Item.Properties().tab(AllAboutEngieThrowbackModTabs.TAB_SHARKOS)));
	public static final RegistryObject<Item> RARE_ENGIE_SHARKO_SPAWN_EGG = REGISTRY.register("rare_engie_sharko_spawn_egg",
			() -> new ForgeSpawnEggItem(AllAboutEngieThrowbackModEntities.RARE_ENGIE_SHARKO, -1, -2788547, new Item.Properties().tab(AllAboutEngieThrowbackModTabs.TAB_SHARKOS)));
	public static final RegistryObject<Item> RARE_ENGIE_SHARKO_2_SPAWN_EGG = REGISTRY.register("rare_engie_sharko_2_spawn_egg",
			() -> new ForgeSpawnEggItem(AllAboutEngieThrowbackModEntities.RARE_ENGIE_SHARKO_2, -5329997, -13551280, new Item.Properties().tab(AllAboutEngieThrowbackModTabs.TAB_SHARKOS)));
	public static final RegistryObject<Item> ENGI_BLOCK = block(AllAboutEngieThrowbackModBlocks.ENGI_BLOCK, AllAboutEngieThrowbackModTabs.TAB_ITEMS);
	public static final RegistryObject<Item> ENRAGED_ENGI_AXE = REGISTRY.register("enraged_engi_axe", () -> new EnragedEngiAxeItem());
	public static final RegistryObject<Item> ENRAGED_ENGI_PICKAXE = REGISTRY.register("enraged_engi_pickaxe", () -> new EnragedEngiPickaxeItem());
	public static final RegistryObject<Item> ENRAGED_ENGI_SHOVEL = REGISTRY.register("enraged_engi_shovel", () -> new EnragedEngiShovelItem());
	public static final RegistryObject<Item> MINI_BAN_HAMMER = REGISTRY.register("mini_ban_hammer", () -> new MiniBanHammerItem());
	public static final RegistryObject<Item> BAN_HAMMER = REGISTRY.register("ban_hammer", () -> new BanHammerItem());
	public static final RegistryObject<Item> BIG_BAN_HAMMER = REGISTRY.register("big_ban_hammer", () -> new BigBanHammerItem());
	public static final RegistryObject<Item> BIGGER_BAN_HAMMER = REGISTRY.register("bigger_ban_hammer", () -> new BiggerBanHammerItem());
	public static final RegistryObject<Item> BIGGEST_BAN_HAMMER = REGISTRY.register("biggest_ban_hammer", () -> new BiggestBanHammerItem());
	public static final RegistryObject<Item> ENRAGED_ENGI_ESSENCE = REGISTRY.register("enraged_engi_essence", () -> new EnragedEngiEssenceItem());
	public static final RegistryObject<Item> ANGRY_ENGI_BLOCK = block(AllAboutEngieThrowbackModBlocks.ANGRY_ENGI_BLOCK, AllAboutEngieThrowbackModTabs.TAB_ITEMS);
	public static final RegistryObject<Item> ENRAGED_ENGI_BLOCK = block(AllAboutEngieThrowbackModBlocks.ENRAGED_ENGI_BLOCK, AllAboutEngieThrowbackModTabs.TAB_ITEMS);
	public static final RegistryObject<Item> ENGI_ORE = block(AllAboutEngieThrowbackModBlocks.ENGI_ORE, AllAboutEngieThrowbackModTabs.TAB_ITEMS);
	public static final RegistryObject<Item> DEEPSLATE_ENGI_ORE = block(AllAboutEngieThrowbackModBlocks.DEEPSLATE_ENGI_ORE, AllAboutEngieThrowbackModTabs.TAB_ITEMS);
	public static final RegistryObject<Item> METAL_TABLE = block(AllAboutEngieThrowbackModBlocks.METAL_TABLE, AllAboutEngieThrowbackModTabs.TAB_ITEMS);
	public static final RegistryObject<Item> THANKS_FOR_PLAYING = block(AllAboutEngieThrowbackModBlocks.THANKS_FOR_PLAYING, AllAboutEngieThrowbackModTabs.TAB_ITEMS);
	public static final RegistryObject<Item> ENGI_SPAWN_EGG = REGISTRY.register("engi_spawn_egg",
			() -> new ForgeSpawnEggItem(AllAboutEngieThrowbackModEntities.ENGI, -1559757, -3569855, new Item.Properties().tab(AllAboutEngieThrowbackModTabs.TAB_MOBS)));
	public static final RegistryObject<Item> CREATOR_SPAWN_EGG = REGISTRY.register("creator_spawn_egg",
			() -> new ForgeSpawnEggItem(AllAboutEngieThrowbackModEntities.CREATOR, -9489432, -3569855, new Item.Properties().tab(AllAboutEngieThrowbackModTabs.TAB_MOBS)));
	public static final RegistryObject<Item> PROTOGEN_SPAWN_EGG = REGISTRY.register("protogen_spawn_egg",
			() -> new ForgeSpawnEggItem(AllAboutEngieThrowbackModEntities.PROTOGEN, -8666881, -16758124, new Item.Properties().tab(AllAboutEngieThrowbackModTabs.TAB_MOBS)));
	public static final RegistryObject<Item> DEV_ENGI_SPAWN_EGG = REGISTRY.register("dev_engi_spawn_egg",
			() -> new ForgeSpawnEggItem(AllAboutEngieThrowbackModEntities.DEV_ENGI, -15066598, -45747, new Item.Properties().tab(AllAboutEngieThrowbackModTabs.TAB_MOBS)));
	public static final RegistryObject<Item> QUIZ_SPAWN_EGG = REGISTRY.register("quiz_spawn_egg", () -> new ForgeSpawnEggItem(AllAboutEngieThrowbackModEntities.QUIZ, -53703, -60639, new Item.Properties().tab(AllAboutEngieThrowbackModTabs.TAB_MOBS)));
	public static final RegistryObject<Item> MAD_ENGI_SPAWN_EGG = REGISTRY.register("mad_engi_spawn_egg",
			() -> new ForgeSpawnEggItem(AllAboutEngieThrowbackModEntities.MAD_ENGI, -3407872, -6044, new Item.Properties().tab(AllAboutEngieThrowbackModTabs.TAB_MOBS)));
	public static final RegistryObject<Item> ANGRY_ENGI_SPAWN_EGG = REGISTRY.register("angry_engi_spawn_egg",
			() -> new ForgeSpawnEggItem(AllAboutEngieThrowbackModEntities.ANGRY_ENGI, -16777216, -1, new Item.Properties().tab(AllAboutEngieThrowbackModTabs.TAB_MOBS)));
	public static final RegistryObject<Item> ENRAGED_ENGI_SPAWN_EGG = REGISTRY.register("enraged_engi_spawn_egg",
			() -> new ForgeSpawnEggItem(AllAboutEngieThrowbackModEntities.ENRAGED_ENGI, -16777216, -10092544, new Item.Properties().tab(AllAboutEngieThrowbackModTabs.TAB_MOBS)));
	public static final RegistryObject<Item> ANGRY_CREATOR_SPAWN_EGG = REGISTRY.register("angry_creator_spawn_egg",
			() -> new ForgeSpawnEggItem(AllAboutEngieThrowbackModEntities.ANGRY_CREATOR, -16777216, -6723841, new Item.Properties().tab(AllAboutEngieThrowbackModTabs.TAB_MOBS)));
	public static final RegistryObject<Item> BLOODY_ENGI_SPAWN_EGG = REGISTRY.register("bloody_engi_spawn_egg",
			() -> new ForgeSpawnEggItem(AllAboutEngieThrowbackModEntities.BLOODY_ENGI, -11206656, -7340032, new Item.Properties().tab(AllAboutEngieThrowbackModTabs.TAB_MOBS)));
	public static final RegistryObject<Item> CYBER_SPACE = REGISTRY.register("cyber_space", () -> new CyberSpaceItem());
	public static final RegistryObject<Item> BLOOD_SPACE = REGISTRY.register("blood_space", () -> new BloodSpaceItem());
	public static final RegistryObject<Item> CYBER_ORE = block(AllAboutEngieThrowbackModBlocks.CYBER_ORE, AllAboutEngieThrowbackModTabs.TAB_ITEMS);
	public static final RegistryObject<Item> BLOOD_ORE = block(AllAboutEngieThrowbackModBlocks.BLOOD_ORE, AllAboutEngieThrowbackModTabs.TAB_ITEMS);
	public static final RegistryObject<Item> ENGIS_HELMET = REGISTRY.register("engis_helmet", () -> new EngisItem.Helmet());
	public static final RegistryObject<Item> ENGIS_CHESTPLATE = REGISTRY.register("engis_chestplate", () -> new EngisItem.Chestplate());
	public static final RegistryObject<Item> ENGIS_LEGGINGS = REGISTRY.register("engis_leggings", () -> new EngisItem.Leggings());
	public static final RegistryObject<Item> ENGIS_BOOTS = REGISTRY.register("engis_boots", () -> new EngisItem.Boots());
	public static final RegistryObject<Item> ANGRY_ENGIS_HELMET = REGISTRY.register("angry_engis_helmet", () -> new AngryEngisItem.Helmet());
	public static final RegistryObject<Item> ANGRY_ENGIS_CHESTPLATE = REGISTRY.register("angry_engis_chestplate", () -> new AngryEngisItem.Chestplate());
	public static final RegistryObject<Item> ANGRY_ENGIS_LEGGINGS = REGISTRY.register("angry_engis_leggings", () -> new AngryEngisItem.Leggings());
	public static final RegistryObject<Item> ANGRY_ENGIS_BOOTS = REGISTRY.register("angry_engis_boots", () -> new AngryEngisItem.Boots());
	public static final RegistryObject<Item> ENRAGED_ENGIS_HELMET = REGISTRY.register("enraged_engis_helmet", () -> new EnragedEngisItem.Helmet());
	public static final RegistryObject<Item> ENRAGED_ENGIS_CHESTPLATE = REGISTRY.register("enraged_engis_chestplate", () -> new EnragedEngisItem.Chestplate());
	public static final RegistryObject<Item> ENRAGED_ENGIS_LEGGINGS = REGISTRY.register("enraged_engis_leggings", () -> new EnragedEngisItem.Leggings());
	public static final RegistryObject<Item> ENRAGED_ENGIS_BOOTS = REGISTRY.register("enraged_engis_boots", () -> new EnragedEngisItem.Boots());
	public static final RegistryObject<Item> SHARK_HELMET = REGISTRY.register("shark_helmet", () -> new SharkItem.Helmet());
	public static final RegistryObject<Item> SHARK_CHESTPLATE = REGISTRY.register("shark_chestplate", () -> new SharkItem.Chestplate());
	public static final RegistryObject<Item> SHARK_LEGGINGS = REGISTRY.register("shark_leggings", () -> new SharkItem.Leggings());
	public static final RegistryObject<Item> SHARK_BOOTS = REGISTRY.register("shark_boots", () -> new SharkItem.Boots());
	public static final RegistryObject<Item> ALBINO_SHARK_HELMET = REGISTRY.register("albino_shark_helmet", () -> new AlbinoSharkItem.Helmet());
	public static final RegistryObject<Item> ALBINO_SHARK_CHESTPLATE = REGISTRY.register("albino_shark_chestplate", () -> new AlbinoSharkItem.Chestplate());
	public static final RegistryObject<Item> ALBINO_SHARK_LEGGINGS = REGISTRY.register("albino_shark_leggings", () -> new AlbinoSharkItem.Leggings());
	public static final RegistryObject<Item> ALBINO_SHARK_BOOTS = REGISTRY.register("albino_shark_boots", () -> new AlbinoSharkItem.Boots());
	public static final RegistryObject<Item> RARE_SHARK_HELMET = REGISTRY.register("rare_shark_helmet", () -> new RareSharkItem.Helmet());
	public static final RegistryObject<Item> RARE_SHARK_CHESTPLATE = REGISTRY.register("rare_shark_chestplate", () -> new RareSharkItem.Chestplate());
	public static final RegistryObject<Item> RARE_SHARK_LEGGINGS = REGISTRY.register("rare_shark_leggings", () -> new RareSharkItem.Leggings());
	public static final RegistryObject<Item> RARE_SHARK_BOOTS = REGISTRY.register("rare_shark_boots", () -> new RareSharkItem.Boots());
	public static final RegistryObject<Item> LEGENDARY_SHARK_HELMET = REGISTRY.register("legendary_shark_helmet", () -> new LegendarySharkItem.Helmet());
	public static final RegistryObject<Item> LEGENDARY_SHARK_CHESTPLATE = REGISTRY.register("legendary_shark_chestplate", () -> new LegendarySharkItem.Chestplate());
	public static final RegistryObject<Item> LEGENDARY_SHARK_LEGGINGS = REGISTRY.register("legendary_shark_leggings", () -> new LegendarySharkItem.Leggings());
	public static final RegistryObject<Item> LEGENDARY_SHARK_BOOTS = REGISTRY.register("legendary_shark_boots", () -> new LegendarySharkItem.Boots());
	public static final RegistryObject<Item> MYTHIC_SHARK_HELMET = REGISTRY.register("mythic_shark_helmet", () -> new MythicSharkItem.Helmet());
	public static final RegistryObject<Item> MYTHIC_SHARK_CHESTPLATE = REGISTRY.register("mythic_shark_chestplate", () -> new MythicSharkItem.Chestplate());
	public static final RegistryObject<Item> MYTHIC_SHARK_LEGGINGS = REGISTRY.register("mythic_shark_leggings", () -> new MythicSharkItem.Leggings());
	public static final RegistryObject<Item> MYTHIC_SHARK_BOOTS = REGISTRY.register("mythic_shark_boots", () -> new MythicSharkItem.Boots());
	public static final RegistryObject<Item> EXOTIC_SHARK_HELMET = REGISTRY.register("exotic_shark_helmet", () -> new ExoticSharkItem.Helmet());
	public static final RegistryObject<Item> EXOTIC_SHARK_CHESTPLATE = REGISTRY.register("exotic_shark_chestplate", () -> new ExoticSharkItem.Chestplate());
	public static final RegistryObject<Item> EXOTIC_SHARK_LEGGINGS = REGISTRY.register("exotic_shark_leggings", () -> new ExoticSharkItem.Leggings());
	public static final RegistryObject<Item> EXOTIC_SHARK_BOOTS = REGISTRY.register("exotic_shark_boots", () -> new ExoticSharkItem.Boots());
	public static final RegistryObject<Item> ENGIE_SHARK_HELMET = REGISTRY.register("engie_shark_helmet", () -> new EngieSharkItem.Helmet());
	public static final RegistryObject<Item> ENGIE_SHARK_CHESTPLATE = REGISTRY.register("engie_shark_chestplate", () -> new EngieSharkItem.Chestplate());
	public static final RegistryObject<Item> ENGIE_SHARK_LEGGINGS = REGISTRY.register("engie_shark_leggings", () -> new EngieSharkItem.Leggings());
	public static final RegistryObject<Item> ENGIE_SHARK_BOOTS = REGISTRY.register("engie_shark_boots", () -> new EngieSharkItem.Boots());
	public static final RegistryObject<Item> CYBER_HELMET = REGISTRY.register("cyber_helmet", () -> new Cyb3rItem.Helmet());
	public static final RegistryObject<Item> CYBER_CHESTPLATE = REGISTRY.register("cyber_chestplate", () -> new Cyb3rItem.Chestplate());
	public static final RegistryObject<Item> CYBER_LEGGINGS = REGISTRY.register("cyber_leggings", () -> new Cyb3rItem.Leggings());
	public static final RegistryObject<Item> CYBER_BOOTS = REGISTRY.register("cyber_boots", () -> new Cyb3rItem.Boots());
	public static final RegistryObject<Item> BLOOD_HELMET = REGISTRY.register("blood_helmet", () -> new Bl00dItem.Helmet());
	public static final RegistryObject<Item> BLOOD_CHESTPLATE = REGISTRY.register("blood_chestplate", () -> new Bl00dItem.Chestplate());
	public static final RegistryObject<Item> BLOOD_LEGGINGS = REGISTRY.register("blood_leggings", () -> new Bl00dItem.Leggings());
	public static final RegistryObject<Item> BLOOD_BOOTS = REGISTRY.register("blood_boots", () -> new Bl00dItem.Boots());
	public static final RegistryObject<Item> CYBERBLOOD_HELMET = REGISTRY.register("cyberblood_helmet", () -> new CyberbloodItem.Helmet());
	public static final RegistryObject<Item> CYBERBLOOD_CHESTPLATE = REGISTRY.register("cyberblood_chestplate", () -> new CyberbloodItem.Chestplate());
	public static final RegistryObject<Item> CYBERBLOOD_LEGGINGS = REGISTRY.register("cyberblood_leggings", () -> new CyberbloodItem.Leggings());
	public static final RegistryObject<Item> CYBERBLOOD_BOOTS = REGISTRY.register("cyberblood_boots", () -> new CyberbloodItem.Boots());
	public static final RegistryObject<Item> SHARKO_CLOTH = REGISTRY.register("sharko_cloth", () -> new SharkoClothItem());
	public static final RegistryObject<Item> ALBINO_SHARKO_CLOTH = REGISTRY.register("albino_sharko_cloth", () -> new AlbinoSharkoClothItem());
	public static final RegistryObject<Item> RARE_SHARKO_CLOTH = REGISTRY.register("rare_sharko_cloth", () -> new RareSharkoClothItem());
	public static final RegistryObject<Item> LEGENDARY_SHARKO_CLOTH = REGISTRY.register("legendary_sharko_cloth", () -> new LegendarySharkoClothItem());
	public static final RegistryObject<Item> MYTHIC_SHARKO_CLOTH = REGISTRY.register("mythic_sharko_cloth", () -> new MythicSharkoClothItem());
	public static final RegistryObject<Item> EXOTIC_SHARKO_CLOTH = REGISTRY.register("exotic_sharko_cloth", () -> new ExoticSharkoClothItem());
	public static final RegistryObject<Item> ENGI_SHARKO_CLOTH = REGISTRY.register("engi_sharko_cloth", () -> new EngiSharkoClothItem());
	public static final RegistryObject<Item> CYBER_INGOT = REGISTRY.register("cyber_ingot", () -> new CyberIngotItem());
	public static final RegistryObject<Item> BLOOD_INGOT = REGISTRY.register("blood_ingot", () -> new BloodIngotItem());
	public static final RegistryObject<Item> CYBERBLOOD_INGOT = REGISTRY.register("cyberblood_ingot", () -> new CyberbloodIngotItem());
	public static final RegistryObject<Item> CYBER_KATANA = REGISTRY.register("cyber_katana", () -> new CyberKatanaItem());
	public static final RegistryObject<Item> BLOOD_BATTLE_AXE = REGISTRY.register("blood_battle_axe", () -> new BloodBattleAxeItem());
	public static final RegistryObject<Item> CYBERBLOOD_KATANA = REGISTRY.register("cyberblood_katana", () -> new CyberbloodKatanaItem());
	public static final RegistryObject<Item> CYBERBLOOD_BATTLE_AXE = REGISTRY.register("cyberblood_battle_axe", () -> new CyberbloodBattleAxeItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
