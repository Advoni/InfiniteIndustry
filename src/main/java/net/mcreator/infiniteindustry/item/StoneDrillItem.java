
package net.mcreator.infiniteindustry.item;

@InfiniteIndustryElements.ModElement.Tag
public class StoneDrillItem extends InfiniteIndustryElements.ModElement {

	@ObjectHolder("infiniteindustry:stonedrill")
	public static final Item block = null;

	public StoneDrillItem(InfiniteIndustryElements instance) {
		super(instance, 134);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 631;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 1f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 0;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(InfiniteIndustryItemGroup.tab)) {

		}.setRegistryName("stonedrill"));
	}

}
