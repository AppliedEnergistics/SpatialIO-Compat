package spatialiocompat.modules;

import spatialiocompat.core.SIOBaseModule;

/**
 * JABBA (Just Another Better Barrel Attempt)
 *  a mod by ProfMobius
 *
 * Tested by TehSomeLuigi.
 * No issues found.
 *
 * BSpace barrels function properly -- if one BSpace barrel is
 * stored in a SIO Cell, items can still be retrieved from any
 * BSpace barrels remaining in the world. They do not lose their
 * link. Tested both with both linked barrels in the SIO Cell
 * and one of two barrels in the SIO Cell.
 *  In other words: It works!
 *
 * Friday the 1st of August 2014
 *  JABBA version 1.1.4 for MC 1.7.10
 *
 */
public class Jabba extends SIOBaseModule
{
    public static void register()
    {
        addTileEntity("mcp.mobius.betterbarrels.common.blocks.TileEntityBarrel");
    }
}
