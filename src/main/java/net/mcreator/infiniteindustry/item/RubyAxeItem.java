
package net.mcreator.infiniteindustry.item;

@InfiniteIndustryElements.ModElement.Tag
public class RubyAxeItem extends InfiniteIndustryElements.ModElement {

	@ObjectHolder("infiniteindustry:rubyaxe")
	public static final Item block = null;

	public RubyAxeItem(InfiniteIndustryElements instance) {
		super(instance, 139);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1561;
			}

			public float getEfficiency() {
				return 7f;
			}

			public float getAttackDamage() {
				return 6f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 19;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(InfiniteIndustryItemGroup.tab)) {

		}.setRegistryName("rubyaxe"));
	}

}
