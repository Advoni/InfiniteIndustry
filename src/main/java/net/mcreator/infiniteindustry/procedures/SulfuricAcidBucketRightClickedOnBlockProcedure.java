package net.mcreator.infiniteindustry.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;
import net.minecraft.block.Blocks;

import net.mcreator.infiniteindustry.InfiniteIndustryElements;

@InfiniteIndustryElements.ModElement.Tag
public class SulfuricAcidBucketRightClickedOnBlockProcedure extends InfiniteIndustryElements.ModElement {
	public SulfuricAcidBucketRightClickedOnBlockProcedure(InfiniteIndustryElements instance) {
		super(instance, 132);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
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
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double goThrough = 0;
		double BlockX = 0;
		double BlockY = 0;
		double BlockZ = 0;
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
			} else {
				if (!world.isRemote && world.getServer() != null) {
					world.getServer().getCommandManager().handleCommand(
							new CommandSource(ICommandSource.field_213139_a_, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
									new StringTextComponent(""), world.getServer(), null).withFeedbackDisabled(),
							(("say ") + "" + ((BlockX)) + "" + ((BlockY)) + "" + ((BlockZ))));
				}
				goThrough = (double) 0;
			}
		}
	}
}
