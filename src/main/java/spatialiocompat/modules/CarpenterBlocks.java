package spatialiocompat.modules;

import spatialiocompat.core.SIOBaseModule;
import spatialiocompat.core.SIOCompatMarker;

/**
 * Carpenters Blocks
 *
 * Tested by AlgorithmX2 - no issues found.
 * Friday, June 20, 2014
 *
 * Updated by mskurnik - renamed based entity
 * Saturday, November 28, 2015
 *
 * Includes all Customizable Blocks
 */
public class CarpenterBlocks extends SIOBaseModule
{
	public CarpenterBlocks( SIOCompatMarker marker )
	{
		super( "CarpentersBlocks", marker );
	}

	@Override
	public void register()
	{
		this.addTileEntity("com.carpentersblocks.tileentity.TEBase");
    	}
}
