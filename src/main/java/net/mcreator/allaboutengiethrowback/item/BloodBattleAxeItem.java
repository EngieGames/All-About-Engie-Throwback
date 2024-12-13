
package net.mcreator.allaboutengiethrowback.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.allaboutengiethrowback.init.AllAboutEngieThrowbackModTabs;

public class BloodBattleAxeItem extends AxeItem {
	public BloodBattleAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 700;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 498f;
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
		}, 1, 8.5f, new Item.Properties().tab(AllAboutEngieThrowbackModTabs.TAB_TOOLS));
	}
}
