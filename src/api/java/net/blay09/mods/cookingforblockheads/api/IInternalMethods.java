package net.blay09.mods.cookingforblockheads.api;

import net.blay09.mods.cookingforblockheads.api.client.FridgeAttachmentRenderer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public interface IInternalMethods {
    void addSinkHandler(ItemStack itemStack, SinkHandler sinkHandler);
    void addOvenFuel(ItemStack fuelItem, int fuelTime);
    void addOvenRecipe(ItemStack sourceItem, ItemStack resultItem);
    void addToolItem(ItemStack toolItem);
    void addToastHandler(ItemStack itemStack, ToastHandler toastHandler);
    void addToasterHandler(ItemStack itemStack, ToasterHandler toastHandler);
    void addWaterItem(ItemStack waterItem);
    void addMilkItem(ItemStack milkItem);
    void addCowClass(Class<? extends EntityLivingBase> clazz);
	void registerFridgeAttachment(ResourceLocation registryName, Class<? extends FridgeAttachment> clazz);
	void registerFridgeAttachmentRenderer(Class<? extends FridgeAttachment> clazz, Class<? extends FridgeAttachmentRenderer> renderer);
	IKitchenMultiBlock getKitchenMultiBlock(World world, BlockPos pos);
	void addSortButton(ISortButton button);
}
