package net.mcreator.allaboutengiethrowback.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.allaboutengiethrowback.init.AllAboutEngieThrowbackModBlocks;

public class ThrowbackHouseSpawnerOnStructureInstanceGeneratedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos(x, y, z), AllAboutEngieThrowbackModBlocks.THANKS_FOR_PLAYING.get().defaultBlockState(), 3);
		world.scheduleTick(new BlockPos(x, y, z), world.getBlockState(new BlockPos(x, y, z)).getBlock(), 20);
	}
}
