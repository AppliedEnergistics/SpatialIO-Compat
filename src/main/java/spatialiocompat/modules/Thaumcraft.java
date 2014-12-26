package spatialiocompat.modules;

import spatialiocompat.core.SIOBaseModule;
import spatialiocompat.core.SIOCompatMarker;


/**
 * Thaumcraft
 *
 * Tested by J3FF97 - no issues found.
 * Tuesday, July 15, 2014
 *
 * Includes everything but the Infusion Altar,the warded stuff and some stuff that would not make sense to move.. Aspects are retained, everything still functions.
 *
 */
public class Thaumcraft extends SIOBaseModule
{
	final private static String TC_PREFIX = "thaumcraft.common.tiles.";

	public Thaumcraft( SIOCompatMarker marker )
	{
		super( "Thaumcraft", marker );
	}

	@Override
	public void register()
    {
		this.addTileEntity( TC_PREFIX + "TileAlchemyFurnace");
		this.addTileEntity( TC_PREFIX + "TileAlembic");
		this.addTileEntity( TC_PREFIX + "TileArcaneBore");
		this.addTileEntity( TC_PREFIX + "TileArcaneFurnace");
		this.addTileEntity( TC_PREFIX + "TileArcaneLamp");
		this.addTileEntity( TC_PREFIX + "TileArcaneLampFertility");
		this.addTileEntity( TC_PREFIX + "TileArcaneLampGrowth");
		this.addTileEntity( TC_PREFIX + "TileArcaneLampLight");
		this.addTileEntity( TC_PREFIX + "TileArcaneWorkbench");
		this.addTileEntity( TC_PREFIX + "TileBellows");
		this.addTileEntity( TC_PREFIX + "TileBrainbox");
		this.addTileEntity( TC_PREFIX + "TileCentrifuge");
		this.addTileEntity( TC_PREFIX + "TileChestHungry");
		this.addTileEntity( TC_PREFIX + "TileCrucible");
		this.addTileEntity( TC_PREFIX + "TileCrystal");
		this.addTileEntity( TC_PREFIX + "TileDeconstrucionTable");
		this.addTileEntity( TC_PREFIX + "TileJar");
		this.addTileEntity( TC_PREFIX + "TileLifter");
		this.addTileEntity( TC_PREFIX + "TileMagicBox");
		this.addTileEntity( TC_PREFIX + "TileMagicWorkbench");
		this.addTileEntity( TC_PREFIX + "TileMirror");
		this.addTileEntity( TC_PREFIX + "TileMirrorEssentia");
		this.addTileEntity( TC_PREFIX + "TileNitor");
		this.addTileEntity( TC_PREFIX + "TileNode");
		this.addTileEntity( TC_PREFIX + "TileNodeStabilizer");
		this.addTileEntity( TC_PREFIX + "TileSensor");
		this.addTileEntity( TC_PREFIX + "TileTube");
		this.addTileEntity( TC_PREFIX + "TileTubeBuffer");
		this.addTileEntity( TC_PREFIX + "TileWandPedestal");

		/**
		 * Added since the new 4.2.2.1 version and before
		 *
		 * Tested by TCzelusniak
		 *
		 * Friday, December 26, 2014
		 */
		this.addTileEntity( TC_PREFIX + "TileEldritchAltar");
		this.addTileEntity( TC_PREFIX + "TileEldritchCap");
		this.addTileEntity( TC_PREFIX + "TileEldritchObelisk");
		this.addTileEntity( TC_PREFIX + "TileEldritchPortal");
		this.addTileEntity( TC_PREFIX + "TileBanner");
		this.addTileEntity( TC_PREFIX + "TileGrate");
		this.addTileEntity( TC_PREFIX + "TileSpa");
    }
}
