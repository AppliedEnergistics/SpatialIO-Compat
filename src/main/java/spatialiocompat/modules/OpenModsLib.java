package spatialiocompat.modules;


import spatialiocompat.core.SIOBaseModule;
import spatialiocompat.core.SIOCompatMarker;


/**
 * TODO: Created by FireBall1725 on 12/16/2014.
 * updated by nightstalker6669 on 4/18/2015
 */
public class OpenModsLib extends SIOBaseModule
{
	public OpenModsLib( SIOCompatMarker marker )
	{
		super( "OpenMods", marker );
	}

	@Override
	public void register()
	{
		// Disabled for now since not tested
		this.addTileEntity( "openmods.tileentity.OpenTileEntity" );
		this.addTileEntity( "openmods.tileentity.SimpleNetTileEntity" );
		this.addTileEntity( "openmods.tileentity.SyncedTileEntity" );
	}
}
