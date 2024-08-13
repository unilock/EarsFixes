package cc.unilock.earsfixes.mixin.late.xaerominimap;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import xaero.common.minimap.render.MinimapFBORenderer;

@Mixin(value = MinimapFBORenderer.class, remap = false)
public class MinimapFBORendererMixin {
    @ModifyConstant(method = "renderPlayerHeadToFBO", constant = @Constant(floatValue = 32.0F))
    private float modifyTileHeight(float constant) {
        return 64.0F;
    }
}
