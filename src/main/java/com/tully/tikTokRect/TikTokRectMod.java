package com.tully.tikTokRect;
import com.tully.tikTokRect.registry.hudItems.HudItemsManager;
// import com.tully.tikTokRect.registry.hudItems.TestHudItem;
import net.fabricmc.api.ModInitializer;

public class TikTokRectMod implements ModInitializer{
    public static String MOD_ID = "tiktokmod";

    public static boolean tikTokBoxShow = false;

    @Override
    public void onInitialize() {
        HudItemsManager.registerHudItems();
        System.out.println("TikTokRect Mod Initialized");
    }
}