package net.blay09.mods.cookingforblockheads.item;

import net.blay09.mods.cookingforblockheads.CookingForBlockheads;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class ItemInventoryReport extends Item {

	public static final String name = "inventory_report";
	public static final ResourceLocation registryName = new ResourceLocation(CookingForBlockheads.MOD_ID, name);

	public ItemInventoryReport() {
		setCreativeTab(CookingForBlockheads.creativeTab);
		setHasSubtypes(true);
		setMaxStackSize(1);
	}

	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World world, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {

		return super.onItemUse(player, world, pos, hand, facing, hitX, hitY, hitZ);
	}

	@Override
	public void addInformation(ItemStack itemStack, @Nullable World world, List<String> tooltip, ITooltipFlag flag) {
		super.addInformation(itemStack, world, tooltip, flag);

		tooltip.add(TextFormatting.YELLOW + I18n.format("tooltip.cookingforblockheads:fridge_attachment"));
	}

}
