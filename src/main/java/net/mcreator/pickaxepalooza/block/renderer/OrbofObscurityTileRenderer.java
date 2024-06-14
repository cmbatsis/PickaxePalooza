package net.mcreator.pickaxepalooza.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.pickaxepalooza.block.model.OrbofObscurityBlockModel;
import net.mcreator.pickaxepalooza.block.entity.OrbofObscurityTileEntity;

public class OrbofObscurityTileRenderer extends GeoBlockRenderer<OrbofObscurityTileEntity> {
	public OrbofObscurityTileRenderer() {
		super(new OrbofObscurityBlockModel());
	}

	@Override
	public RenderType getRenderType(OrbofObscurityTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
