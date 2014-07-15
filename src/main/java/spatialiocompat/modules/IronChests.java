package spatialiocompat.modules;

import spatialiocompat.core.SIOBaseModule;

/**
 * Iron Chests
 *
 * Tested by AlgorithmX2 - no issues found.
 * Friday, June 20, 2014
 *
 * Includes All Types of Chests
 */
public class IronChests extends SIOBaseModule
{
    public static void register()
    {
    	addTileEntity("cpw.mods.ironchest.TileEntityIronChest");
    }
}
