package net.mcreator.infiniteindustry.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.material.Material;
import net.minecraft.block.Block;

import net.mcreator.infiniteindustry.item.SulfuricAcidBucketItem;
import net.mcreator.infiniteindustry.block.SulfuricAcidBlock;
import net.mcreator.infiniteindustry.InfiniteIndustryElements;

@InfiniteIndustryElements.ModElement.Tag
public class SulfuricAcidBucketRightClickedOnBlockProcedure extends InfiniteIndustryElements.ModElement {
	public SulfuricAcidBucketRightClickedOnBlockProcedure(InfiniteIndustryElements instance) {
		super(instance, 132);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("direction") == null) {
			System.err.println("Failed to load dependency direction for procedure SulfuricAcidBucketRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure SulfuricAcidBucketRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure SulfuricAcidBucketRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure SulfuricAcidBucketRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure SulfuricAcidBucketRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure SulfuricAcidBucketRightClickedOnBlock!");
			return;
		}
		Direction direction = (Direction) dependencies.get("direction");
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		boolean FillBucket = false;
		FillBucket = (boolean) (false);
		if ((Direction.DOWN == direction)) {
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getMaterial() == Material.PLANTS) || (((world
					.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getMaterial() == Material.TALL_PLANTS)
					|| (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getMaterial() == Material.WOOL)
							|| (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getMaterial() == Material.FIRE)
									|| (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getMaterial() == Material.CARPET)
											|| (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getMaterial() == Material.SNOW)
													|| (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))
															.getMaterial() == Material.SNOW_BLOCK)
															|| (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))
																	.getMaterial() == Material.CACTUS)
																	|| (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))
																			.getMaterial() == Material.BARRIER)
																			|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))
																					.getMaterial() == Material.AIR))))))))))) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)), world,
						new BlockPos((int) x, (int) (y - 1), (int) z));
				world.destroyBlock(new BlockPos((int) x, (int) (y - 1), (int) z), false);
				world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) z), SulfuricAcidBlock.block.getDefaultState(), 3);
				FillBucket = (boolean) (true);
			}
		} else if ((Direction.UP == direction)) {
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getMaterial() == Material.PLANTS) || (((world
					.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getMaterial() == Material.TALL_PLANTS)
					|| (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getMaterial() == Material.WOOL)
							|| (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getMaterial() == Material.FIRE)
									|| (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getMaterial() == Material.CARPET)
											|| (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getMaterial() == Material.SNOW)
													|| (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))
															.getMaterial() == Material.SNOW_BLOCK)
															|| (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))
																	.getMaterial() == Material.CACTUS)
																	|| (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))
																			.getMaterial() == Material.BARRIER)
																			|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))
																					.getMaterial() == Material.AIR))))))))))) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)), world,
						new BlockPos((int) x, (int) (y + 1), (int) z));
				world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) z), false);
				world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), SulfuricAcidBlock.block.getDefaultState(), 3);
				FillBucket = (boolean) (true);
			}
		} else if ((Direction.NORTH == direction)) {
			if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getMaterial() == Material.PLANTS) || (((world
					.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getMaterial() == Material.TALL_PLANTS)
					|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getMaterial() == Material.WOOL)
							|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getMaterial() == Material.FIRE)
									|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getMaterial() == Material.CARPET)
											|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getMaterial() == Material.SNOW)
													|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))))
															.getMaterial() == Material.SNOW_BLOCK)
															|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))))
																	.getMaterial() == Material.CACTUS)
																	|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))))
																			.getMaterial() == Material.BARRIER)
																			|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))))
																					.getMaterial() == Material.AIR))))))))))) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))), world,
						new BlockPos((int) x, (int) y, (int) (z - 1)));
				world.destroyBlock(new BlockPos((int) x, (int) y, (int) (z - 1)), false);
				world.setBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)), SulfuricAcidBlock.block.getDefaultState(), 3);
				FillBucket = (boolean) (true);
			}
		} else if ((Direction.SOUTH == direction)) {
			if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getMaterial() == Material.PLANTS) || (((world
					.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getMaterial() == Material.TALL_PLANTS)
					|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getMaterial() == Material.WOOL)
							|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getMaterial() == Material.FIRE)
									|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getMaterial() == Material.CARPET)
											|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getMaterial() == Material.SNOW)
													|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))))
															.getMaterial() == Material.SNOW_BLOCK)
															|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))))
																	.getMaterial() == Material.CACTUS)
																	|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))))
																			.getMaterial() == Material.BARRIER)
																			|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))))
																					.getMaterial() == Material.AIR))))))))))) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))), world,
						new BlockPos((int) x, (int) y, (int) (z + 1)));
				world.destroyBlock(new BlockPos((int) x, (int) y, (int) (z + 1)), false);
				world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)), SulfuricAcidBlock.block.getDefaultState(), 3);
				FillBucket = (boolean) (true);
			}
		} else if ((Direction.WEST == direction)) {
			if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getMaterial() == Material.PLANTS) || (((world
					.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getMaterial() == Material.TALL_PLANTS)
					|| (((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getMaterial() == Material.WOOL)
							|| (((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getMaterial() == Material.FIRE)
									|| (((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getMaterial() == Material.CARPET)
											|| (((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getMaterial() == Material.SNOW)
													|| (((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)))
															.getMaterial() == Material.SNOW_BLOCK)
															|| (((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)))
																	.getMaterial() == Material.CACTUS)
																	|| (((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)))
																			.getMaterial() == Material.BARRIER)
																			|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)))
																					.getMaterial() == Material.AIR))))))))))) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)), world,
						new BlockPos((int) (x - 1), (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) (x - 1), (int) y, (int) z), false);
				world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) z), SulfuricAcidBlock.block.getDefaultState(), 3);
				FillBucket = (boolean) (true);
			}
		} else {
			if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getMaterial() == Material.PLANTS) || (((world
					.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getMaterial() == Material.TALL_PLANTS)
					|| (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getMaterial() == Material.WOOL)
							|| (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getMaterial() == Material.FIRE)
									|| (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getMaterial() == Material.CARPET)
											|| (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getMaterial() == Material.SNOW)
													|| (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)))
															.getMaterial() == Material.SNOW_BLOCK)
															|| (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)))
																	.getMaterial() == Material.CACTUS)
																	|| (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)))
																			.getMaterial() == Material.BARRIER)
																			|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)))
																					.getMaterial() == Material.AIR))))))))))) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)), world,
						new BlockPos((int) (x + 1), (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) (x + 1), (int) y, (int) z), false);
				world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) z), SulfuricAcidBlock.block.getDefaultState(), 3);
				FillBucket = (boolean) (true);
			}
		}
		if (((!((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).abilities.isCreativeMode : false)) && (FillBucket))) {
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).inventory
						.clearMatchingItems(p -> new ItemStack(SulfuricAcidBucketItem.block, (int) (1)).getItem() == p.getItem(), (int) 1);
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(Items.BUCKET, (int) (1));
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		}
	}
}
