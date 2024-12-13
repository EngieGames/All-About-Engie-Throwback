
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.allaboutengiethrowback.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class AllAboutEngieThrowbackModTabs {
	public static CreativeModeTab TAB_SHARKOS;
	public static CreativeModeTab TAB_ITEMS;
	public static CreativeModeTab TAB_TOOLS;
	public static CreativeModeTab TAB_MOBS;
	public static CreativeModeTab TAB_ARMOR;

	public static void load() {
		TAB_SHARKOS = new CreativeModeTab("tabsharkos") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.COOKIE);
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_ITEMS = new CreativeModeTab("tabitems") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AllAboutEngieThrowbackModItems.ENGI_ITEM.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_TOOLS = new CreativeModeTab("tabtools") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AllAboutEngieThrowbackModItems.ENGI_AXE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_MOBS = new CreativeModeTab("tabmobs") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.SPAWNER);
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_ARMOR = new CreativeModeTab("tabarmor") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AllAboutEngieThrowbackModItems.ENGIS_HELMET.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
