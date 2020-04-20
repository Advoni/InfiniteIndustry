
package net.mcreator.infiniteindustry.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

import net.mcreator.infiniteindustry.block.HotMagmaSpongeBlock;
import net.mcreator.infiniteindustry.InfiniteIndustryElements;

@InfiniteIndustryElements.ModElement.Tag
public class HotMagmaSpongeFuelFuel extends InfiniteIndustryElements.ModElement {
	public HotMagmaSpongeFuelFuel(InfiniteIndustryElements instance) {
		super(instance, 67);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(HotMagmaSpongeBlock.block, (int) (1)).getItem())
			event.setBurnTime(32000);
	}
}
