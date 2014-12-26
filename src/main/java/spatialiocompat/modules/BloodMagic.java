package spatialiocompat.modules;


import spatialiocompat.core.SIOBaseModule;
import spatialiocompat.core.SIOCompatMarker;


/**
 * TODO: Created by FireBall1725 on 12/16/2014.
 */
public class BloodMagic extends SIOBaseModule
{
	private static final String BM_API_PREFIX = "WayofTime.alchemicalWizardry.api.alchemy.energy.";
	private static final String BM_TE_PREFIX = "WayofTime.alchemicalWizardry.common.tileEntity.";

	public BloodMagic( SIOCompatMarker marker )
	{
		super( "AWWayofTime", marker );
	}

	@Override
	public void register()
	{
//		Disabled for now since not throughly tested
//		this.addTileEntity( BM_API_PREFIX + "TileSegmentedReagentHandler" );
//		this.addTileEntity( BM_API_PREFIX + "TileReagentHandler" );
//		this.addTileEntity( BM_TE_PREFIX + "TEAltar" );
//		this.addTileEntity( BM_TE_PREFIX + "TEHomHeart" );
//		this.addTileEntity( BM_TE_PREFIX + "TEImperfectRitualStone" );
//		this.addTileEntity( BM_TE_PREFIX + "TEMasterStone" );
//		this.addTileEntity( BM_TE_PREFIX + "TEOrientable" );
//		this.addTileEntity( BM_TE_PREFIX + "TEPedestal" );
//		this.addTileEntity( BM_TE_PREFIX + "TEPlinth" );
//		this.addTileEntity( BM_TE_PREFIX + "TESchematicSaver" );
//		this.addTileEntity( BM_TE_PREFIX + "TESocket" );
//		this.addTileEntity( BM_TE_PREFIX + "TESpectralBlock" );
//		this.addTileEntity( BM_TE_PREFIX + "TESpectralContainer" );
//		this.addTileEntity( BM_TE_PREFIX + "TETeleposer" );
//		this.addTileEntity( BM_TE_PREFIX + "TEWritingTable" );
	}
}
