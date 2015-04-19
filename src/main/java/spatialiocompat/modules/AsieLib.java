package spatialiocompat.modules;

import spatialiocompat.core.SIOBaseModule;
import spatialiocompat.core.SIOCompatMarker;


/**
 * Asie Lib
 *
 *  for Computronics and other mods that use Asie Lib
 * 
 *
 * 
 *
 */
public class AsieLib extends SIOBaseModule
{
	final private static String ASIE_PREFIX = "pl.asie.lib.tile.";

	public AsieLib( SIOCompatMarker marker )
	{
		super( "AsieLib", marker );
	}

	@Override
	public void register()
    {
		this.addTileEntity( ASIE_PREFIX + "TileMachine");
		

    }
}
