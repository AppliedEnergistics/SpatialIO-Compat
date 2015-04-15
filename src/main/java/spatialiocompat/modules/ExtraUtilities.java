package spatialiocompat.modules;

import spatialiocompat.core.SIOBaseModule;
import spatialiocompat.core.SIOCompatMarker;

public class ExtraUtilities extends SIOBaseModule {
	
	public ExtraUtilities(SIOCompatMarker marker) {
		super("ExtraUtilities",marker);
	}
	
	@Override
	public void register() {
		addTileEntity("com.rwtema.extrautils.tileentity.TileEntityAntiMobTorch");
		addTileEntity("com.rwtema.extrautils.tileentity.TileEntityDrum");
		addTileEntity("com.rwtema.extrautils.tileentity.TileEntityEnderThermicLavaPump");
		addTileEntity("com.rwtema.extrautils.tileentity.TileEntityFilingCabinent");
		addTileEntity("com.rwtema.extrautils.tileentity.TileEntityRainMuffler");
		addTileEntity("com.rwtema.extrautils.tileentity.TileEntitySoundMuffler");
		addTileEntity("com.rwtema.extrautils.tileentity.TileEntityTradingPost");
		addTileEntity("com.rwtema.extrautils.tileentity.TileEntityTrashCan");
		addTileEntity("com.rwtema.extrautils.tileentity.TileEntityWorldTimer");
		addTileEntity("com.rwtema.extrautils.tileentity.transfernodes.TileEntityTransferNode");
	}

}
