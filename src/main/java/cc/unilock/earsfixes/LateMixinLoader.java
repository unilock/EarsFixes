package cc.unilock.earsfixes;

import com.gtnewhorizon.gtnhmixins.ILateMixinLoader;
import com.gtnewhorizon.gtnhmixins.LateMixin;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@LateMixin
public class LateMixinLoader implements ILateMixinLoader {
    @Override
    public String getMixinConfig() {
        return "mixins.earsfixes.late.json";
    }

    @Override
    public List<String> getMixins(Set<String> loadedMods) {
        List<String> mixins = new ArrayList<>();
        if (loadedMods.contains("Botania")) {
            mixins.add("botania.ModelSkullOverrideMixin");
            mixins.add("botania.RenderDopplegangerMixin");
        }
        if (loadedMods.contains("TwilightForest")) {
            mixins.add("twilightforest.RenderTFGiantMixin");
        }
        if (loadedMods.contains("WarpTheory")) {
            mixins.add("warptheory.RenderDoppelgangerMixin");
        }
        if (loadedMods.contains("XaeroMinimap")) {
            mixins.add("xaerominimap.MinimapFBORendererMixin");
        }
        return mixins;
    }
}
