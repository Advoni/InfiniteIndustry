package net.mcreator.infiniteindustry.procedures;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.mcreator.infiniteindustry.block.HotMagmaSpongeBlock;
import net.mcreator.infiniteindustry.InfiniteIndustryElements;

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
				world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
				if (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)))).getBlock() == Blocks.LAVA.getDefaultState()
						.getBlock())) {
					world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
					if (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 2)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 2)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z + 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
					}
				}
				if (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)))).getBlock() == Blocks.LAVA.getDefaultState()
						.getBlock())) {
					world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
					if (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 2)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 2)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z - 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
					}
				}
				if (((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) z))).getBlock() == Blocks.LAVA.getDefaultState().getBlock())) {
					world.setBlockState(new BlockPos((int) (x + 2), (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
					if (((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z + 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z - 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x + 2), (int) (y + 1), (int) z))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x + 2), (int) (y + 1), (int) z), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 1), (int) z))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x + 2), (int) (y - 1), (int) z), Blocks.AIR.getDefaultState(), 3);
					}
				}
				if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z))).getBlock() == Blocks.LAVA.getDefaultState()
						.getBlock())) {
					world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z), Blocks.AIR.getDefaultState(), 3);
					if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x + 2), (int) (y + 1), (int) z))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x + 2), (int) (y + 1), (int) z), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 2), (int) z))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 2), (int) z), Blocks.AIR.getDefaultState(), 3);
					}
				}
				if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z))).getBlock() == Blocks.LAVA.getDefaultState()
						.getBlock())) {
					world.setBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z), Blocks.AIR.getDefaultState(), 3);
					if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 1), (int) z))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x + 2), (int) (y - 1), (int) z), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 2), (int) z))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x + 1), (int) (y - 2), (int) z), Blocks.AIR.getDefaultState(), 3);
					}
				}
			}
			if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Blocks.LAVA.getDefaultState().getBlock())) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
				if (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)))).getBlock() == Blocks.LAVA.getDefaultState()
						.getBlock())) {
					world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
					if (((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z + 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 2)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 2)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
					}
				}
				if (((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 1)))).getBlock() == Blocks.LAVA.getDefaultState()
						.getBlock())) {
					world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
					if (((world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) (z + 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x - 2), (int) y, (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 2)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 2)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
					}
				}
				if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 2)))).getBlock() == Blocks.LAVA.getDefaultState().getBlock())) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 2)), Blocks.AIR.getDefaultState(), 3);
					if (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 2)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 2)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 2)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 2)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 2)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 2)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 2)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 2)), Blocks.AIR.getDefaultState(), 3);
					}
				}
				if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)))).getBlock() == Blocks.LAVA.getDefaultState()
						.getBlock())) {
					world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
					if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 2)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 2)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z + 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
					}
				}
				if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.LAVA.getDefaultState()
						.getBlock())) {
					world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
					if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 2)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 2)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z + 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
					}
				}
			}
			if (((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.LAVA.getDefaultState().getBlock())) {
				world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
				if (((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 1)))).getBlock() == Blocks.LAVA.getDefaultState()
						.getBlock())) {
					world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
					if (((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 2)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 2)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) (z + 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x - 2), (int) y, (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
					}
				}
				if (((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1)))).getBlock() == Blocks.LAVA.getDefaultState()
						.getBlock())) {
					world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
					if (((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 2)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 2)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) (z - 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x - 2), (int) y, (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
					}
				}
				if (((world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) z))).getBlock() == Blocks.LAVA.getDefaultState().getBlock())) {
					world.setBlockState(new BlockPos((int) (x - 2), (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
					if (((world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) (z + 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x - 2), (int) y, (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) (z - 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x - 2), (int) y, (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 1), (int) z))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x - 2), (int) (y + 1), (int) z), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 1), (int) z))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x - 2), (int) (y - 1), (int) z), Blocks.AIR.getDefaultState(), 3);
					}
				}
				if (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z))).getBlock() == Blocks.LAVA.getDefaultState()
						.getBlock())) {
					world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z), Blocks.AIR.getDefaultState(), 3);
					if (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 1), (int) z))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x - 2), (int) (y + 1), (int) z), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 2), (int) z))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 2), (int) z), Blocks.AIR.getDefaultState(), 3);
					}
				}
				if (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z))).getBlock() == Blocks.LAVA.getDefaultState()
						.getBlock())) {
					world.setBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z), Blocks.AIR.getDefaultState(), 3);
					if (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 1), (int) z))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x - 2), (int) (y - 1), (int) z), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 2), (int) z))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x - 1), (int) (y - 2), (int) z), Blocks.AIR.getDefaultState(), 3);
					}
				}
			}
			if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Blocks.LAVA.getDefaultState().getBlock())) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
				if (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)))).getBlock() == Blocks.LAVA.getDefaultState()
						.getBlock())) {
					world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
					if (((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z - 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 2)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 2)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
					}
				}
				if (((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1)))).getBlock() == Blocks.LAVA.getDefaultState()
						.getBlock())) {
					world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
					if (((world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) (z - 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x - 2), (int) y, (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 2)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 2)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
					}
				}
				if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 2)))).getBlock() == Blocks.LAVA.getDefaultState().getBlock())) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) (z - 2)), Blocks.AIR.getDefaultState(), 3);
					if (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 2)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 2)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 2)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 2)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 2)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 2)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 2)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 2)), Blocks.AIR.getDefaultState(), 3);
					}
				}
				if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)))).getBlock() == Blocks.LAVA.getDefaultState()
						.getBlock())) {
					world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
					if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 2)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 2)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z - 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
					}
				}
				if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.LAVA.getDefaultState()
						.getBlock())) {
					world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
					if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 2)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 2)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z - 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
					}
				}
			}
			if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.LAVA.getDefaultState().getBlock())) {
				world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Blocks.AIR.getDefaultState(), 3);
				if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)))).getBlock() == Blocks.LAVA.getDefaultState()
						.getBlock())) {
					world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
					if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 2)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 2)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z + 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
					}
				}
				if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)))).getBlock() == Blocks.LAVA.getDefaultState()
						.getBlock())) {
					world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
					if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 2)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 2)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z - 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
					}
				}
				if (((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) z))).getBlock() == Blocks.LAVA.getDefaultState().getBlock())) {
					world.setBlockState(new BlockPos((int) x, (int) (y + 2), (int) z), Blocks.AIR.getDefaultState(), 3);
					if (((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z + 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z - 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 2), (int) z))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 2), (int) z), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 2), (int) z))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 2), (int) z), Blocks.AIR.getDefaultState(), 3);
					}
				}
				if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z))).getBlock() == Blocks.LAVA.getDefaultState()
						.getBlock())) {
					world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z), Blocks.AIR.getDefaultState(), 3);
					if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x + 2), (int) (y + 1), (int) z))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x + 2), (int) (y + 1), (int) z), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 2), (int) z))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 2), (int) z), Blocks.AIR.getDefaultState(), 3);
					}
				}
				if (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z))).getBlock() == Blocks.LAVA.getDefaultState()
						.getBlock())) {
					world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z), Blocks.AIR.getDefaultState(), 3);
					if (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x - 2), (int) (y + 1), (int) z))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x - 2), (int) (y + 1), (int) z), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 2), (int) z))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 2), (int) z), Blocks.AIR.getDefaultState(), 3);
					}
				}
			}
			if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.LAVA.getDefaultState().getBlock())) {
				world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) z), Blocks.AIR.getDefaultState(), 3);
				if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.LAVA.getDefaultState()
						.getBlock())) {
					world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
					if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 2)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 2)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z + 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
					}
				}
				if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.LAVA.getDefaultState()
						.getBlock())) {
					world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
					if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 2)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 2)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z - 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
					}
				}
				if (((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) z))).getBlock() == Blocks.LAVA.getDefaultState().getBlock())) {
					world.setBlockState(new BlockPos((int) x, (int) (y - 2), (int) z), Blocks.AIR.getDefaultState(), 3);
					if (((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z + 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z - 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 2), (int) z))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x + 1), (int) (y - 2), (int) z), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 2), (int) z))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x - 1), (int) (y - 2), (int) z), Blocks.AIR.getDefaultState(), 3);
					}
				}
				if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z))).getBlock() == Blocks.LAVA.getDefaultState()
						.getBlock())) {
					world.setBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z), Blocks.AIR.getDefaultState(), 3);
					if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x + 2), (int) (y - 1), (int) z))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x + 2), (int) (y - 1), (int) z), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 2), (int) z))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x + 1), (int) (y - 2), (int) z), Blocks.AIR.getDefaultState(), 3);
					}
				}
				if (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z))).getBlock() == Blocks.LAVA.getDefaultState()
						.getBlock())) {
					world.setBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z), Blocks.AIR.getDefaultState(), 3);
					if (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 1), (int) z))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x - 2), (int) (y - 1), (int) z), Blocks.AIR.getDefaultState(), 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 2), (int) z))).getBlock() == Blocks.LAVA.getDefaultState()
							.getBlock())) {
						world.setBlockState(new BlockPos((int) (x - 1), (int) (y - 2), (int) z), Blocks.AIR.getDefaultState(), 3);
					}
				}
			}
		}
	}
}
