
package net.mcreator.infiniteindustry.potion;

@InfiniteIndustryElements.ModElement.Tag
public class TestPotion extends InfiniteIndustryElements.ModElement {

	@ObjectHolder("infiniteindustry:test")
	public static final Effect potion = null;

	@ObjectHolder("infiniteindustry:test")
	public static final Potion potionType = null;

	public TestPotion(InfiniteIndustryElements instance) {
		super(instance, 69);

		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@SubscribeEvent
	public void registerEffect(RegistryEvent.Register<Effect> event) {
		event.getRegistry().register(new EffectCustom());
	}

	@SubscribeEvent
	public void registerPotion(RegistryEvent.Register<Potion> event) {
		event.getRegistry().register(new PotionCustom());
	}

	public static class PotionCustom extends Potion {

		public PotionCustom() {
			super(new EffectInstance(potion, 3600));
			setRegistryName("test");
		}

	}

	public static class EffectCustom extends Effect {

		private final ResourceLocation potionIcon;

		public EffectCustom() {
			super(EffectType.NEUTRAL, -1);
			setRegistryName("test");
			potionIcon = new ResourceLocation("infiniteindustry:textures/water_overlay.png");
		}

		@Override
		public String getName() {
			return "effect.test";
		}

		@Override
		public boolean isBeneficial() {
			return false;
		}

		@Override
		public boolean isInstant() {
			return false;
		}

		@Override
		public List<ItemStack> getCurativeItems() {
			List<ItemStack> ret = new ArrayList<>();
			ret.add(new ItemStack(Items.MILK_BUCKET, (int) (1)));
			return ret;
		}

		@Override
		public boolean shouldRenderInvText(EffectInstance effect) {
			return true;
		}

		@Override
		public boolean shouldRenderHUD(EffectInstance effect) {
			return true;
		}

		@Override
		public boolean isReady(int duration, int amplifier) {
			return true;
		}

	}

}
