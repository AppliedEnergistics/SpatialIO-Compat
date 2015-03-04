package spatialiocompat.modules;

import spatialiocompat.core.SIOBaseModule;
import spatialiocompat.core.SIOCompatMarker;


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
	public IronChests( SIOCompatMarker marker )
	{
		super( "IronChest", marker );
	}

	@Override
	public void register()
    {
		this.addTileEntity("cpw.mods.ironchest.TileEntityIronChest");
    }
}
