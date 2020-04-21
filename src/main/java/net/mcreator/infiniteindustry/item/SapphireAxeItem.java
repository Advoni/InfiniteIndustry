
package net.mcreator.infiniteindustry.item;

@InfiniteIndustryElements.ModElement.Tag
public class SapphireAxeItem extends InfiniteIndustryElements.ModElement {

	@ObjectHolder("infiniteindustry:sapphireaxe")
	public static final Item block = null;

	public SapphireAxeItem(InfiniteIndustryElements instance) {
		super(instance, 138);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1216;
			}

			public float getEfficiency() {
				return 10f;
			}

			public float getAttackDamage() {
				return 6f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(InfiniteIndustryItemGroup.tab)) {

		}.setRegistryName("sapphireaxe"));
	}

}
