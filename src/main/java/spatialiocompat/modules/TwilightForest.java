package spatialiocompat.modules;

import spatialiocompat.core.SIOBaseModule;
import spatialiocompat.core.SIOCompatMarker;


/**
 * Twilight Forest
 *
 *  
 * 
 *
 * 
 *
 */
public class TwilightForest extends SIOBaseModule
{
	final private static String TF_PREFIX = "twilightforest.tileentity.";

	public TwilightForest( SIOCompatMarker marker )
	{
		super( "TwilightForest", marker );
	}

	@Override
	public void register()
    {
		this.addTileEntity( TF_PREFIX + "TileEntityTFBossSpawner");
		this.addTileEntity( TF_PREFIX + "TileEntityTFCicada");
		this.addTileEntity( TF_PREFIX + "TileEntityTFReactorActive");
		this.addTileEntity( TF_PREFIX + "TileEntityTFCritter");
		this.addTileEntity( TF_PREFIX + "TileEntityTFFireFly");
		this.addTileEntity( TF_PREFIX + "TileEntityTFFlameJet");
		this.addTileEntity( TF_PREFIX + "TileEntityTFGhastTrapActive");
		this.addTileEntity( TF_PREFIX + "TileEntityTFGhastTrapInactive");
		this.addTileEntity( TF_PREFIX + "TileEntityTFHydraSpawner");
		this.addTileEntity( TF_PREFIX + "TileEntityTFKnightPhantomsSpawner");
		this.addTileEntity( TF_PREFIX + "TileEntityTFLichSpawner");
		this.addTileEntity( TF_PREFIX + "TileEntityTFMoonworm");
		this.addTileEntity( TF_PREFIX + "TileEntityTFNagaSpawner");
		this.addTileEntity( TF_PREFIX + "TileEntityTFPoppingJet");
		this.addTileEntity( TF_PREFIX + "TileEntityTFReverter");
		this.addTileEntity( TF_PREFIX + "TileEntityTFSmoker");
		this.addTileEntity( TF_PREFIX + "TileEntityTFSnowQueenSpawner");
		this.addTileEntity( TF_PREFIX + "TileEntityTFTowerBossSpawner");
		this.addTileEntity( TF_PREFIX + "TileEntityTFTowerBuilder");
		this.addTileEntity( TF_PREFIX + "TileEntityTFTrophy");
		this.addTileEntity( TF_PREFIX + "TileEntityTF");
		

    }
}
