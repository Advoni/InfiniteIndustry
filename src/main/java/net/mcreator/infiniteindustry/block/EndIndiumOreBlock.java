
package net.mcreator.infiniteindustry.block;

@InfiniteIndustryElements.ModElement.Tag
public class EndIndiumOreBlock extends InfiniteIndustryElements.ModElement {

	@ObjectHolder("infiniteindustry:endindiumore")
	public static final Block block = null;

	public EndIndiumOreBlock(InfiniteIndustryElements instance) {
		super(instance, 50);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(InfiniteIndustryItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(

					Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(3f, 30f).lightValue(0).harvestLevel(4)
							.harvestTool(ToolType.PICKAXE));

			setRegistryName("endindiumore");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}

	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		for (Biome biome : ForgeRegistries.BIOMES.getValues()) {

			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(new OreFeature(OreFeatureConfig::deserialize) {
				@Override
				public boolean place(IWorld world, ChunkGenerator generator, Random rand, BlockPos pos, OreFeatureConfig config) {
					DimensionType dimensionType = world.getDimension().getType();
					boolean dimensionCriteria = false;

					if (dimensionType == DimensionType.THE_END)
						dimensionCriteria = true;

					if (!dimensionCriteria)
						return false;

					return super.place(world, generator, rand, pos, config);
				}
			}, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("endindiumore", "endindiumore", blockAt -> {
				boolean blockCriteria = false;
				if (blockAt.getBlock() == Blocks.END_STONE.getDefaultState().getBlock())
					blockCriteria = true;
				return blockCriteria;
			}), block.getDefaultState(), 5), Placement.COUNT_RANGE, new CountRangeConfig(7, 0, 0, 256)));
		}
	}

}