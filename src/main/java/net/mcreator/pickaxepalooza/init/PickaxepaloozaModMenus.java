
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pickaxepalooza.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.pickaxepalooza.world.inventory.HarbingerGuiMenu;
import net.mcreator.pickaxepalooza.PickaxepaloozaMod;

public class PickaxepaloozaModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, PickaxepaloozaMod.MODID);
	public static final RegistryObject<MenuType<HarbingerGuiMenu>> HARBINGER_GUI = REGISTRY.register("harbinger_gui", () -> IForgeMenuType.create(HarbingerGuiMenu::new));
}
