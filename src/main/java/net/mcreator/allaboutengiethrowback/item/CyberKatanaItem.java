
package net.mcreator.allaboutengiethrowback.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;

import net.mcreator.allaboutengiethrowback.init.AllAboutEngieThrowbackModTabs;

public class CyberKatanaItem extends SwordItem {
	public CyberKatanaItem() {
		super(new Tier() {
			public int getUses() {
				return 350;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 248f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, 21f, new Item.Properties().tab(AllAboutEngieThrowbackModTabs.TAB_TOOLS));
	}
}
