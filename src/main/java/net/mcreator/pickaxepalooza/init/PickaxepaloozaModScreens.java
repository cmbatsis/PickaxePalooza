
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pickaxepalooza.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.pickaxepalooza.client.gui.HarbingerGuiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PickaxepaloozaModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(PickaxepaloozaModMenus.HARBINGER_GUI.get(), HarbingerGuiScreen::new);
		});
	}
}
