
package net.mcreator.allaboutengiethrowback.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;

import net.mcreator.allaboutengiethrowback.init.AllAboutEngieThrowbackModTabs;

public class BiggerBanHammerItem extends SwordItem {
	public BiggerBanHammerItem() {
		super(new Tier() {
			public int getUses() {
				return 6000;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 2498f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 25;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, -1.5f, new Item.Properties().tab(AllAboutEngieThrowbackModTabs.TAB_ITEMS));
	}
}
