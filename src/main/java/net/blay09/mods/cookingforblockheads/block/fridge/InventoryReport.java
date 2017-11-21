package net.blay09.mods.cookingforblockheads.block.fridge;

import net.blay09.mods.cookingforblockheads.api.FridgeAttachment;
import net.minecraft.util.math.AxisAlignedBB;

public class InventoryReport implements FridgeAttachment {

	private static final AxisAlignedBB BOUNDING_BOX = new AxisAlignedBB(0, 0, 0, 1, 1, 1);

	@Override
	public AxisAlignedBB getBoundingBox() {
		return BOUNDING_BOX;
	}

	@Override
	public void rightClick() {

	}

}
