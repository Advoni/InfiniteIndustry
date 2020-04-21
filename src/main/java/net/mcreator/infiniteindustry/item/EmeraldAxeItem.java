
package net.mcreator.infiniteindustry.item;

@InfiniteIndustryElements.ModElement.Tag
public class EmeraldAxeItem extends InfiniteIndustryElements.ModElement {

	@ObjectHolder("infiniteindustry:emeraldaxe")
	public static final Item block = null;

	public EmeraldAxeItem(InfiniteIndustryElements instance) {
		super(instance, 137);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1024;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return 6f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 22;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(InfiniteIndustryItemGroup.tab)) {

		}.setRegistryName("emeraldaxe"));
	}

}
