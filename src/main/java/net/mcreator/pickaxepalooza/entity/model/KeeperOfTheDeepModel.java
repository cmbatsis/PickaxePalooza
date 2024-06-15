package net.mcreator.pickaxepalooza.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pickaxepalooza.entity.KeeperOfTheDeepEntity;

public class KeeperOfTheDeepModel extends GeoModel<KeeperOfTheDeepEntity> {
	@Override
	public ResourceLocation getAnimationResource(KeeperOfTheDeepEntity entity) {
		return new ResourceLocation("pickaxepalooza", "animations/keeperofthedeep.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(KeeperOfTheDeepEntity entity) {
		return new ResourceLocation("pickaxepalooza", "geo/keeperofthedeep.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(KeeperOfTheDeepEntity entity) {
		return new ResourceLocation("pickaxepalooza", "textures/entities/" + entity.getTexture() + ".png");
	}

}
