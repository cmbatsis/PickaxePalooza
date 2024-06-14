
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pickaxepalooza.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.pickaxepalooza.item.ZirconItem;
import net.mcreator.pickaxepalooza.item.TourmalineItem;
import net.mcreator.pickaxepalooza.item.TotemOfShieldingItem;
import net.mcreator.pickaxepalooza.item.SpinelItem;
import net.mcreator.pickaxepalooza.item.SoulsHarbingerItem;
import net.mcreator.pickaxepalooza.item.SlopoftheDeadItem;
import net.mcreator.pickaxepalooza.item.RawZirconSoupItem;
import net.mcreator.pickaxepalooza.item.OpalItem;
import net.mcreator.pickaxepalooza.item.IoliteItem;
import net.mcreator.pickaxepalooza.item.HarbingerAscendItem;
import net.mcreator.pickaxepalooza.item.GongofNullificationItem;
import net.mcreator.pickaxepalooza.PickaxepaloozaMod;

public class PickaxepaloozaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PickaxepaloozaMod.MODID);
	public static final RegistryObject<Item> TOURMALINE = REGISTRY.register("tourmaline", () -> new TourmalineItem());
	public static final RegistryObject<Item> TOURMALINE_ORE = block(PickaxepaloozaModBlocks.TOURMALINE_ORE);
	public static final RegistryObject<Item> TOURMALINE_DEEP_ORE = block(PickaxepaloozaModBlocks.TOURMALINE_DEEP_ORE);
	public static final RegistryObject<Item> TOURMALINE_BLOCK = block(PickaxepaloozaModBlocks.TOURMALINE_BLOCK);
	public static final RegistryObject<Item> OPAL = REGISTRY.register("opal", () -> new OpalItem());
	public static final RegistryObject<Item> OPAL_ORE = block(PickaxepaloozaModBlocks.OPAL_ORE);
	public static final RegistryObject<Item> IOLITE = REGISTRY.register("iolite", () -> new IoliteItem());
	public static final RegistryObject<Item> IOLITE_DEEP_ORE = block(PickaxepaloozaModBlocks.IOLITE_DEEP_ORE);
	public static final RegistryObject<Item> ZIRCON = REGISTRY.register("zircon", () -> new ZirconItem());
	public static final RegistryObject<Item> ZIRCON_DEEP_ORE = block(PickaxepaloozaModBlocks.ZIRCON_DEEP_ORE);
	public static final RegistryObject<Item> SPINEL = REGISTRY.register("spinel", () -> new SpinelItem());
	public static final RegistryObject<Item> SPINEL_DEEP_ORE = block(PickaxepaloozaModBlocks.SPINEL_DEEP_ORE);
	public static final RegistryObject<Item> SOULS_HARBINGER = REGISTRY.register("souls_harbinger", () -> new SoulsHarbingerItem());
	public static final RegistryObject<Item> GONGOF_NULLIFICATION = REGISTRY.register("gongof_nullification", () -> new GongofNullificationItem());
	public static final RegistryObject<Item> RAW_ZIRCON_SOUP = REGISTRY.register("raw_zircon_soup", () -> new RawZirconSoupItem());
	public static final RegistryObject<Item> SLOPOFTHE_DEAD = REGISTRY.register("slopofthe_dead", () -> new SlopoftheDeadItem());
	public static final RegistryObject<Item> TOTEM_OF_SHIELDING = REGISTRY.register("totem_of_shielding", () -> new TotemOfShieldingItem());
	public static final RegistryObject<Item> OPAL_BLOCK = block(PickaxepaloozaModBlocks.OPAL_BLOCK);
	public static final RegistryObject<Item> IOLITE_BLOCK = block(PickaxepaloozaModBlocks.IOLITE_BLOCK);
	public static final RegistryObject<Item> ZIRCON_BLOCK = block(PickaxepaloozaModBlocks.ZIRCON_BLOCK);
	public static final RegistryObject<Item> HARBINGER_ASCEND = REGISTRY.register("harbinger_ascend", () -> new HarbingerAscendItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
