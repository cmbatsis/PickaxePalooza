
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pickaxepalooza.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.pickaxepalooza.block.entity.OrbofObscurityTileEntity;
import net.mcreator.pickaxepalooza.PickaxepaloozaMod;

public class PickaxepaloozaModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, PickaxepaloozaMod.MODID);
	public static final RegistryObject<BlockEntityType<OrbofObscurityTileEntity>> ORBOF_OBSCURITY = REGISTRY.register("orbof_obscurity",
			() -> BlockEntityType.Builder.of(OrbofObscurityTileEntity::new, PickaxepaloozaModBlocks.ORBOF_OBSCURITY.get()).build(null));

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
