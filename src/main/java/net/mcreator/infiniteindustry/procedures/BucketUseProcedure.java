package net.mcreator.infiniteindustry.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.infiniteindustry.block.SulfuricAcidBlock;
import net.mcreator.infiniteindustry.InfiniteIndustryElements;

@InfiniteIndustryElements.ModElement.Tag
public class BucketUseProcedure extends InfiniteIndustryElements.ModElement {
	public BucketUseProcedure(InfiniteIndustryElements instance) {
		super(instance, 119);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure BucketUse!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure BucketUse!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		double goThrough = 0;
		if ((new ItemStack(Items.BUCKET, (int) (1))
				.getItem() == ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem())) {
			goThrough = (double) 200;
			while ((0 < (goThrough))) {
				if ((Blocks.AIR.getDefaultState()
						.getBlock() == (world.getBlockState(new BlockPos(
								(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
										entity.getEyePosition(1f).add(entity.getLook(1f).x * (((200 - (goThrough)) / 200) * 5),
												entity.getLook(1f).y * (((200 - (goThrough)) / 200) * 5),
												entity.getLook(1f).z * (((200 - (goThrough)) / 200) * 5)),
										RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getX()),
								(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
										entity.getEyePosition(1f).add(entity.getLook(1f).x * (((200 - (goThrough)) / 200) * 5),
												entity.getLook(1f).y * (((200 - (goThrough)) / 200) * 5),
												entity.getLook(1f).z * (((200 - (goThrough)) / 200) * 5)),
										RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getY()),
								(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
										entity.getEyePosition(1f).add(entity.getLook(1f).x * (((200 - (goThrough)) / 200) * 5),
												entity.getLook(1f).y * (((200 - (goThrough)) / 200) * 5),
												entity.getLook(1f).z * (((200 - (goThrough)) / 200) * 5)),
										RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ())))).getBlock())) {
					goThrough = (double) ((goThrough) - 1);
				} else if ((SulfuricAcidBlock.block.getDefaultState()
						.getBlock() == (world.getBlockState(new BlockPos(
								(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
										entity.getEyePosition(1f).add(entity.getLook(1f).x * (((200 - (goThrough)) / 200) * 5),
												entity.getLook(1f).y * (((200 - (goThrough)) / 200) * 5),
												entity.getLook(1f).z * (((200 - (goThrough)) / 200) * 5)),
										RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getX()),
								(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
										entity.getEyePosition(1f).add(entity.getLook(1f).x * (((200 - (goThrough)) / 200) * 5),
												entity.getLook(1f).y * (((200 - (goThrough)) / 200) * 5),
												entity.getLook(1f).z * (((200 - (goThrough)) / 200) * 5)),
										RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getY()),
								(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
										entity.getEyePosition(1f).add(entity.getLook(1f).x * (((200 - (goThrough)) / 200) * 5),
												entity.getLook(1f).y * (((200 - (goThrough)) / 200) * 5),
												entity.getLook(1f).z * (((200 - (goThrough)) / 200) * 5)),
										RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ())))).getBlock())) {
					world.setBlockState(new BlockPos(
							(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
									entity.getEyePosition(1f).add(entity.getLook(1f).x * (((200 - (goThrough)) / 200) * 5),
											entity.getLook(1f).y * (((200 - (goThrough)) / 200) * 5),
											entity.getLook(1f).z * (((200 - (goThrough)) / 200) * 5)),
									RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getX()),
							(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
									entity.getEyePosition(1f).add(entity.getLook(1f).x * (((200 - (goThrough)) / 200) * 5),
											entity.getLook(1f).y * (((200 - (goThrough)) / 200) * 5),
											entity.getLook(1f).z * (((200 - (goThrough)) / 200) * 5)),
									RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getY()),
							(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
									entity.getEyePosition(1f).add(entity.getLook(1f).x * (((200 - (goThrough)) / 200) * 5),
											entity.getLook(1f).y * (((200 - (goThrough)) / 200) * 5),
											entity.getLook(1f).z * (((200 - (goThrough)) / 200) * 5)),
									RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ())),
							Blocks.WHITE_CONCRETE.getDefaultState(), 3);
					goThrough = (double) 0;
				} else {
					goThrough = (double) 0;
				}
			}
		}
	}

	@SubscribeEvent
	public void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
		PlayerEntity entity = event.getPlayer();
		int i = event.getPos().getX();
		int j = event.getPos().getY();
		int k = event.getPos().getZ();
		World world = event.getWorld();
		java.util.HashMap<String, Object> dependencies = new java.util.HashMap<>();
		dependencies.put("x", i);
		dependencies.put("y", j);
		dependencies.put("z", k);
		dependencies.put("world", world);
		dependencies.put("entity", entity);
		dependencies.put("event", event);
		this.executeProcedure(dependencies);
	}
}
