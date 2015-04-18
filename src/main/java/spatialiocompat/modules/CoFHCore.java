package spatialiocompat.modules;

import spatialiocompat.core.SIOBaseModule;
import spatialiocompat.core.SIOCompatMarker;


/**
 * COFH Core
 *
 *  for thermal expansion, minefactory reloaded, thermal foundation, redstone aresenal
 * 
 *
 * 
 *
 */
public class CoFHCore extends SIOBaseModule
{
	final private static String COFH_PREFIX = "cofh.core.block.";

	public CoFHCore( SIOCompatMarker marker )
	{
		super( "CoFHCore", marker );
	}

	@Override
	public void register()
    {
		this.addTileEntity( COFH_PREFIX + "TileCoFHBase");
		

    }
}
