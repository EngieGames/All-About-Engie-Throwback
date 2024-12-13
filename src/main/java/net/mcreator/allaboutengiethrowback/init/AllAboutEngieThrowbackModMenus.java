
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.allaboutengiethrowback.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.allaboutengiethrowback.world.inventory.MetalChestUIMenu;
import net.mcreator.allaboutengiethrowback.AllAboutEngieThrowbackMod;

public class AllAboutEngieThrowbackModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, AllAboutEngieThrowbackMod.MODID);
	public static final RegistryObject<MenuType<MetalChestUIMenu>> METAL_CHEST_UI = REGISTRY.register("metal_chest_ui", () -> IForgeMenuType.create(MetalChestUIMenu::new));
}
