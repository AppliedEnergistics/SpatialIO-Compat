package spatialiocompat.modules;

import spatialiocompat.core.SIOBaseModule;
import spatialiocompat.core.SIOCompatMarker;


/**
 * Mekanism compatibility
 *
 * Tested by nightstalker6669 - no issues found.
 * Friday, June 20, 2014
 *
 *
 */
public class Mekanism extends SIOBaseModule
{
	public Mekanism( SIOCompatMarker marker )
	{
		super( "Mekanism", marker );
	}

	@Override
	public void register()
    {
		this.addTileEntity("mekanism.common.tile.TileEntityBasicBlock");
		this.addTileEntity("mekanism.common.tile.TileEntityMultiblock");
    }
}
