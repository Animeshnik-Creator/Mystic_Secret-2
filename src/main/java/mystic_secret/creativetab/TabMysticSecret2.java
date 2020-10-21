
package mystic_secret.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import mystic_secret.item.ItemIcon;

import mystic_secret.ElementsMysticSecretMod;

@ElementsMysticSecretMod.ModElement.Tag
public class TabMysticSecret2 extends ElementsMysticSecretMod.ModElement {
	public TabMysticSecret2(ElementsMysticSecretMod instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabmystic_secret_2") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemIcon.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
