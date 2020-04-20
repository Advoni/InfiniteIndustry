package net.mcreator.infiniteindustry.procedures;

@InfiniteIndustryElements.ModElement.Tag
public class SpawnSulfurLake1UpdateTickProcedure extends InfiniteIndustryElements.ModElement {

	public SpawnSulfurLake1UpdateTickProcedure(InfiniteIndustryElements instance) {
		super(instance, 71);

	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure SpawnSulfurLake1UpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure SpawnSulfurLake1UpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure SpawnSulfurLake1UpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure SpawnSulfurLake1UpdateTick!");
			return;
		}

		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");

		if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.LAVA.getDefaultState().getBlock())
				|| (((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.LAVA.getDefaultState().getBlock())
						|| (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.LAVA.getDefaultState()
								.getBlock())
								|| (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.LAVA.getDefaultState()
										.getBlock())
										|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Blocks.LAVA
												.getDefaultState().getBlock())
												|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Blocks.LAVA
														.getDefaultState().getBlock()))))))) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.LAVA.getDefaultState(), 3);
		} else if ((!(Blocks.AIR.getDefaultState().getBlock() == (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock()))) {
			if (!world.isRemote) {
				Template template = ((ServerWorld) world.getWorld()).getSaveHandler().getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("infiniteindustry", "sulfurlake1"));
				if (template != null) {
					template.addBlocksToWorldChunk(world, new BlockPos((int) (x - 6), (int) (y - 5), (int) (z - 7)), new PlacementSettings()
							.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk((ChunkPos) null).setIgnoreEntities(false));
				}
			}
		}

	}

}
