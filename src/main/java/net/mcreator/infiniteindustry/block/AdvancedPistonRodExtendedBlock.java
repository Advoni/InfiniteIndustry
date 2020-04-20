
package net.mcreator.infiniteindustry.block;

@InfiniteIndustryElements.ModElement.Tag
public class AdvancedPistonRodExtendedBlock extends InfiniteIndustryElements.ModElement {

	@ObjectHolder("infiniteindustry:advancedpistonrodextended")
	public static final Block block = null;

	public AdvancedPistonRodExtendedBlock(InfiniteIndustryElements instance) {
		super(instance, 117);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(InfiniteIndustryItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public static final DirectionProperty FACING = DirectionalBlock.FACING;

		public CustomBlock() {
			super(

					Block.Properties.create(Material.PISTON).sound(SoundType.WOOD).hardnessAndResistance(1f, 10f).lightValue(0));

			this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));

			setRegistryName("advancedpistonrodextended");
		}

		@OnlyIn(Dist.CLIENT)
		@Override
		public BlockRenderLayer getRenderLayer() {
			return BlockRenderLayer.TRANSLUCENT;
		}

		@Override
		public boolean isNormalCube(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return false;
		}

		@Override
		public boolean propagatesSkylightDown(BlockState state, IBlockReader reader, BlockPos pos) {
			return true;
		}

		@Override
		public VoxelShape getShape(BlockState state, IBlockReader world, BlockPos pos, ISelectionContext context) {
			switch ((Direction) state.get(FACING)) {
				case SOUTH :
				default :
					return VoxelShapes.create(0.75D, 0.25D, 1.75D, 0.25D, 0.75D, -0.25D);
				case NORTH :
					return VoxelShapes.create(0.25D, 0.25D, -0.75D, 0.75D, 0.75D, 1.25D);
				case WEST :
					return VoxelShapes.create(-0.75D, 0.25D, 0.75D, 1.25D, 0.75D, 0.25D);
				case EAST :
					return VoxelShapes.create(1.75D, 0.25D, 0.25D, -0.25D, 0.75D, 0.75D);
				case UP :
					return VoxelShapes.create(0.25D, 1.75D, 0.25D, 0.75D, -0.25D, 0.75D);
				case DOWN :
					return VoxelShapes.create(0.25D, -0.75D, 0.75D, 0.75D, 1.25D, 0.25D);
			}
		}

		@Override
		protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
			builder.add(FACING);
		}

		public BlockState rotate(BlockState state, Rotation rot) {
			return state.with(FACING, rot.rotate(state.get(FACING)));
		}

		public BlockState mirror(BlockState state, Mirror mirrorIn) {
			return state.rotate(mirrorIn.toRotation(state.get(FACING)));
		}

		@Override
		public BlockState getStateForPlacement(BlockItemUseContext context) {
			return this.getDefaultState().with(FACING, context.getNearestLookingDirection().getOpposite());
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}

	}

}
