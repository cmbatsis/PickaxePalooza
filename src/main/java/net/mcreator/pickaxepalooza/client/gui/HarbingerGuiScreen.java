package net.mcreator.pickaxepalooza.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.pickaxepalooza.world.inventory.HarbingerGuiMenu;
import net.mcreator.pickaxepalooza.network.HarbingerGuiButtonMessage;
import net.mcreator.pickaxepalooza.PickaxepaloozaMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class HarbingerGuiScreen extends AbstractContainerScreen<HarbingerGuiMenu> {
	private final static HashMap<String, Object> guistate = HarbingerGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_ascend;

	public HarbingerGuiScreen(HarbingerGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("pickaxepalooza:textures/screens/harbinger_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.pickaxepalooza.harbinger_gui.label_harbingers_gateway"), 39, 11, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.pickaxepalooza.harbinger_gui.label_gong"), 12, 34, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.pickaxepalooza.harbinger_gui.label_shield_totem"), 8, 56, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.pickaxepalooza.harbinger_gui.label_totem"), 11, 64, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.pickaxepalooza.harbinger_gui.label_zircon_block"), 73, 62, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.pickaxepalooza.harbinger_gui.label_block"), 75, 71, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_ascend = Button.builder(Component.translatable("gui.pickaxepalooza.harbinger_gui.button_ascend"), e -> {
			if (true) {
				PickaxepaloozaMod.PACKET_HANDLER.sendToServer(new HarbingerGuiButtonMessage(0, x, y, z));
				HarbingerGuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 109, this.topPos + 41, 56, 20).build();
		guistate.put("button:button_ascend", button_ascend);
		this.addRenderableWidget(button_ascend);
	}
}
