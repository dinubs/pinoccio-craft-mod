package gavin.pinoccio;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class PinoccioHat extends Item {

	public PinoccioHat() {
        this.setMaxStackSize(64);
        this.setCreativeTab(CreativeTabs.tabCombat);
        this.setUnlocalizedName("pinoccioHat");
        this.setTextureName("pinoccio:pinoccioHat");
	} 
	
}