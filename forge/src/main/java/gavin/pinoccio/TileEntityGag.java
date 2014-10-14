package gavin.pinoccio;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityGag extends TileEntity{
        //The coordinates of our primary block will be stored in these variables.
        public int primary_x;
        public int primary_y;
        public int primary_z;
        
    public void writeToNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.writeToNBT(par1NBTTagCompound);
        par1NBTTagCompound.setInteger("px", primary_x);
        par1NBTTagCompound.setInteger("py", primary_y);
        par1NBTTagCompound.setInteger("pz", primary_z);
    }
    public void readFromNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.readFromNBT(par1NBTTagCompound);
        this.primary_x = par1NBTTagCompound.getInteger("px");
        this.primary_y = par1NBTTagCompound.getInteger("py");
        this.primary_z = par1NBTTagCompound.getInteger("pz");
    }
}