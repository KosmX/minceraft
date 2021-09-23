package io.github.kosmx.minceraft.minceraft.mixin;

import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(MinecraftClient.class)
public class MainMixin {

    @ModifyVariable(method = "getWindowTitle", at = @At(value = "STORE"))
    private StringBuilder rename(StringBuilder stringBuilder){
        return new StringBuilder("Minceraft");
    }
}
