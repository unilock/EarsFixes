package cc.unilock.earsfixes.mixin.late.botania;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import vazkii.botania.client.model.ModelSkullOverride;

@Mixin(value = ModelSkullOverride.class, remap = false)
public class ModelSkullOverrideMixin {
    @ModifyConstant(method = "<init>", constant = @Constant(intValue = 32, ordinal = 0))
    private int modifyTextureHeight(int constant) {
        return 64;
    }
}
