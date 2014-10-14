package gavin.pinoccio;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ScoutScriptItemBlock extends ItemBlock {
	
	private final static String[] subNames = {
		"white", "orange",  "magenta", "lightBlue", "yellow", "lightGreen",
		"pink", "darkGrey", "lightGrey", "cyan", "purple", "blue", "brown",
		"green", "red", "black"
	};

	public ScoutScriptItemBlock(Block id) {
		super(id);
		setHasSubtypes(true);
		this.setUnlocalizedName("scoutScriptBlock");
	}
	
	@Override
	public int getMetadata (int damageValue) {
		return damageValue;
	}
	
	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		return getUnlocalizedName() + "." + subNames[itemstack.getItemDamage()];
	}

}