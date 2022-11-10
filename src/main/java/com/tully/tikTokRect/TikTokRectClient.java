package com.tully.tikTokRect;

import org.lwjgl.glfw.GLFW;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.text.Text;



public class TikTokRectClient implements ClientModInitializer {
    public static String MOD_ID = "tiktokmod";

    @Override
    public void onInitializeClient() 
    {
        System.out.println("ClientInitialized");
        KeyBinding keyBinding = KeyBindingHelper.registerKeyBinding(new KeyBinding(
        "Show TikTok Box", // The translation key of the keybinding's name
        InputUtil.Type.KEYSYM, // The type of the keybinding, KEYSYM for keyboard, MOUSE for mouse.
        GLFW.GLFW_KEY_R, // The keycode of the key
        "TikTok Mod" // The translation key of the keybinding's category.
        )); 
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (keyBinding.wasPressed()) {
                TikTokRectMod.tikTokBoxShow = !TikTokRectMod.tikTokBoxShow;
                String messageToPlayer = TikTokRectMod.tikTokBoxShow == true ? "TikTokBox Is Now Visible!" : "TikTokBox Is Now Hidden!";
                client.player.sendMessage(Text.literal(messageToPlayer), false);
            }
        });
    }
}
