package com.tully.tikTokRect.registry.hudItems;

import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.util.math.MatrixStack;
import com.tully.tikTokRect.TikTokRectMod;
import net.minecraft.client.MinecraftClient;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.DrawableHelper;
import net.minecraft.client.render.GameRenderer;

public class BlackBox implements HudRenderCallback{
    @Override
    public void onHudRender(MatrixStack matrixStack, float tickDelta) {
        if(TikTokRectMod.tikTokBoxShow == true)
        {
            int width = 0;
            int height = 0;
            MinecraftClient client = MinecraftClient.getInstance();
            if(client != null)
            {
                width = client.getWindow().getScaledWidth();
                height = client.getWindow().getScaledHeight();
            }
            int boxWidth = (int) ((height/1.778));
            int x1 = (width/2) - (boxWidth/2);
            int x2 = (width/2) + (boxWidth/2);
            int x1_1 = 0;
            int y1_1 = 0;
            int x2_1 = x1;
            int y2_1 = height; 
            int x1_2 = x2;
            int y1_2 = 0;
            int x2_2 = width;
            int y2_2 = height; 
            RenderSystem.setShader(GameRenderer::getPositionTexShader);
            RenderSystem.setShaderColor(1f, 1f, 1f, 0.5f);
            DrawableHelper.fill(matrixStack, x1_1, y1_1, x2_1, y2_1, 0xff000000); //black box on left
            DrawableHelper.fill(matrixStack, x1_2, y1_2, x2_2, y2_2, 0xff000000); //black box on right
        }
    }
}