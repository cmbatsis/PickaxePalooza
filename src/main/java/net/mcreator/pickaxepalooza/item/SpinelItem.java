
package net.mcreator.pickaxepalooza.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SpinelItem extends Item {
	public SpinelItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
