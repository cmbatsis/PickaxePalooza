
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pickaxepalooza.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.pickaxepalooza.PickaxepaloozaMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PickaxepaloozaModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PickaxepaloozaMod.MODID);
	public static final RegistryObject<CreativeModeTab> MINING_MADNESS = REGISTRY.register("mining_madness",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.pickaxepalooza.mining_madness")).icon(() -> new ItemStack(Items.WOODEN_PICKAXE)).displayItems((parameters, tabData) -> {
				tabData.accept(PickaxepaloozaModItems.TOURMALINE.get());
				tabData.accept(PickaxepaloozaModBlocks.TOURMALINE_ORE.get().asItem());
				tabData.accept(PickaxepaloozaModBlocks.TOURMALINE_DEEP_ORE.get().asItem());
				tabData.accept(PickaxepaloozaModBlocks.TOURMALINE_BLOCK.get().asItem());
				tabData.accept(PickaxepaloozaModItems.OPAL.get());
				tabData.accept(PickaxepaloozaModBlocks.OPAL_ORE.get().asItem());
				tabData.accept(PickaxepaloozaModItems.IOLITE.get());
				tabData.accept(PickaxepaloozaModBlocks.IOLITE_DEEP_ORE.get().asItem());
				tabData.accept(PickaxepaloozaModItems.ZIRCON.get());
				tabData.accept(PickaxepaloozaModBlocks.ZIRCON_DEEP_ORE.get().asItem());
				tabData.accept(PickaxepaloozaModItems.SPINEL.get());
				tabData.accept(PickaxepaloozaModBlocks.SPINEL_DEEP_ORE.get().asItem());
				tabData.accept(PickaxepaloozaModItems.SOULS_HARBINGER.get());
				tabData.accept(PickaxepaloozaModItems.GONGOF_NULLIFICATION.get());
				tabData.accept(PickaxepaloozaModItems.RAW_ZIRCON_SOUP.get());
				tabData.accept(PickaxepaloozaModItems.SLOPOFTHE_DEAD.get());
				tabData.accept(PickaxepaloozaModItems.TOTEM_OF_SHIELDING.get());
				tabData.accept(PickaxepaloozaModBlocks.OPAL_BLOCK.get().asItem());
				tabData.accept(PickaxepaloozaModBlocks.IOLITE_BLOCK.get().asItem());
				tabData.accept(PickaxepaloozaModBlocks.ZIRCON_BLOCK.get().asItem());
				tabData.accept(PickaxepaloozaModItems.HARBINGER_ASCEND.get());
				tabData.accept(PickaxepaloozaModItems.MIGHTOFTHE_LIGHT.get());
				tabData.accept(PickaxepaloozaModBlocks.SPINEL_BLOCK.get().asItem());
				tabData.accept(PickaxepaloozaModBlocks.BARREN_TOMB.get().asItem());
				tabData.accept(PickaxepaloozaModBlocks.ORBOF_OBSCURITY.get().asItem());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(PickaxepaloozaModItems.KEEPER_OF_THE_DEEP_SPAWN_EGG.get());
		}
	}
}
