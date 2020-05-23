package net.mcreator.infiniteindustry.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Direction;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.state.IProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.block.material.Material;
import net.minecraft.block.BlockState;

import net.mcreator.infiniteindustry.block.AdvancedPistonRodBlock;
import net.mcreator.infiniteindustry.block.AdvancedPistonBlock;
import net.mcreator.infiniteindustry.InfiniteIndustryElements;

import java.util.Map;

@InfiniteIndustryElements.ModElement.Tag
public class AdvancedPistonRodBlockDestroyedByPlayerRedstoneOnProcedure extends InfiniteIndustryElements.ModElement {
	public AdvancedPistonRodBlockDestroyedByPlayerRedstoneOnProcedure(InfiniteIndustryElements instance) {
		super(instance, 149);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure AdvancedPistonRodBlockDestroyedByPlayerRedstoneOn!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure AdvancedPistonRodBlockDestroyedByPlayerRedstoneOn!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure AdvancedPistonRodBlockDestroyedByPlayerRedstoneOn!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure AdvancedPistonRodBlockDestroyedByPlayerRedstoneOn!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double count = 0;
		double DU = 0;
		double NS = 0;
		double WE = 0;
		count = (double) 12;
		DU = (double) 0;
		NS = (double) 0;
		WE = (double) 0;
		if (((new Object() {
			public Direction getDirection(BlockPos pos) {
				try {
					BlockState _bs = world.getBlockState(pos);
					DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
					return _bs.get(property);
				} catch (Exception e) {
					return Direction.NORTH;
				}
			}
		}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.DOWN)) {
			DU = (double) -1;
		} else if (((new Object() {
			public Direction getDirection(BlockPos pos) {
				try {
					BlockState _bs = world.getBlockState(pos);
					DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
					return _bs.get(property);
				} catch (Exception e) {
					return Direction.NORTH;
				}
			}
		}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.UP)) {
			DU = (double) 1;
		} else if (((new Object() {
			public Direction getDirection(BlockPos pos) {
				try {
					BlockState _bs = world.getBlockState(pos);
					DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
					return _bs.get(property);
				} catch (Exception e) {
					return Direction.NORTH;
				}
			}
		}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.NORTH)) {
			NS = (double) -1;
		} else if (((new Object() {
			public Direction getDirection(BlockPos pos) {
				try {
					BlockState _bs = world.getBlockState(pos);
					DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
					return _bs.get(property);
				} catch (Exception e) {
					return Direction.NORTH;
				}
			}
		}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.SOUTH)) {
			NS = (double) 1;
		} else if (((new Object() {
			public Direction getDirection(BlockPos pos) {
				try {
					BlockState _bs = world.getBlockState(pos);
					DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
					return _bs.get(property);
				} catch (Exception e) {
					return Direction.NORTH;
				}
			}
		}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.WEST)) {
			WE = (double) -1;
		} else {
			WE = (double) 1;
		}
		while (((count) > 0)) {
			if ((((world.getBlockState(
					new BlockPos((int) (x + ((WE) * (13 - (count)))), (int) (y + ((DU) * (13 - (count)))), (int) (z + ((NS) * (13 - (count)))))))
							.getMaterial() == Material.PLANTS)
					|| (((world.getBlockState(new BlockPos((int) (x + ((WE) * (13 - (count)))), (int) (y + ((DU) * (13 - (count)))),
							(int) (z + ((NS) * (13 - (count))))))).getMaterial() == Material.TALL_PLANTS)
							|| (((world.getBlockState(new BlockPos((int) (x + ((WE) * (13 - (count)))), (int) (y + ((DU) * (13 - (count)))),
									(int) (z + ((NS) * (13 - (count))))))).getMaterial() == Material.WOOL)
									|| (((world.getBlockState(new BlockPos((int) (x + ((WE) * (13 - (count)))), (int) (y + ((DU) * (13 - (count)))),
											(int) (z + ((NS) * (13 - (count))))))).getMaterial() == Material.FIRE)
											|| (((world.getBlockState(new BlockPos((int) (x + ((WE) * (13 - (count)))),
													(int) (y + ((DU) * (13 - (count)))), (int) (z + ((NS) * (13 - (count)))))))
															.getMaterial() == Material.CARPET)
													|| (((world.getBlockState(new BlockPos((int) (x + ((WE) * (13 - (count)))),
															(int) (y + ((DU) * (13 - (count)))), (int) (z + ((NS) * (13 - (count)))))))
																	.getMaterial() == Material.SNOW)
															|| (((world.getBlockState(new BlockPos((int) (x + ((WE) * (13 - (count)))),
																	(int) (y + ((DU) * (13 - (count)))), (int) (z + ((NS) * (13 - (count)))))))
																			.getMaterial() == Material.SNOW_BLOCK)
																	|| (((world.getBlockState(new BlockPos((int) (x + ((WE) * (13 - (count)))),
																			(int) (y + ((DU) * (13 - (count)))),
																			(int) (z + ((NS) * (13 - (count))))))).getMaterial() == Material.CACTUS)
																			|| ((world.getBlockState(new BlockPos((int) (x + ((WE) * (13 - (count)))),
																					(int) (y + ((DU) * (13 - (count)))),
																					(int) (z + ((NS) * (13 - (count)))))))
																							.getMaterial() == Material.AIR)))))))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = AdvancedPistonBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				while (((count) < 12)) {
					world.setBlockState(
							new BlockPos((int) (x + ((WE) * (13 - (count)))), (int) (y + ((DU) * (13 - (count)))),
									(int) (z + ((NS) * (13 - (count))))),
							(world.getBlockState(new BlockPos((int) (x + ((WE) * (12 - (count)))), (int) (y + ((DU) * (12 - (count)))),
									(int) (z + ((NS) * (12 - (count))))))),
							3);
					try {
						BlockState _bs = world.getBlockState(new BlockPos((int) (x + ((WE) * (13 - (count)))), (int) (y + ((DU) * (13 - (count)))),
								(int) (z + ((NS) * (13 - (count))))));
						world.setBlockState(
								new BlockPos((int) (x + ((WE) * (13 - (count)))), (int) (y + ((DU) * (13 - (count)))),
										(int) (z + ((NS) * (13 - (count))))),
								_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), (new Object() {
									public Direction getDirection(BlockPos pos) {
										try {
											BlockState _bs = world.getBlockState(pos);
											DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
											return _bs.get(property);
										} catch (Exception e) {
											return Direction.NORTH;
										}
									}
								}.getDirection(new BlockPos((int) (x + ((WE) * (12 - (count)))), (int) (y + ((DU) * (12 - (count)))),
										(int) (z + ((NS) * (12 - (count)))))))),
								3);
					} catch (Exception e) {
					}
					count = (double) ((count) + 1);
				}
				world.setBlockState(new BlockPos((int) (x + ((WE) * 1)), (int) (y + ((DU) * 1)), (int) (z + ((NS) * 1))),
						AdvancedPistonRodBlock.block.getDefaultState(), 3);
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) (x + ((WE) * 1)), (int) (y + ((DU) * 1)), (int) (z + ((NS) * 1))));
					world.setBlockState(new BlockPos((int) (x + ((WE) * 1)), (int) (y + ((DU) * 1)), (int) (z + ((NS) * 1))),
							_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), (new Object() {
								public Direction getDirection(BlockPos pos) {
									try {
										BlockState _bs = world.getBlockState(pos);
										DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
										return _bs.get(property);
									} catch (Exception e) {
										return Direction.NORTH;
									}
								}
							}.getDirection(new BlockPos((int) x, (int) y, (int) z)))), 3);
				} catch (Exception e) {
				}
				world.playSound((PlayerEntity) null, x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.piston.extend")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1);
				break;
			} else if (((world
					.getBlockState(new BlockPos((int) (x + ((WE) * (13 - (count)))), (int) (y + ((DU) * (13 - (count)))),
							(int) (z + ((NS) * (13 - (count))))))
					.getBlock().getHarvestLevel(world.getBlockState(new BlockPos((int) (x + ((WE) * (13 - (count)))),
							(int) (y + ((DU) * (13 - (count)))), (int) (z + ((NS) * (13 - (count)))))))) > 2)) {
				break;
			} else {
				count = (double) ((count) - 1);
			}
		}
	}
}
