
package net.mcreator.allaboutengiethrowback.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.allaboutengiethrowback.init.AllAboutEngieThrowbackModTabs;
import net.mcreator.allaboutengiethrowback.init.AllAboutEngieThrowbackModItems;

public class AngryEngiPickaxeItem extends PickaxeItem {
	public AngryEngiPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1000;
			}

			public float getSpeed() {
				return 16f;
			}

			public float getAttackDamageBonus() {
				return 23f;
			}

			public int getLevel() {
				return 6;
			}

			public int getEnchantmentValue() {
				return 16;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(AllAboutEngieThrowbackModItems.ANGRY_ENGI_ESSENCE.get()));
			}
		}, 1, -2.6f, new Item.Properties().tab(AllAboutEngieThrowbackModTabs.TAB_ITEMS));
	}
}
