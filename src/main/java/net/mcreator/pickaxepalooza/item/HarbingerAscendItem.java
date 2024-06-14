
package net.mcreator.pickaxepalooza.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;

import net.mcreator.pickaxepalooza.procedures.HarbingerAscendRightclickedProcedure;
import net.mcreator.pickaxepalooza.procedures.HarbingerAscendItemInInventoryTickProcedure;

import java.util.List;

public class HarbingerAscendItem extends Item {
	public HarbingerAscendItem() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("\u00A7l\u00A7fPassive: \u00A7rHold in the inventory to recieve"));
		list.add(Component.literal("immense resistance and protection"));
		list.add(Component.literal("\u00A7l\u00A7fRight Click: \u00A7rBoost entities around"));
		list.add(Component.literal(" you with strength and speed"));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		HarbingerAscendRightclickedProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ());
		return ar;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		HarbingerAscendItemInInventoryTickProcedure.execute(entity);
	}
}
