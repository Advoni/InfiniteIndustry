
package net.mcreator.infiniteindustry.item;

@InfiniteIndustryElements.ModElement.Tag
public class GoldDrillItem extends InfiniteIndustryElements.ModElement {

	@ObjectHolder("infiniteindustry:golddrill")
	public static final Item block = null;

	public GoldDrillItem(InfiniteIndustryElements instance) {
		super(instance, 136);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 532;
			}

			public float getEfficiency() {
				return 13f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 0;
			}

			public int getEnchantability() {
				return 0;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(InfiniteIndustryItemGroup.tab)) {

		}.setRegistryName("golddrill"));
	}

}
