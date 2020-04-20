
package net.mcreator.infiniteindustry.item;

@InfiniteIndustryElements.ModElement.Tag
public class GoldPlateItem extends InfiniteIndustryElements.ModElement {

	@ObjectHolder("infiniteindustry:goldplate")
	public static final Item block = null;

	public GoldPlateItem(InfiniteIndustryElements instance) {
		super(instance, 125);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(InfiniteIndustryItemGroup.tab).maxStackSize(64));
			setRegistryName("goldplate");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

	}

}
