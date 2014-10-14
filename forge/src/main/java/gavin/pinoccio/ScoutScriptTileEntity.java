package gavin.pinoccio;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class ScoutScriptTileEntity extends TileEntity {

	public int customField;
	
	public ScoutScriptTileEntity(World world, int data) {

		this.customField = data;
	}
	
	@Override
	public void writeToNBT(NBTTagCompound par1)
	{
	   super.writeToNBT(par1);
	   par1.setInteger("customField", this.customField);
	}

	@Override
	public void readFromNBT(NBTTagCompound par1)
	{
	   super.readFromNBT(par1);
	   this.customField = par1.getInteger("customField");
	}
}
