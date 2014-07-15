package spatialiocompat.core;

public class SIOCThaumcraft
{
    private static String Prefix = "thaumcraft.common.tiles.";

    public static void RegisterCompat()
    {
        /**
        * Thaumcraft
        *
        * Tested by J3FF97 - no issues found.
        * Tuesday, July 15, 2014
        *
        * Includes everything but the Infusion Altar,the warded stuff and some stuff that would not make sense to move.. Aspects are retained, everything still functions.
        *
        */
        SIOCompat.addTileEntity(Prefix + "TileAlchemyFurnace");
        SIOCompat.addTileEntity(Prefix + "TileAlembic");
        SIOCompat.addTileEntity(Prefix + "TileArcaneBore");
        SIOCompat.addTileEntity(Prefix + "TileArcaneFurnace");
        SIOCompat.addTileEntity(Prefix + "TileArcaneLamp");
        SIOCompat.addTileEntity(Prefix + "TileArcaneLampFertility");
        SIOCompat.addTileEntity(Prefix + "TileArcaneLampGrowth");
        SIOCompat.addTileEntity(Prefix + "TileArcaneLampLight");
        SIOCompat.addTileEntity(Prefix + "TileArcaneWorkbench");
        SIOCompat.addTileEntity(Prefix + "TileBellows");
        SIOCompat.addTileEntity(Prefix + "TileBrainbox");
        SIOCompat.addTileEntity(Prefix + "TileCentrifuge");
        SIOCompat.addTileEntity(Prefix + "TileChestHungry");
        SIOCompat.addTileEntity(Prefix + "TileCrucible");
        SIOCompat.addTileEntity(Prefix + "TileCrystal");
        SIOCompat.addTileEntity(Prefix + "TileDeconstrucionTable");
        SIOCompat.addTileEntity(Prefix + "TileJar");
        SIOCompat.addTileEntity(Prefix + "TileLifter");
        SIOCompat.addTileEntity(Prefix + "TileMagicBox");
        SIOCompat.addTileEntity(Prefix + "TileMagicWorkbench");
        SIOCompat.addTileEntity(Prefix + "TileMirror");
        SIOCompat.addTileEntity(Prefix + "TileMirrorEssentia");
        SIOCompat.addTileEntity(Prefix + "TileNitor");
        SIOCompat.addTileEntity(Prefix + "TileNode");
        SIOCompat.addTileEntity(Prefix + "TileNodeStabilizer");
        SIOCompat.addTileEntity(Prefix + "TileSensor");
        SIOCompat.addTileEntity(Prefix + "TileTube");
        SIOCompat.addTileEntity(Prefix + "TileTubeBuffer");
        SIOCompat.addTileEntity(Prefix + "TileWandPedestal");
    }
}
