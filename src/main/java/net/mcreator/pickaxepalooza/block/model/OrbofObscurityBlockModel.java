package net.mcreator.pickaxepalooza.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.pickaxepalooza.block.entity.OrbofObscurityTileEntity;

public class OrbofObscurityBlockModel extends GeoModel<OrbofObscurityTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OrbofObscurityTileEntity animatable) {
		return new ResourceLocation("pickaxepalooza", "animations/orbofobscurity_-_converted.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OrbofObscurityTileEntity animatable) {
		return new ResourceLocation("pickaxepalooza", "geo/orbofobscurity_-_converted.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OrbofObscurityTileEntity animatable) {
		return new ResourceLocation("pickaxepalooza", "textures/block/orbofobscurity.png");
	}
}
