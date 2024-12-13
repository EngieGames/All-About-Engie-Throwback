
package net.mcreator.allaboutengiethrowback.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.allaboutengiethrowback.init.AllAboutEngieThrowbackModTabs;

public class RareSharkoClothItem extends Item {
	public RareSharkoClothItem() {
		super(new Item.Properties().tab(AllAboutEngieThrowbackModTabs.TAB_ITEMS).stacksTo(64).rarity(Rarity.COMMON));
	}
}
