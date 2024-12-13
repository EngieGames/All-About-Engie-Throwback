
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.allaboutengiethrowback.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.allaboutengiethrowback.block.entity.MetalTableBlockEntity;
import net.mcreator.allaboutengiethrowback.AllAboutEngieThrowbackMod;

public class AllAboutEngieThrowbackModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, AllAboutEngieThrowbackMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> METAL_TABLE = register("metal_table", AllAboutEngieThrowbackModBlocks.METAL_TABLE, MetalTableBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
