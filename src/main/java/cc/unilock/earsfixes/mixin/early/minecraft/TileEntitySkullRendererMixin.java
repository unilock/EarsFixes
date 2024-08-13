package cc.unilock.earsfixes.mixin.early.minecraft;

import com.llamalad7.mixinextras.sugar.Local;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import net.minecraft.client.model.ModelSkeletonHead;
import net.minecraft.client.renderer.tileentity.TileEntitySkullRenderer;
import net.minecraft.util.ResourceLocation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(TileEntitySkullRenderer.class)
public class TileEntitySkullRendererMixin {
    @Shadow
    private ModelSkeletonHead field_147538_h;

    @ModifyVariable(method = "func_152674_a", at = @At(value = "STORE", ordinal = 0))
    private ResourceLocation modifyResourceLocation(ResourceLocation value, @Local LocalRef<ModelSkeletonHead> modelskeletonhead) {
        modelskeletonhead.set(this.field_147538_h);
        return value;
    }
}
