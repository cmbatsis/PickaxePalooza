
package net.mcreator.pickaxepalooza.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.pickaxepalooza.procedures.MightoftheLightLivingEntityIsHitWithToolProcedure;
import net.mcreator.pickaxepalooza.init.PickaxepaloozaModItems;

public class MightoftheLightItem extends SwordItem {
	public MightoftheLightItem() {
		super(new Tier() {
			public int getUses() {
				return 750;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 2.5f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PickaxepaloozaModItems.OPAL.get()));
			}
		}, 3, -3.3f, new Item.Properties());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		MightoftheLightLivingEntityIsHitWithToolProcedure.execute(entity.level(), entity, sourceentity);
		return retval;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
