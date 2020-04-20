package net.mcreator.infiniteindustry.procedures;

@InfiniteIndustryElements.ModElement.Tag
public class HotMagmaSpongeBlockDestroyedByPlayerProcedure extends InfiniteIndustryElements.ModElement {

	public HotMagmaSpongeBlockDestroyedByPlayerProcedure(InfiniteIndustryElements instance) {
		super(instance, 66);

	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure HotMagmaSpongeBlockDestroyedByPlayer!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		entity.setFire((int) 5);
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 200, (int) 4));

	}

}
