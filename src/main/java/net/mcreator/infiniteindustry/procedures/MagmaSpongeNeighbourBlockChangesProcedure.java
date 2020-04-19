package net.mcreator.infiniteindustry.procedures;

@InfiniteIndustryElements.ModElement.Tag
public class MagmaSpongeNeighbourBlockChangesProcedure extends InfiniteIndustryElements.ModElement {

	public MagmaSpongeNeighbourBlockChangesProcedure(InfiniteIndustryElements instance) {
		super(instance, 49);

	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MagmaSpongeNeighbourBlockChanges!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MagmaSpongeNeighbourBlockChanges!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MagmaSpongeNeighbourBlockChanges!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MagmaSpongeNeighbourBlockChanges!");
			return;
		}

		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");

		boolean foundA = false;
		boolean foundB = false;
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
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), HotMagmaSpongeBlock.block.getDefaultState(), 3);
			if (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.LAVA.getDefaultState().getBlock())) {
				foundA = (boolean) (false);
				foundB = (boolean) (false);
				world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) z), Blocks.WHITE_CONCRETE.getDefaultState(), 3);
				if (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)))).getBlock() == Blocks.LAVA.getDefaultState()
						.getBlock())) {
					world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)), Blocks.WHITE_CONCRETE.getDefaultState(), 3);
					if (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 2)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 2)), Blocks.WHITE_CONCRETE.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z + 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z + 1)), Blocks.WHITE_CONCRETE.getDefaultState(), 3);
						foundA = (boolean) (true);
					}
				}
				if (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)))).getBlock() == Blocks.LAVA.getDefaultState()
						.getBlock())) {
					world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)), Blocks.WHITE_CONCRETE.getDefaultState(), 3);
					if (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 2)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 2)), Blocks.WHITE_CONCRETE.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z - 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z - 1)), Blocks.WHITE_CONCRETE.getDefaultState(), 3);
						foundB = (boolean) (true);
					}
				}
				if (((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) z))).getBlock() == Blocks.LAVA.getDefaultState().getBlock())) {
					world.setBlockState(new BlockPos((int) (x + 2), (int) y, (int) z), Blocks.WHITE_CONCRETE.getDefaultState(), 3);
					if ((((foundA) == (false)) && ((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z + 1))))
							.getBlock() == Blocks.LAVA.getDefaultState().getBlock()))) {
						world.setBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z + 1)), Blocks.WHITE_CONCRETE.getDefaultState(), 3);
					}
					if ((((foundB) == (false)) && ((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z - 1))))
							.getBlock() == Blocks.LAVA.getDefaultState().getBlock()))) {
						world.setBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z - 1)), Blocks.WHITE_CONCRETE.getDefaultState(), 3);
					}
					foundB = (boolean) (false);
					foundA = (boolean) (false);
				}
			}
		}

	}

}
