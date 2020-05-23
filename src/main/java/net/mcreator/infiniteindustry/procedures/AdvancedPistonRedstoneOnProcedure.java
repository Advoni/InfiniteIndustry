package net.mcreator.infiniteindustry.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Direction;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.state.DirectionProperty;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.block.material.Material;
import net.minecraft.block.BlockState;

import net.mcreator.infiniteindustry.block.AdvancedPistonTopBlock;
import net.mcreator.infiniteindustry.block.AdvancedPistonRodExtendedBlock;
import net.mcreator.infiniteindustry.InfiniteIndustryElements;

@InfiniteIndustryElements.ModElement.Tag
public class AdvancedPistonRedstoneOnProcedure extends InfiniteIndustryElements.ModElement {
	public AdvancedPistonRedstoneOnProcedure(InfiniteIndustryElements instance) {
		super(instance, 151);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure AdvancedPistonRedstoneOn!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure AdvancedPistonRedstoneOn!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure AdvancedPistonRedstoneOn!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure AdvancedPistonRedstoneOn!");
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
		if ((!(((world.getBlockState(new BlockPos((int) (x + (WE)), (int) (y + (DU)), (int) (z + (NS)))))
				.getBlock() == AdvancedPistonRodExtendedBlock.block.getDefaultState().getBlock()) && ((new Object() {
					public Direction getDirection(BlockPos pos) {
						try {
							BlockState _bs = world.getBlockState(pos);
							DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
							return _bs.get(property);
						} catch (Exception e) {
							return Direction.NORTH;
						}
					}
				}.getDirection(new BlockPos((int) (x + (WE)), (int) (y + (DU)), (int) (z + (NS))))) == (new Object() {
					public Direction getDirection(BlockPos pos) {
						try {
							BlockState _bs = world.getBlockState(pos);
							DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
							return _bs.get(property);
						} catch (Exception e) {
							return Direction.NORTH;
						}
					}
				}.getDirection(new BlockPos((int) x, (int) y, (int) z))))))) {
			if ((!(new Object() {
				public boolean getValue(BlockPos pos, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos);
					if (tileEntity != null)
						return tileEntity.getTileData().getBoolean(tag);
					return false;
				}
			}.getValue(new BlockPos((int) x, (int) y, (int) z), "Redstone")))) {
				while (((count) > 0)) {
					if ((((world.getBlockState(new BlockPos((int) (x + ((WE) * (14 - (count)))), (int) (y + ((DU) * (14 - (count)))),
							(int) (z + ((NS) * (14 - (count))))))).getMaterial() == Material.PLANTS)
							|| (((world.getBlockState(new BlockPos((int) (x + ((WE) * (14 - (count)))), (int) (y + ((DU) * (14 - (count)))),
									(int) (z + ((NS) * (14 - (count))))))).getMaterial() == Material.ROCK)
									|| (((world.getBlockState(new BlockPos((int) (x + ((WE) * (14 - (count)))), (int) (y + ((DU) * (14 - (count)))),
											(int) (z + ((NS) * (14 - (count))))))).getMaterial() == Material.WOOL)
											|| (((world.getBlockState(new BlockPos((int) (x + ((WE) * (14 - (count)))),
													(int) (y + ((DU) * (14 - (count)))), (int) (z + ((NS) * (14 - (count)))))))
															.getMaterial() == Material.FIRE)
													|| (((world.getBlockState(new BlockPos((int) (x + ((WE) * (14 - (count)))),
															(int) (y + ((DU) * (14 - (count)))), (int) (z + ((NS) * (14 - (count)))))))
																	.getMaterial() == Material.CARPET)
															|| (((world.getBlockState(new BlockPos((int) (x + ((WE) * (14 - (count)))),
																	(int) (y + ((DU) * (14 - (count)))), (int) (z + ((NS) * (14 - (count)))))))
																			.getMaterial() == Material.SNOW)
																	|| (((world.getBlockState(new BlockPos((int) (x + ((WE) * (14 - (count)))),
																			(int) (y + ((DU) * (14 - (count)))),
																			(int) (z + ((NS) * (14 - (count)))))))
																					.getMaterial() == Material.SNOW_BLOCK)
																			|| (((world
																					.getBlockState(new BlockPos((int) (x + ((WE) * (14 - (count)))),
																							(int) (y + ((DU) * (14 - (count)))),
																							(int) (z + ((NS) * (14 - (count)))))))
																									.getMaterial() == Material.CACTUS)
																					|| ((world.getBlockState(
																							new BlockPos((int) (x + ((WE) * (14 - (count)))),
																									(int) (y + ((DU) * (14 - (count)))),
																									(int) (z + ((NS) * (14 - (count)))))))
																											.getMaterial() == Material.AIR)))))))))) {
						while (((count) < 12)) {
							world.setBlockState(
									new BlockPos((int) (x + ((WE) * (14 - (count)))), (int) (y + ((DU) * (14 - (count)))),
											(int) (z + ((NS) * (14 - (count))))),
									(world.getBlockState(new BlockPos((int) (x + ((WE) * (13 - (count)))), (int) (y + ((DU) * (13 - (count)))),
											(int) (z + ((NS) * (13 - (count))))))),
									3);
							try {
								BlockState _bs = world.getBlockState(new BlockPos((int) (x + ((WE) * (14 - (count)))),
										(int) (y + ((DU) * (14 - (count)))), (int) (z + ((NS) * (14 - (count))))));
								world.setBlockState(
										new BlockPos((int) (x + ((WE) * (14 - (count)))), (int) (y + ((DU) * (14 - (count)))),
												(int) (z + ((NS) * (14 - (count))))),
										_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), (new Object() {
											public Direction getDirection(BlockPos pos) {
												try {
													BlockState _bs = world.getBlockState(pos);
													DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer()
															.getProperty("facing");
													return _bs.get(property);
												} catch (Exception e) {
													return Direction.NORTH;
												}
											}
										}.getDirection(new BlockPos((int) (x + ((WE) * (13 - (count)))), (int) (y + ((DU) * (13 - (count)))),
												(int) (z + ((NS) * (13 - (count)))))))),
										3);
							} catch (Exception e) {
							}
							count = (double) ((count) + 1);
						}
						world.setBlockState(new BlockPos((int) (x + (WE)), (int) (y + (DU)), (int) (z + (NS))),
								AdvancedPistonRodExtendedBlock.block.getDefaultState(), 3);
						try {
							BlockState _bs = world.getBlockState(new BlockPos((int) (x + (WE)), (int) (y + (DU)), (int) (z + (NS))));
							world.setBlockState(new BlockPos((int) (x + (WE)), (int) (y + (DU)), (int) (z + (NS))),
									_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), (new Object() {
										public Direction getDirection(BlockPos pos) {
											try {
												BlockState _bs = world.getBlockState(pos);
												DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer()
														.getProperty("facing");
												return _bs.get(property);
											} catch (Exception e) {
												return Direction.NORTH;
											}
										}
									}.getDirection(new BlockPos((int) x, (int) y, (int) z)))), 3);
						} catch (Exception e) {
						}
						world.setBlockState(new BlockPos((int) (x + ((WE) * 2)), (int) (y + ((DU) * 2)), (int) (z + ((NS) * 2))),
								AdvancedPistonTopBlock.block.getDefaultState(), 3);
						try {
							BlockState _bs = world
									.getBlockState(new BlockPos((int) (x + ((WE) * 2)), (int) (y + ((DU) * 2)), (int) (z + ((NS) * 2))));
							world.setBlockState(new BlockPos((int) (x + ((WE) * 2)), (int) (y + ((DU) * 2)), (int) (z + ((NS) * 2))),
									_bs.with((DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing"), (new Object() {
										public Direction getDirection(BlockPos pos) {
											try {
												BlockState _bs = world.getBlockState(pos);
												DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer()
														.getProperty("facing");
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
						if (!world.isRemote) {
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							TileEntity _tileEntity = world.getTileEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_tileEntity != null)
								_tileEntity.getTileData().putBoolean("Redstone", (true));
							world.notifyBlockUpdate(_bp, _bs, _bs, 3);
						}
						break;
					} else if (((world
							.getBlockState(new BlockPos((int) (x + ((WE) * (14 - (count)))), (int) (y + ((DU) * (14 - (count)))),
									(int) (z + ((NS) * (14 - (count))))))
							.getBlock().getHarvestLevel(world.getBlockState(new BlockPos((int) (x + ((WE) * (14 - (count)))),
									(int) (y + ((DU) * (14 - (count)))), (int) (z + ((NS) * (14 - (count)))))))) > 2)) {
						break;
					} else {
						count = (double) ((count) - 1);
					}
				}
			}
		}
	}
}
