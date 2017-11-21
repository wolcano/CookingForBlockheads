package net.blay09.mods.cookingforblockheads.registry;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import jline.internal.Nullable;
import net.blay09.mods.cookingforblockheads.api.FridgeAttachment;
import net.minecraft.util.ResourceLocation;

public class FridgeAttachmentRegistry {

	private static final BiMap<ResourceLocation, Class<? extends FridgeAttachment>> nameToClass = HashBiMap.create();
	private static final BiMap<Class<? extends FridgeAttachment>, ResourceLocation> classToName = nameToClass.inverse();

	public static void registerFridgeAttachment(ResourceLocation registryName, Class<? extends FridgeAttachment> clazz) {
		nameToClass.put(registryName, clazz);
	}

	@Nullable
	public static FridgeAttachment createFridgeAttachment(ResourceLocation registryName) {
		Class<? extends FridgeAttachment> clazz = nameToClass.get(registryName);
		if(clazz == null) {
			return null;
		}

		try {
			return clazz.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static ResourceLocation getRegistryNameFromClass(Class<? extends FridgeAttachment> clazz) {
		return classToName.get(clazz);
	}

}
