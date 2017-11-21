package net.blay09.mods.cookingforblockheads.client.fridge;

import net.blay09.mods.cookingforblockheads.api.client.FridgeAttachmentRenderer;
import net.blay09.mods.cookingforblockheads.tile.TileFridge;

public class InventoryReportRenderer implements FridgeAttachmentRenderer {

	@Override
	public void render(TileFridge tileFridge, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
		System.out.println("i'm rendering");
	}

}
