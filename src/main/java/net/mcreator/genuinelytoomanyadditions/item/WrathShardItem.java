
package net.mcreator.genuinelytoomanyadditions.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import net.mcreator.genuinelytoomanyadditions.itemgroup.GTMMaterialsItemGroup;
import net.mcreator.genuinelytoomanyadditions.SoeModElements;

import java.util.List;

@SoeModElements.ModElement.Tag
public class WrathShardItem extends SoeModElements.ModElement {
	@ObjectHolder("soe:wrath_shard")
	public static final Item block = null;
	public WrathShardItem(SoeModElements instance) {
		super(instance, 799);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(GTMMaterialsItemGroup.tab).maxStackSize(64).isImmuneToFire().rarity(Rarity.COMMON));
			setRegistryName("wrath_shard");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("\u00A7cTier 3 Boss Item"));
		}
	}
}
