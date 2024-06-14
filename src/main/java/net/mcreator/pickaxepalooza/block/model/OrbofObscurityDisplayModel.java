package net.mcreator.pickaxepalooza.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pickaxepalooza.block.display.OrbofObscurityDisplayItem;

public class OrbofObscurityDisplayModel extends GeoModel<OrbofObscurityDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OrbofObscurityDisplayItem animatable) {
		return new ResourceLocation("pickaxepalooza", "animations/orbofobscurity_-_converted.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OrbofObscurityDisplayItem animatable) {
		return new ResourceLocation("pickaxepalooza", "geo/orbofobscurity_-_converted.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OrbofObscurityDisplayItem entity) {
		return new ResourceLocation("pickaxepalooza", "textures/block/orbofobscurity.png");
	}
}
