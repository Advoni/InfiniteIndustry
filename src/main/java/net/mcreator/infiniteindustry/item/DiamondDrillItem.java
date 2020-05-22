
package net.mcreator.infiniteindustry.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.infiniteindustry.itemgroup.InfiniteIndustryItemGroup;
import net.mcreator.infiniteindustry.InfiniteIndustryElements;

@InfiniteIndustryElements.ModElement.Tag
public class DiamondDrillItem extends InfiniteIndustryElements.ModElement {
	@ObjectHolder("infiniteindustry:diamonddrill")
	public static final Item block = null;
	public DiamondDrillItem(InfiniteIndustryElements instance) {
		super(instance, 133);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 2061;
			}

			public float getEfficiency() {
				return 10f;
			}

			public float getAttackDamage() {
				return 3f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 0;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(InfiniteIndustryItemGroup.tab)) {
		}.setRegistryName("diamonddrill"));
	}
}
