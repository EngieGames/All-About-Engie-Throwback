
package net.mcreator.allaboutengiethrowback.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.allaboutengiethrowback.init.AllAboutEngieThrowbackModTabs;

public class EnragedEngiAxeItem extends AxeItem {
	public EnragedEngiAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1250;
			}

			public float getSpeed() {
				return 19f;
			}

			public float getAttackDamageBonus() {
				return 98f;
			}

			public int getLevel() {
				return 9;
			}

			public int getEnchantmentValue() {
				return 19;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 1, -2.2f, new Item.Properties().tab(AllAboutEngieThrowbackModTabs.TAB_TOOLS));
	}
}
