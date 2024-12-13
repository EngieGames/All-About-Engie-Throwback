
package net.mcreator.allaboutengiethrowback.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.allaboutengiethrowback.init.AllAboutEngieThrowbackModTabs;

public abstract class LegendarySharkItem extends ArmorItem {
	public LegendarySharkItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 300;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{150, 150, 150, 150}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 7;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_leather"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}

			@Override
			public String getName() {
				return "legendary_shark";
			}

			@Override
			public float getToughness() {
				return 4f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.2f;
			}
		}, slot, properties);
	}

	public static class Helmet extends LegendarySharkItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(AllAboutEngieThrowbackModTabs.TAB_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "all_about_engie_throwback:textures/models/armor/legendarysharkothrowback__layer_1.png";
		}
	}

	public static class Chestplate extends LegendarySharkItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(AllAboutEngieThrowbackModTabs.TAB_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "all_about_engie_throwback:textures/models/armor/legendarysharkothrowback__layer_1.png";
		}
	}

	public static class Leggings extends LegendarySharkItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(AllAboutEngieThrowbackModTabs.TAB_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "all_about_engie_throwback:textures/models/armor/legendarysharkothrowback__layer_2.png";
		}
	}

	public static class Boots extends LegendarySharkItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(AllAboutEngieThrowbackModTabs.TAB_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "all_about_engie_throwback:textures/models/armor/legendarysharkothrowback__layer_1.png";
		}
	}
}
