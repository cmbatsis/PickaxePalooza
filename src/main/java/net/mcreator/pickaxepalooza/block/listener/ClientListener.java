package net.mcreator.pickaxepalooza.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.pickaxepalooza.init.PickaxepaloozaModBlockEntities;
import net.mcreator.pickaxepalooza.block.renderer.OrbofObscurityTileRenderer;
import net.mcreator.pickaxepalooza.PickaxepaloozaMod;

@Mod.EventBusSubscriber(modid = PickaxepaloozaMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(PickaxepaloozaModBlockEntities.ORBOF_OBSCURITY.get(), context -> new OrbofObscurityTileRenderer());
	}
}
