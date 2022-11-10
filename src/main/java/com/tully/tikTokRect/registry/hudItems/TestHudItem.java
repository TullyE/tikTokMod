// package com.tully.tikTokRect.registry.hudItems;
// import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
// import net.minecraft.client.util.math.MatrixStack;
// import com.tully.tikTokRect.registry.hudItems.TestHudItem;

// import net.minecraft.client.MinecraftClient;
// import com.mojang.blaze3d.systems.RenderSystem;

// import net.minecraft.client.font.TextRenderer;
// import net.minecraft.client.render.BufferBuilder;
// import net.minecraft.client.render.GameRenderer;
// import net.minecraft.client.render.Tessellator;
// import net.minecraft.client.render.VertexFormats;
// import net.minecraft.client.render.VertexFormat;
// import net.minecraft.client.util.Window;
// import net.minecraft.util.math.Matrix3f;
// import net.minecraft.util.math.Matrix4f;

// public class TestHudItem implements HudRenderCallback{
//     @Override
//     public void onHudRender(MatrixStack matrixStack, float tickDelta) {
//         // TODO Auto-generated method stub
//         TextRenderer textRenderer = MinecraftClient.getInstance().textRenderer;
//         textRenderer.draw(matrixStack, "This is a test!", 0f, 0f, 0xFF0000);
//         // Text renders perfectly as expected.
//         Window window = MinecraftClient.getInstance().getWindow();
//         int screenWidth = window.getScaledWidth();
//         int screenHeight = window.getScaledHeight();
//         int screenCenterX = screenWidth/2;
//         int screenCenterY = screenHeight/2;

//         GameRenderer gameRenderer = MinecraftClient.getInstance().gameRenderer;
//         RenderSystem.enableBlend();

//         Matrix4f matrix4f = matrixStack.peek().getPositionMatrix();
//         Matrix3f matrix3f = matrixStack.peek().getNormalMatrix();
//         RenderSystem.setShader(GameRenderer::getRenderTypeLinesShader);
//         Tessellator tessellator = RenderSystem.renderThreadTesselator();
//         BufferBuilder bufferBuilder = tessellator.getBuffer();
//         RenderSystem.lineWidth(4.0F);

//         bufferBuilder.begin(VertexFormat.DrawMode.LINES, VertexFormats.LINES);
//         bufferBuilder.vertex(matrix4f, 0.0f, 0.0f, -90.0f).color(0, 255, 0, 255).normal(matrix3f, 1.0f, 1.0f, 0.0f).next();
//         bufferBuilder.vertex(matrix4f, (float)screenCenterX, (float)screenCenterY, -90.0f).color(0, 255, 0, 255).normal(matrix3f, 1.0f, 1.0f, 0.0f).next();

//         tessellator.draw();
//         RenderSystem.lineWidth(1.0F);
//     }
// }
