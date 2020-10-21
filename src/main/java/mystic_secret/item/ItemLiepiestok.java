
package mystic_secret.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;

import mystic_secret.creativetab.TabMysticSecret2;

import mystic_secret.ElementsMysticSecretMod;

import java.util.List;

@ElementsMysticSecretMod.ModElement.Tag
public class ItemLiepiestok extends ElementsMysticSecretMod.ModElement {
	@GameRegistry.ObjectHolder("mystic_secret:liepiestok")
	public static final Item block = null;
	public ItemLiepiestok(ElementsMysticSecretMod instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("mystic_secret:liepiestok", "inventory"));
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 64;
			setUnlocalizedName("liepiestok");
			setRegistryName("liepiestok");
			setCreativeTab(TabMysticSecret2.tab);
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getMaxItemUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
			return 1F;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<String> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(
					"\u041B\u0435\u043F\u0435\u0441\u0442\u043E\u043A \u0437\u0430\u043B\u043E\u0433 \u0437\u0434\u043E\u0440\u043E\u0432\u044C\u0435");
		}
	}
}
