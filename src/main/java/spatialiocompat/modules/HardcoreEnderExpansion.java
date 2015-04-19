package spatialiocompat.modules;

import spatialiocompat.core.SIOBaseModule;
import spatialiocompat.core.SIOCompatMarker;


/**
 * Hardcore Ender Expansion
 *
 *  
 * 
 *
 * 
 *
 */
public class HardcoreEnderExpansion extends SIOBaseModule
{
	final private static String HEE_PREFIX = "chylex.hee.tileentity.";

	public HardcoreEnderExpansion( SIOCompatMarker marker )
	{
		super( "HardcoreEnderExpansion", marker );
	}

	@Override
	public void register()
    {
		this.addTileEntity( HEE_PREFIX + "TileEntityAbstractTable");
		this.addTileEntity( HEE_PREFIX + "TileEntityAbstractSynchronized");
		this.addTileEntity( HEE_PREFIX + "TileEntityAbstractInventory");
		this.addTileEntity( HEE_PREFIX + "TileEntityCustomSpawner");
		this.addTileEntity( HEE_PREFIX + "TileEntityEnhancedBrewingStand");
		this.addTileEntity( HEE_PREFIX + "TileEntityEnhancedTNT");
		this.addTileEntity( HEE_PREFIX + "TileEntityLaserBeam");
		this.addTileEntity( HEE_PREFIX + "TileEntitySanctuaryBrain");
		this.addTileEntity( HEE_PREFIX + "TileEntityVoidChest");

    }
}
