
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.allaboutengiethrowback.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.allaboutengiethrowback.block.ThanksForPlayingBlock;
import net.mcreator.allaboutengiethrowback.block.MetalTableBlock;
import net.mcreator.allaboutengiethrowback.block.EnragedEngiBlockBlock;
import net.mcreator.allaboutengiethrowback.block.EngiOreBlock;
import net.mcreator.allaboutengiethrowback.block.EngiBlockBlock;
import net.mcreator.allaboutengiethrowback.block.DeepslateEngiOreBlock;
import net.mcreator.allaboutengiethrowback.block.CyberSpacePortalBlock;
import net.mcreator.allaboutengiethrowback.block.CyberOreBlock;
import net.mcreator.allaboutengiethrowback.block.BloodSpacePortalBlock;
import net.mcreator.allaboutengiethrowback.block.BloodOreBlock;
import net.mcreator.allaboutengiethrowback.block.AngryEngiBlockBlock;
import net.mcreator.allaboutengiethrowback.AllAboutEngieThrowbackMod;

public class AllAboutEngieThrowbackModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AllAboutEngieThrowbackMod.MODID);
	public static final RegistryObject<Block> ENGI_BLOCK = REGISTRY.register("engi_block", () -> new EngiBlockBlock());
	public static final RegistryObject<Block> ANGRY_ENGI_BLOCK = REGISTRY.register("angry_engi_block", () -> new AngryEngiBlockBlock());
	public static final RegistryObject<Block> ENRAGED_ENGI_BLOCK = REGISTRY.register("enraged_engi_block", () -> new EnragedEngiBlockBlock());
	public static final RegistryObject<Block> ENGI_ORE = REGISTRY.register("engi_ore", () -> new EngiOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_ENGI_ORE = REGISTRY.register("deepslate_engi_ore", () -> new DeepslateEngiOreBlock());
	public static final RegistryObject<Block> METAL_TABLE = REGISTRY.register("metal_table", () -> new MetalTableBlock());
	public static final RegistryObject<Block> THANKS_FOR_PLAYING = REGISTRY.register("thanks_for_playing", () -> new ThanksForPlayingBlock());
	public static final RegistryObject<Block> CYBER_SPACE_PORTAL = REGISTRY.register("cyber_space_portal", () -> new CyberSpacePortalBlock());
	public static final RegistryObject<Block> BLOOD_SPACE_PORTAL = REGISTRY.register("blood_space_portal", () -> new BloodSpacePortalBlock());
	public static final RegistryObject<Block> CYBER_ORE = REGISTRY.register("cyber_ore", () -> new CyberOreBlock());
	public static final RegistryObject<Block> BLOOD_ORE = REGISTRY.register("blood_ore", () -> new BloodOreBlock());
}
