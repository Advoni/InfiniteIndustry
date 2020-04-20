
package net.mcreator.infiniteindustry.world.structure;

@InfiniteIndustryElements.ModElement.Tag
public class SulfurLakeStructure extends InfiniteIndustryElements.ModElement {

	public SulfurLakeStructure(InfiniteIndustryElements instance) {
		super(instance, 70);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		Feature<NoFeatureConfig> feature = new Feature<NoFeatureConfig>(NoFeatureConfig::deserialize) {
			@Override
			public boolean place(IWorld iworld, ChunkGenerator generator, Random random, BlockPos pos, NoFeatureConfig config) {
				int ci = pos.getX();
				int ck = pos.getZ();

				DimensionType dimensionType = iworld.getDimension().getType();
				boolean dimensionCriteria = false;

				if (dimensionType == DimensionType.THE_NETHER)
					dimensionCriteria = true;

				if (!dimensionCriteria)
					return false;

				if ((random.nextInt(1000000) + 1) <= 100000) {
					int count = random.nextInt(1) + 1;
					for (int a = 0; a < count; a++) {
						int i = ci + random.nextInt(16) + 8;
						int k = ck + random.nextInt(16) + 8;
						int j = iworld.getHeight(Heightmap.Type.OCEAN_FLOOR_WG, i, k);

						j = Math.abs(random.nextInt(Math.max(1, j)) - 24);

						BlockState blockAt = iworld.getBlockState(new BlockPos(i, j, k));
						boolean blockCriteria = false;
						if (blockAt.getBlock() == Blocks.AIR.getDefaultState().getBlock())
							blockCriteria = true;
						if (!blockCriteria)
							continue;

						Template template = ((ServerWorld) iworld.getWorld()).getSaveHandler().getStructureTemplateManager()
								.getTemplateDefaulted(new ResourceLocation("infiniteindustry", "spawnsulfurlake1"));
						if (template == null)
							return false;

						Rotation rotation = Rotation.values()[random.nextInt(3)];
						Mirror mirror = Mirror.values()[random.nextInt(2)];

						BlockPos spawnTo = new BlockPos(i, j + -5, k);
						template.addBlocksToWorldChunk(iworld, spawnTo, new PlacementSettings().setRotation(rotation).setRandom(random)
								.setMirror(mirror).setChunk((ChunkPos) null).setIgnoreEntities(false));

					}
				}

				return true;
			}
		};

		for (Biome biome : ForgeRegistries.BIOMES.getValues()) {

			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_STRUCTURES,
					Biome.createDecoratedFeature(feature, IFeatureConfig.NO_FEATURE_CONFIG, Placement.NOPE, IPlacementConfig.NO_PLACEMENT_CONFIG));
		}
	}

}
