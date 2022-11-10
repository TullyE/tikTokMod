package com.tully.tikTokRect.registry.hudItems;

import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;

public class HudItemsManager {
    public static void registerHudItems() {
        System.out.println("Registering Hud Items for tikTokRect");
        HudRenderCallback.EVENT.register(new BlackBox());
        // HudRenderCallback.EVENT.register(new TestHudItem());
        System.out.println("Done registering Hud Items for tikTokRect");
    }
}
