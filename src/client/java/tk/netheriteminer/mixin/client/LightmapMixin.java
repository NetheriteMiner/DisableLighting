package tk.netheriteminer.mixin.client;

import net.minecraft.client.render.LightmapTextureManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LightmapTextureManager.class)
public class LightmapMixin {
	@Inject(at = @At("HEAD"), method = "update", cancellable = true)
	private void disableLightUpdate(float delta, CallbackInfo info) {
        info.cancel();
	}
}