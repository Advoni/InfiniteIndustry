package net.mcreator.infiniteindustry.procedures;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.state.DirectionProperty;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.mcreator.infiniteindustry.block.AdvancedPistonRodExtendedBlock;
import net.mcreator.infiniteindustry.block.AdvancedPistonBlockBlock;
import net.mcreator.infiniteindustry.InfiniteIndustryElements;

@InfiniteIndustryElements.ModElement.Tag
public class AdvancedPistonTopBlockDestroyedByExplosionProcedure extends InfiniteIndustryElements.ModElement {
	public AdvancedPistonTopBlockDestroyedByExplosionProcedure(InfiniteIndustryElements instance) {
		super(instance, 146);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure AdvancedPistonTopBlockDestroyedByExplosion!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure AdvancedPistonTopBlockDestroyedByExplosion!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure AdvancedPistonTopBlockDestroyedByExplosion!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure AdvancedPistonTopBlockDestroyedByExplosion!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((((new Object() {
			public Direction getDirection(BlockPos pos) {
				try {
					BlockState _bs = world.getBlockState(pos);
					DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
					return _bs.get(property);
				} catch (Exception e) {
					return Direction.NORTH;
				}
			}
		}.getDirection(new BlockPos((int) x, (int) (y + 1), (int) z))) == Direction.DOWN)
				&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == AdvancedPistonRodExtendedBlock.block
						.getDefaultState().getBlock()))) {
			world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y + 2), (int) z), Blocks.AIR.getDefaultState(), 3);
			if (!world.isRemote) {
				ItemEntity entityToSpawn = new ItemEntity(world, x, (y + 2), z, new ItemStack(AdvancedPistonBlockBlock.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.addEntity(entityToSpawn);
			}
		} else if ((((new Object() {
			public Direction getDirection(BlockPos pos) {
				try {
					BlockState _bs = world.getBlockState(pos);
					DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
					return _bs.get(property);
				} catch (Exception e) {
					return Direction.NORTH;
				}
			}
		}.getDirection(new BlockPos((int) x, (int) (y - 1), (int) z))) == Direction.UP)
				&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == AdvancedPistonRodExtendedBlock.block
						.getDefaultState().getBlock()))) {
			world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) z), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y - 2), (int) z), Blocks.AIR.getDefaultState(), 3);
			if (!world.isRemote) {
				ItemEntity entityToSpawn = new ItemEntity(world, x, (y - 2), z, new ItemStack(AdvancedPistonBlockBlock.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.addEntity(entityToSpawn);
			}
		} else if ((((new Object() {
			public Direction getDirection(BlockPos pos) {
				try {
					BlockState _bs = world.getBlockState(pos);
					DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
					return _bs.get(property);
				} catch (Exception e) {
					return Direction.NORTH;
				}
			}
		}.getDirection(new BlockPos((int) x, (int) y, (int) (z + 1)))) == Direction.NORTH)
				&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == AdvancedPistonRodExtendedBlock.block
						.getDefaultState().getBlock()))) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 2)), Blocks.AIR.getDefaultState(), 3);
			if (!world.isRemote) {
				ItemEntity entityToSpawn = new ItemEntity(world, x, y, (z + 2), new ItemStack(AdvancedPistonBlockBlock.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.addEntity(entityToSpawn);
			}
		} else if ((((new Object() {
			public Direction getDirection(BlockPos pos) {
				try {
					BlockState _bs = world.getBlockState(pos);
					DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
					return _bs.get(property);
				} catch (Exception e) {
					return Direction.NORTH;
				}
			}
		}.getDirection(new BlockPos((int) x, (int) y, (int) (z - 1)))) == Direction.SOUTH)
				&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == AdvancedPistonRodExtendedBlock.block
						.getDefaultState().getBlock()))) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) y, (int) (z - 2)), Blocks.AIR.getDefaultState(), 3);
			if (!world.isRemote) {
				ItemEntity entityToSpawn = new ItemEntity(world, x, y, (z - 2), new ItemStack(AdvancedPistonBlockBlock.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.addEntity(entityToSpawn);
			}
		} else if ((((new Object() {
			public Direction getDirection(BlockPos pos) {
				try {
					BlockState _bs = world.getBlockState(pos);
					DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
					return _bs.get(property);
				} catch (Exception e) {
					return Direction.NORTH;
				}
			}
		}.getDirection(new BlockPos((int) (x + 1), (int) y, (int) z))) == Direction.WEST)
				&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == AdvancedPistonRodExtendedBlock.block
						.getDefaultState().getBlock()))) {
			world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x + 2), (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
			if (!world.isRemote) {
				ItemEntity entityToSpawn = new ItemEntity(world, (x + 2), y, z, new ItemStack(AdvancedPistonBlockBlock.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.addEntity(entityToSpawn);
			}
		} else if ((((new Object() {
			public Direction getDirection(BlockPos pos) {
				try {
					BlockState _bs = world.getBlockState(pos);
					DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
					return _bs.get(property);
				} catch (Exception e) {
					return Direction.NORTH;
				}
			}
		}.getDirection(new BlockPos((int) (x - 1), (int) y, (int) z))) == Direction.EAST)
				&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == AdvancedPistonRodExtendedBlock.block
						.getDefaultState().getBlock()))) {
			world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x - 2), (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
			if (!world.isRemote) {
				ItemEntity entityToSpawn = new ItemEntity(world, (x - 2), y, z, new ItemStack(AdvancedPistonBlockBlock.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.addEntity(entityToSpawn);
			}
		}
	}
}
