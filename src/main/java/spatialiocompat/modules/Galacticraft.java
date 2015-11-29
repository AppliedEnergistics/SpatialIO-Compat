package spatialiocompat.modules;

import spatialiocompat.core.SIOBaseModule;
import spatialiocompat.core.SIOCompatMarker;


/**
 * Galacticraft
 *
 * 
 * 
 *
 * 
 *
 */
public class Galacticraft extends SIOBaseModule
{
	final private static String GC_PREFIX = "micdoodle8.mods.galacticraft.core.tile.";
	final private static String GCBLOCK_PREFIX = "micdoodle8.mods.galacticraft.core.blocks.";

	public Galacticraft( SIOCompatMarker marker )
	{
		super( "Galacticraft", marker );
	}

	@Override
	public void register()
    {
		this.addTileEntity( GC_PREFIX + "TileEntityAdvanced");
		this.addTileEntity( GC_PREFIX + "TileEntityAirLock");
		this.addTileEntity( GC_PREFIX + "TileEntityAirLockController");
		this.addTileEntity( GC_PREFIX + "TileEntityAluminumWire");
		this.addTileEntity( GC_PREFIX + "TileEntityArclamp");
		this.addTileEntity( GC_PREFIX + "TileEntityBuggyFueler");
		this.addTileEntity( GC_PREFIX + "TileEntityBuggyFuelerSingle");
		this.addTileEntity( GC_PREFIX + "TileEntityCargoLoader");
		this.addTileEntity( GC_PREFIX + "TileEntityCargoUnloader");
		this.addTileEntity( GC_PREFIX + "TileEntityCircuitFabricator");
		this.addTileEntity( GC_PREFIX + "TileEntityCoalGenerator");
		this.addTileEntity( GC_PREFIX + "TileEntityDish");
		this.addTileEntity( GC_PREFIX + "TileEntityDungeonSpawner");
		this.addTileEntity( GC_PREFIX + "TileEntityElectricFurnace");
		this.addTileEntity( GC_PREFIX + "TileEntityElectricIngotCompressor");
		this.addTileEntity( GC_PREFIX + "TileEntityEnergyStorageModule");
		this.addTileEntity( GC_PREFIX + "TileEntityFallenMeteor");
		this.addTileEntity( GC_PREFIX + "TileEntityFuelLoader");
		this.addTileEntity( GC_PREFIX + "TileEntityIngotCompressor");
		this.addTileEntity( GC_PREFIX + "TileEntityLandingPad");
		this.addTileEntity( GC_PREFIX + "TileEntityLandingPadSingle");
		this.addTileEntity( GC_PREFIX + "TileEntityMulti");
		this.addTileEntity( GC_PREFIX + "TileEntityNasaWorkbench");
		this.addTileEntity( GC_PREFIX + "TileEntityOxygen");
		this.addTileEntity( GC_PREFIX + "TileEntityOxygenCollector");
		this.addTileEntity( GC_PREFIX + "TileEntityOxygenCompressor");
		this.addTileEntity( GC_PREFIX + "TileEntityOxygenDetector");
		this.addTileEntity( GC_PREFIX + "TileEntityOxygenPipe");
		this.addTileEntity( GC_PREFIX + "TileEntityOxygenSealer");
		this.addTileEntity( GC_PREFIX + "TileEntityOxygenStorageModule");
		this.addTileEntity( GC_PREFIX + "TileEntityOxygenTransmitter");
		this.addTileEntity( GC_PREFIX + "TileEntityParaChest");
		this.addTileEntity( GC_PREFIX + "TileEntityRefinery");
		this.addTileEntity( GC_PREFIX + "TileEntityScreen");
		this.addTileEntity( GC_PREFIX + "TileEntitySolar");
		this.addTileEntity( GC_PREFIX + "TileEntitySpaceStationBase");
		this.addTileEntity( GC_PREFIX + "TileEntityTelemetry");
		this.addTileEntity( GC_PREFIX + "TileEntityThruster");
		this.addTileEntity( GC_PREFIX + "TileEntityTresureChest");
		this.addTileEntity( GCBLOCK_PREFIX + "BlockAdvanced");
		this.addTileEntity( GCBLOCK_PREFIX + "BlockMulti");
		this.addTileEntity( GCBLOCK_PREFIX + "BlockSlabGC");
		

    }
}
