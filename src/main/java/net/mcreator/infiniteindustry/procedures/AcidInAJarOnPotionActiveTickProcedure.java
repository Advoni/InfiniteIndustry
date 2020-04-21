package net.mcreator.infiniteindustry.procedures;

import net.minecraft.util.DamageSource;
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
		entity.attackEntityFrom(DamageSource.IN_FIRE, (float) 1);
		entity.setMotion(0, (0.2 + (0.3 * Math.pow(Math.abs((entity.getMotion().getY())), 1.4))), 0);
	}
}
