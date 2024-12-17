
package net.mcreator.allaboutengiethrowback.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.allaboutengiethrowback.init.AllAboutEngieThrowbackModTabs;
import net.mcreator.allaboutengiethrowback.init.AllAboutEngieThrowbackModItems;

public class EngiShovelItem extends ShovelItem {
	public EngiShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 750;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 13f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 10;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(AllAboutEngieThrowbackModItems.ENGI_ITEM.get()));
			}
		}, 1, -3f, new Item.Properties().tab(AllAboutEngieThrowbackModTabs.TAB_TOOLS));
	}
}
