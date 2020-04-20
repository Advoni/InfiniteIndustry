
package net.mcreator.infiniteindustry.item;

@InfiniteIndustryElements.ModElement.Tag
public class BloodBucketItem extends InfiniteIndustryElements.ModElement {

	@ObjectHolder("infiniteindustry:bloodbucket")
	public static final Item block = null;

	public BloodBucketItem(InfiniteIndustryElements instance) {
		super(instance, 121);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(InfiniteIndustryItemGroup.tab).maxStackSize(64));
			setRegistryName("bloodbucket");
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
