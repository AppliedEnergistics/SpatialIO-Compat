package spatialiocompat.modules;

import spatialiocompat.core.SIOBaseModule;
import spatialiocompat.core.SIOCompatMarker;


/**
 * Railcraft
 *
 * 
 * 
 *
 * 
 *
 */
public class Railcraft extends SIOBaseModule
{
	final private static String RC_PREFIX = "mods.railcraft.common.blocks.";

	public Railcraft( SIOCompatMarker marker )
	{
		super( "Railcraft", marker );
	}

	@Override
	public void register()
    {
		this.addTileEntity( RC_PREFIX + "RailcraftTileEntity");
		

    }
}
