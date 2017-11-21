package net.blay09.mods.cookingforblockheads.api.client;

import net.blay09.mods.cookingforblockheads.tile.TileFridge;

public interface FridgeAttachmentRenderer {
	void render(TileFridge tileFridge, double x, double y, double z, float partialTicks, int destroyStage, float alpha);
}
