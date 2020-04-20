
package net.mcreator.infiniteindustry.fuel;

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
