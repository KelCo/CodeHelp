package intricateoreprocessing;

import basicCrusher.BasicCrusherGUI;
import basicCrusher.ContainerBasicCrusher;
import basicCrusher.TileEntityBasicCrusher;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {
	 public Object getServerGuiElement(int ID, EntityPlayer player, 
	          World world, int x, int y, int z) 
	    { 
	        TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));

	        if (tileEntity instanceof TileEntityBasicCrusher)
	        {
	            
	                return new ContainerBasicCrusher(player.inventory, 
	                      (IInventory)tileEntity);
	            }
	            
	    
	        return null;
	   }
	 
	    
	    public Object getClientGuiElement(int ID, EntityPlayer player, 
	          World world, int x, int y, int z)
	    {
	        TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));

	        if (tileEntity instanceof TileEntityBasicCrusher)
	        {
	           
	                return new BasicCrusherGUI(player.inventory, 
	                      (IInventory)tileEntity);
	            
	           
	        }
	        return null;
	    }
}
