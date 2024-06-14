
package net.mcreator.pickaxepalooza.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class IoliteItem extends Item {
	public IoliteItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
