
package net.mcreator.infiniteindustry.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.infiniteindustry.itemgroup.InfiniteIndustryItemGroup;
import net.mcreator.infiniteindustry.InfiniteIndustryElements;

@InfiniteIndustryElements.ModElement.Tag
public class SulfuricAcidBucketItem extends InfiniteIndustryElements.ModElement {
	@ObjectHolder("infiniteindustry:sulfuricacidbucket")
	public static final Item block = null;
	public SulfuricAcidBucketItem(InfiniteIndustryElements instance) {
		super(instance, 118);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(InfiniteIndustryItemGroup.tab).maxStackSize(1));
			setRegistryName("sulfuricacidbucket");
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
