
package net.mcreator.allaboutengiethrowback.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.allaboutengiethrowback.init.AllAboutEngieThrowbackModTabs;

public class AlbinoSharkoClothItem extends Item {
	public AlbinoSharkoClothItem() {
		super(new Item.Properties().tab(AllAboutEngieThrowbackModTabs.TAB_ITEMS).stacksTo(64).rarity(Rarity.COMMON));
	}
}
