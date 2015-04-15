package spatialiocompat.modules;

import spatialiocompat.core.SIOBaseModule;
import spatialiocompat.core.SIOCompatMarker;

public class OpenBlocks extends SIOBaseModule {
	
	public OpenBlocks(SIOCompatMarker marker) {
		super("OpenBlocks",marker);
	}
	
	@Override
	public void register() {
		addTileEntity("openblocks.common.tileentity.TileEntityAutoAnvil");
		addTileEntity("openblocks.common.tileentity.TileEntityAutoEnchantmentTable");
		addTileEntity("openblocks.common.tileentity.TileEntityBearTrap");
		addTileEntity("openblocks.common.tileentity.TileEntityBigButton");
		addTileEntity("openblocks.common.tileentity.TileEntityBlockBreaker");
		addTileEntity("openblocks.common.tileentity.TileEntityBlockPlacer");
		addTileEntity("openblocks.common.tileentity.TileEntityCannon");
		addTileEntity("openblocks.common.tileentity.TileEntityCanvas");
		addTileEntity("openblocks.common.tileentity.TileEntityDonationStation");
		addTileEntity("openblocks.common.tileentity.TileEntityDrawingTable");
		addTileEntity("openblocks.common.tileentity.TileEntityElevator");
		addTileEntity("openblocks.common.tileentity.TileEntityFan");
		addTileEntity("openblocks.common.tileentity.TileEntityFlag");
		addTileEntity("openblocks.common.tileentity.TileEntityGoldenEgg");
		addTileEntity("openblocks.common.tileentity.TileEntityGrave");
		addTileEntity("openblocks.common.tileentity.TileEntityHealBlock");
		addTileEntity("openblocks.common.tileentity.TileEntityImaginary");
		addTileEntity("openblocks.common.tileentity.TileEntityItemDropper");
		addTileEntity("openblocks.common.tileentity.TileEntityPaintCan");
		addTileEntity("openblocks.common.tileentity.TileEntityPaintMixer");
		addTileEntity("openblocks.common.tileentity.TileEntityPortal");
		addTileEntity("openblocks.common.tileentity.TileEntityProjector");
		addTileEntity("openblocks.common.tileentity.TileEntityRadio");
		addTileEntity("openblocks.common.tileentity.TileEntitySky");
		addTileEntity("openblocks.common.tileentity.TileEntitySprinkler");
		addTileEntity("openblocks.common.tileentity.TileEntityTank");
		addTileEntity("openblocks.common.tileentity.TileEntityTarget");
		addTileEntity("openblocks.common.tileentity.TileEntityTrophy");
		addTileEntity("openblocks.common.tileentity.TileEntityVacuumHopper");
		addTileEntity("openblocks.common.tileentity.TileEntityVillageHighlighter");
		addTileEntity("openblocks.common.tileentity.TileEntityXPBottler");
		addTileEntity("openblocks.common.tileentity.TileEntityXPDrain");
		addTileEntity("openblocks.common.tileentity.TileEntityXPShower");
	}

}
