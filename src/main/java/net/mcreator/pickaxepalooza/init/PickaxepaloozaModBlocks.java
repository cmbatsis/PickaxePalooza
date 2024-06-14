
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pickaxepalooza.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.pickaxepalooza.block.ZirconDeepOreBlock;
import net.mcreator.pickaxepalooza.block.ZirconBlockBlock;
import net.mcreator.pickaxepalooza.block.TourmalineOreBlock;
import net.mcreator.pickaxepalooza.block.TourmalineDeepOreBlock;
import net.mcreator.pickaxepalooza.block.TourmalineBlockBlock;
import net.mcreator.pickaxepalooza.block.SpinelDeepOreBlock;
import net.mcreator.pickaxepalooza.block.OpalOreBlock;
import net.mcreator.pickaxepalooza.block.OpalBlockBlock;
import net.mcreator.pickaxepalooza.block.IoliteDeepOreBlock;
import net.mcreator.pickaxepalooza.block.IoliteBlockBlock;
import net.mcreator.pickaxepalooza.PickaxepaloozaMod;

public class PickaxepaloozaModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, PickaxepaloozaMod.MODID);
	public static final RegistryObject<Block> TOURMALINE_ORE = REGISTRY.register("tourmaline_ore", () -> new TourmalineOreBlock());
	public static final RegistryObject<Block> TOURMALINE_DEEP_ORE = REGISTRY.register("tourmaline_deep_ore", () -> new TourmalineDeepOreBlock());
	public static final RegistryObject<Block> TOURMALINE_BLOCK = REGISTRY.register("tourmaline_block", () -> new TourmalineBlockBlock());
	public static final RegistryObject<Block> OPAL_ORE = REGISTRY.register("opal_ore", () -> new OpalOreBlock());
	public static final RegistryObject<Block> IOLITE_DEEP_ORE = REGISTRY.register("iolite_deep_ore", () -> new IoliteDeepOreBlock());
	public static final RegistryObject<Block> ZIRCON_DEEP_ORE = REGISTRY.register("zircon_deep_ore", () -> new ZirconDeepOreBlock());
	public static final RegistryObject<Block> SPINEL_DEEP_ORE = REGISTRY.register("spinel_deep_ore", () -> new SpinelDeepOreBlock());
	public static final RegistryObject<Block> OPAL_BLOCK = REGISTRY.register("opal_block", () -> new OpalBlockBlock());
	public static final RegistryObject<Block> IOLITE_BLOCK = REGISTRY.register("iolite_block", () -> new IoliteBlockBlock());
	public static final RegistryObject<Block> ZIRCON_BLOCK = REGISTRY.register("zircon_block", () -> new ZirconBlockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
