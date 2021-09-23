package io.github.kosmx.minceraft.minceraft.mixin;

import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class MainScreenMixin {
    @Mutable
    @Shadow @Final private boolean isMinceraft;

    @Inject(method = "<init>(Z)V", at = @At("RETURN"))
    private void doMinceraft(CallbackInfo ci){
        isMinceraft = true;
    }
}
