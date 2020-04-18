
package net.mcreator.infiniteindustry.block;

@InfiniteIndustryElements.ModElement.Tag
public class HotMagmaSpongeBlock extends InfiniteIndustryElements.ModElement {

	@ObjectHolder("infiniteindustry:hotmagmasponge")
	public static final Block block = null;

	public HotMagmaSpongeBlock(InfiniteIndustryElements instance) {
		super(instance, 6);

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

			setRegistryName("hotmagmasponge");
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
