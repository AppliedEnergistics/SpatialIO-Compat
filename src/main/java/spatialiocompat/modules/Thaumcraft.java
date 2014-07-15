package spatialiocompat.modules;

import spatialiocompat.core.SIOBaseModule;

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
	final private static String Prefix = "thaumcraft.common.tiles.";

    public static void register()
    {
    	addTileEntity(Prefix + "TileAlchemyFurnace");
        addTileEntity(Prefix + "TileAlembic");
        addTileEntity(Prefix + "TileArcaneBore");
        addTileEntity(Prefix + "TileArcaneFurnace");
        addTileEntity(Prefix + "TileArcaneLamp");
        addTileEntity(Prefix + "TileArcaneLampFertility");
        addTileEntity(Prefix + "TileArcaneLampGrowth");
        addTileEntity(Prefix + "TileArcaneLampLight");
        addTileEntity(Prefix + "TileArcaneWorkbench");
        addTileEntity(Prefix + "TileBellows");
        addTileEntity(Prefix + "TileBrainbox");
        addTileEntity(Prefix + "TileCentrifuge");
        addTileEntity(Prefix + "TileChestHungry");
        addTileEntity(Prefix + "TileCrucible");
        addTileEntity(Prefix + "TileCrystal");
        addTileEntity(Prefix + "TileDeconstrucionTable");
        addTileEntity(Prefix + "TileJar");
        addTileEntity(Prefix + "TileLifter");
        addTileEntity(Prefix + "TileMagicBox");
        addTileEntity(Prefix + "TileMagicWorkbench");
        addTileEntity(Prefix + "TileMirror");
        addTileEntity(Prefix + "TileMirrorEssentia");
        addTileEntity(Prefix + "TileNitor");
        addTileEntity(Prefix + "TileNode");
        addTileEntity(Prefix + "TileNodeStabilizer");
        addTileEntity(Prefix + "TileSensor");
        addTileEntity(Prefix + "TileTube");
        addTileEntity(Prefix + "TileTubeBuffer");
        addTileEntity(Prefix + "TileWandPedestal");
    }
}
