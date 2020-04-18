
package net.mcreator.infiniteindustry.block;

@InfiniteIndustryElements.ModElement.Tag
public class MagmaSpongeBlock extends InfiniteIndustryElements.ModElement {

	@ObjectHolder("infiniteindustry:magmasponge")
	public static final Block block = null;

	public MagmaSpongeBlock(InfiniteIndustryElements instance) {
		super(instance, 5);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(null)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(

					Block.Properties.create(Material.SPONGE).sound(SoundType.CLOTH).hardnessAndResistance(0.6f, 0.6f).lightValue(0));

			setRegistryName("magmasponge");
		}

		@Override
		public int tickRate(IWorldReader world) {
			return 5;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}

	}

}
