package cc.unilock.earsfixes.mixin.late.botania;

import net.minecraft.client.model.ModelBiped;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import vazkii.botania.client.render.entity.RenderDoppleganger;

@Mixin(value = RenderDoppleganger.class, remap = false)
public class RenderDopplegangerMixin {
    @Redirect(method = "<init>", at = @At(value = "NEW", target = "net/minecraft/client/model/ModelBiped"))
    private static ModelBiped redirectModelBiped(float p_i1148_1_) {
        return new ModelBiped(p_i1148_1_, 0.0F, 64, 64);
    }
}
