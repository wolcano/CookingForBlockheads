package net.blay09.mods.cookingforblockheads.api;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.AxisAlignedBB;

public interface FridgeAttachment {

	AxisAlignedBB getBoundingBox();
	void rightClick();
	default void readFromNBT(NBTTagCompound tagCompound) {}
	default NBTTagCompound writeToNBT(NBTTagCompound tagCompound) {
		return tagCompound;
	}

}
