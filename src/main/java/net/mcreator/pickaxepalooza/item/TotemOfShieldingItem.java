
package net.mcreator.pickaxepalooza.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.mcreator.pickaxepalooza.procedures.TotemOfShieldingItemInInventoryTickProcedure;

public class TotemOfShieldingItem extends Item {
	public TotemOfShieldingItem() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		TotemOfShieldingItemInInventoryTickProcedure.execute(entity);
	}
}
