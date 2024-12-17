
package net.mcreator.allaboutengiethrowback.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.mcreator.allaboutengiethrowback.init.AllAboutEngieThrowbackModTabs;

import java.util.List;

public class BiggestBanHammerItem extends SwordItem {
	public BiggestBanHammerItem() {
		super(new Tier() {
			public int getUses() {
				return 9001;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 8997f;
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
		}, 3, -1f, new Item.Properties().tab(AllAboutEngieThrowbackModTabs.TAB_ITEMS));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("IT'S OVER 9"));
		list.add(Component.literal("000!!!"));
	}
}
