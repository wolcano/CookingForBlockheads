package net.blay09.mods.cookingforblockheads.block;

import net.blay09.mods.cookingforblockheads.CookingForBlockheads;
import net.blay09.mods.cookingforblockheads.tile.TileChickenSink;
import net.blay09.mods.cookingforblockheads.tile.TileSink;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class BlockChickenSink extends BlockKitchen {

	public BlockChickenSink() {
		super(Material.WOOD);

		setRegistryName(CookingForBlockheads.MOD_ID, "chicken_sink");
		setUnlocalizedName(getRegistryName().toString());
		setSoundType(SoundType.WOOD);
		setHardness(3f);
		setResistance(10f);
	}

	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, @Nullable ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {
		if(side == EnumFacing.UP && heldItem != null && heldItem.getItem() == Items.EGG) {
			TileEntity tileEntity = world.getTileEntity(pos);
			if(tileEntity instanceof TileChickenSink) {
				TileChickenSink tileChickenSink = (TileChickenSink) tileEntity;
				if(tileChickenSink.startHatching() && player.capabilities.isCreativeMode) {
					heldItem.stackSize--;
				}
			}
			return true;
		}
		// TODO Open GUI for Egg Buffer (possibly refuse to open until a chicken is hatched?)
		return true;
	}

	@Override
	public TileEntity createNewTileEntity(World world, int metadata) {
		return new TileSink();
	}

	@Override
	public boolean hasTooltipDescription() {
		return true;
	}
}
