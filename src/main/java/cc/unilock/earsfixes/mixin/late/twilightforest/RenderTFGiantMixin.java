package cc.unilock.earsfixes.mixin.late.twilightforest;

import net.minecraft.client.model.ModelBiped;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import twilightforest.client.renderer.entity.RenderTFGiant;

@Mixin(value = RenderTFGiant.class, remap = false)
public class RenderTFGiantMixin {
    @Redirect(method = "<init>", at = @At(value = "NEW", target = "net/minecraft/client/model/ModelBiped"))
    private static ModelBiped redirectModelBiped() {
        return new ModelBiped(0.0F, 0.0F, 64, 64);
    }
}
