package spatialiocompat.modules;

import spatialiocompat.core.SIOBaseModule;
import spatialiocompat.core.SIOCompatMarker;


/**
 * EnderIO compatibility
 *
 * Tested by nightstalker6669 - no issues found.
 * 
 *
 *
 */
public class EnderIO extends SIOBaseModule
{
	public EnderIO( SIOCompatMarker marker )
	{
		super( "EnderIO", marker );
	}

	@Override
	public void register()
    {
		this.addTileEntity("crazypants.enderio.TileEntityEio");
    }
}
