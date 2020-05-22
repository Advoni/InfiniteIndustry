package net.mcreator.infiniteindustry.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.infiniteindustry.InfiniteIndustryElements;

@InfiniteIndustryElements.ModElement.Tag
public class AcidInAJarOnPotionActiveTickProcedure extends InfiniteIndustryElements.ModElement {
	public AcidInAJarOnPotionActiveTickProcedure(InfiniteIndustryElements instance) {
		super(instance, 134);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure AcidInAJarOnPotionActiveTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double RandomDirection = 0;
		if ((!((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).abilities.isCreativeMode : false))) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
			RandomDirection = (double) (360 * Math.random());
			entity.setMotion((0.75 * Math.cos((RandomDirection))), 0.75, (0.75 * Math.sin((RandomDirection))));
		}
	}
}
