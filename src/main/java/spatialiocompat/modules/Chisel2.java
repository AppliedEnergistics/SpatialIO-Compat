package spatialiocompat.modules;

import spatialiocompat.core.SIOBaseModule;
import spatialiocompat.core.SIOCompatMarker;


/**
 * Chisel 2
 *
 *  
 * 
 *
 * 
 *
 */
public class Chisel2 extends SIOBaseModule
{
	final private static String CHISEL_PREFIX = "com.cricketcraft.chisel.block.tileentity.";

	public Chisel2( SIOCompatMarker marker )
	{
		super( "Chisel2", marker );
	}

	@Override
	public void register()
    {
		this.addTileEntity( CHISEL_PREFIX + "TileEntityAutoChisel");
		this.addTileEntity( CHISEL_PREFIX + "TileEntityPresent");
		

    }
}
