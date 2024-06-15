package net.mcreator.pickaxepalooza.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.pickaxepalooza.entity.KeeperOfTheDeepEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class KeeperOfTheDeepOnEntityTickUpdateProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity instanceof KeeperOfTheDeepEntity && entity instanceof Player && Math.random() <= 0.25) {
			if (entity instanceof KeeperOfTheDeepEntity) {
				((KeeperOfTheDeepEntity) entity).setAnimation("animation.keeperofthedeep.attack2");
			}
		}
	}
}
