package it.lia.ninecrowns.mixin;

import it.lia.ninecrowns.*;
import net.minecraft.core.NonNullList;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ResultSlot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.CraftingInput;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;

@Mixin(ResultSlot.class)
public abstract class ResultSlotMixin {
    @Inject(method="getRemainingItems", at=@At("HEAD"), cancellable=true)
    private void ninecrowns$consumeHeads(
        CraftingInput input,
        Level level,
        CallbackInfoReturnable<NonNullList<ItemStack>> cir
    ) {
        if (Recipes.opShape(input)) {
            cir.setReturnValue(NonNullList.withSize(input.size(), ItemStack.EMPTY));
        }
    }

    @Inject(method="onTake", at=@At("HEAD"))
    private void ninecrowns$markLegendaryCrafted(
        Player player,
        ItemStack carried,
        CallbackInfo ci
    ) {
        if (NineCrowns.data == null) return;
        if (carried.is(ModItems.SWORD) || carried.is(ModItems.SPEAR) || carried.is(ModItems.CROWN)) {
            NineCrowns.data.markCrafted(carried.getItem());
        }
    }
}
