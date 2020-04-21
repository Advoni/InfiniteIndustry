
package net.mcreator.infiniteindustry.item;

@InfiniteIndustryElements.ModElement.Tag
public class IronDrillItem extends InfiniteIndustryElements.ModElement {

	@ObjectHolder("infiniteindustry:irondrill")
	public static final Item block = null;

	public IronDrillItem(InfiniteIndustryElements instance) {
		super(instance, 135);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 750;
			}

			public float getEfficiency() {
				return 8f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 0;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(InfiniteIndustryItemGroup.tab)) {

		}.setRegistryName("irondrill"));
	}

}
