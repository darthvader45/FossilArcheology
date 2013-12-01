/*
 ** 2012 March 18
 **
 ** The author disclaims copyright to this source code.  In place of
 ** a legal notice, here is a blessing:
 **    May you do good and not evil.
 **    May you find forgiveness for yourself and forgive others.
 **    May you share freely, never taking more than you give.
 */
package mods.fossil.fossilAI;

import mods.fossil.entity.mob.EntityDinosaur;
import mods.fossil.handler.FossilPacketHandler;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.player.EntityPlayer;

/**
 * Abstract "AI" for player-controlled movements.
 *
 * @author Nico Bergemann <barracuda415 at yahoo.de>
 */
public abstract class DinoAIRide extends EntityAIBase
{
    protected final EntityDinosaur dinosaur;
    protected EntityPlayer rider;
    private FossilPacketHandler remoteKey = FossilPacketHandler.getInstance();

    public DinoAIRide(EntityDinosaur dinosaur)
    {
        this.dinosaur = dinosaur;
        setMutexBits(0xffffffff);
    }

    /*
    protected boolean isFlyUp() {
        return remoteKey.isKeyPressed(rider.username, "key.dragon.flyUp");
    }

    protected boolean isFlyDown() {
        return remoteKey.isKeyPressed(rider.username, "key.dragon.flyDown");
    }
    */

    protected boolean isRiderJumping()
    {
        return remoteKey.isKeyPressed(rider.username, "key.jump");
    }

    @Override
    public boolean shouldExecute()
    {
        rider = dinosaur.getRidingPlayer();
        return rider != null;
    }
}
