package mods.fossil.entity.mob;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityPrehistoric extends EntityTameable {
	
	
	//TODO: Move all the datawatchers here for easy access
    // data value IDs
	
    protected static final int INDEX_FLYING = 18;
    protected static final int INDEX_CAN_FLY = 19;
    
    

	public EntityPrehistoric(World par1World) {
		super(par1World);
		// TODO Auto-generated constructor stub
	}

	@Override
	public EntityAgeable createChild(EntityAgeable entityageable) {
		// TODO Auto-generated method stub
		return null;
	}

    public EntityPlayer getRidingPlayer()
    {
        if (riddenByEntity instanceof EntityPlayer)
        {
            return (EntityPlayer) riddenByEntity;
        }
        else
        {
            return null;
        }
    }

    /**
     * Returns true if the entity is flying.
     */
    public boolean isFlying() {
        return (dataWatcher.getWatchableObjectByte(INDEX_FLYING) & 1) != 0;
    }
    
}
