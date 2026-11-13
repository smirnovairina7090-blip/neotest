package com.example.examplemod.item;
import net.minecraft.world.item.Item;

public class MagicWandItem extends Item {
  public MagicWandItem(Item.Properties properties) {
      super(properties);
  }
  @Override
  public InteractionResultHolder<ItemStack> use(
        Level level,
        Player player,
        InteractionHand hand
) {
    ItemStack stack = player.getItemInHand(hand);
    if (!level.isClientSide) {
        player.sendSystemMessage(
          Component.literal("Magic works!")
    );
    }
return InteractionResultHolder.success(stack);
}
}
