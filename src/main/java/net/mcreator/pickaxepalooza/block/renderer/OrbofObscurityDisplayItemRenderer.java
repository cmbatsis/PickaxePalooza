package net.mcreator.pickaxepalooza.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.pickaxepalooza.block.model.OrbofObscurityDisplayModel;
import net.mcreator.pickaxepalooza.block.display.OrbofObscurityDisplayItem;

public class OrbofObscurityDisplayItemRenderer extends GeoItemRenderer<OrbofObscurityDisplayItem> {
	public OrbofObscurityDisplayItemRenderer() {
		super(new OrbofObscurityDisplayModel());
	}

	@Override
	public RenderType getRenderType(OrbofObscurityDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
