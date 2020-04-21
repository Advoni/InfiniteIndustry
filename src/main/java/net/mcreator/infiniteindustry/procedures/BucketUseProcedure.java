package net.mcreator.infiniteindustry.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;
import net.minecraft.block.Blocks;

import net.mcreator.infiniteindustry.item.SulfuricAcidBucketItem;
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
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure BucketUse!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure BucketUse!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure BucketUse!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure BucketUse!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double goThrough = 0;
		double BlockX = 0;
		double BlockY = 0;
		double BlockZ = 0;
		if ((new ItemStack(Items.BUCKET, (int) (1))
				.getItem() == ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem())) {
			goThrough = (double) 200;
			while ((0 < (goThrough))) {
				BlockX = (double) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
						entity.getEyePosition(1f).add(entity.getLook(1f).x * (((200 - (goThrough)) / 200) * 5),
								entity.getLook(1f).y * (((200 - (goThrough)) / 200) * 5), entity.getLook(1f).z * (((200 - (goThrough)) / 200) * 5)),
						RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getX());
				BlockY = (double) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
						entity.getEyePosition(1f).add(entity.getLook(1f).x * (((200 - (goThrough)) / 200) * 5),
								entity.getLook(1f).y * (((200 - (goThrough)) / 200) * 5), entity.getLook(1f).z * (((200 - (goThrough)) / 200) * 5)),
						RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getY());
				BlockZ = (double) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
						entity.getEyePosition(1f).add(entity.getLook(1f).x * (((200 - (goThrough)) / 200) * 5),
								entity.getLook(1f).y * (((200 - (goThrough)) / 200) * 5), entity.getLook(1f).z * (((200 - (goThrough)) / 200) * 5)),
						RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ());
				if ((Blocks.AIR.getDefaultState().getBlock() == (world.getBlockState(new BlockPos((int) (BlockX), (int) (BlockY), (int) (BlockZ))))
						.getBlock())) {
					goThrough = (double) ((goThrough) - 1);
				} else if ((SulfuricAcidBlock.block.getDefaultState()
						.getBlock() == (world.getBlockState(new BlockPos((int) (BlockX), (int) (BlockY), (int) (BlockZ)))).getBlock())) {
					if (!world.isRemote && world.getServer() != null) {
						world.getServer().getCommandManager().handleCommand(new CommandSource(ICommandSource.field_213139_a_, new Vec3d(x, y, z),
								Vec2f.ZERO, (ServerWorld) world, 4, "", new StringTextComponent(""), world.getServer(), null).withFeedbackDisabled(),
								"");
					}
					if (!world.isRemote && world.getServer() != null) {
						world.getServer().getCommandManager().handleCommand(
								new CommandSource(ICommandSource.field_213139_a_, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
										new StringTextComponent(""), world.getServer(), null).withFeedbackDisabled(),
								(("execute if block ") + "" + ((int) (BlockX)) + "" + (" ") + "" + ((int) (BlockY)) + "" + (" ") + ""
										+ ((int) (BlockZ)) + "" + (" infiniteindustry:sulfuricacid[level=0] run setblock ") + "" + ((int) (BlockX))
										+ "" + (" ") + "" + ((int) (BlockY)) + "" + (" ") + "" + ((int) (BlockZ)) + ""
										+ (" minecraft:structure_void")));
					}
					if ((Blocks.STRUCTURE_VOID.getDefaultState()
							.getBlock() == (world.getBlockState(new BlockPos((int) (BlockX), (int) (BlockY), (int) (BlockZ)))).getBlock())) {
						if ((!((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).abilities.isCreativeMode : false))) {
							if (entity instanceof PlayerEntity)
								((PlayerEntity) entity).inventory
										.clearMatchingItems(p -> new ItemStack(Items.BUCKET, (int) (1)).getItem() == p.getItem(), (int) 1);
							if (entity instanceof PlayerEntity) {
								ItemStack _setstack = new ItemStack(SulfuricAcidBucketItem.block, (int) (1));
								_setstack.setCount(1);
								ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
							}
						}
						world.setBlockState(new BlockPos((int) (BlockX), (int) (BlockY), (int) (BlockZ)), Blocks.AIR.getDefaultState(), 3);
						goThrough = (double) 0;
					}
					goThrough = (double) ((goThrough) - 1);
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
