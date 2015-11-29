package spatialiocompat.modules;

import spatialiocompat.core.SIOBaseModule;
import spatialiocompat.core.SIOCompatMarker;

public class Mystcraft extends SIOBaseModule {
	
	public Mystcraft(SIOCompatMarker marker) {
		super("Mystcraft",marker);
	}
	
	@Override
	public void register() {
		addTileEntity("com.xcompwiz.mystcraft.tileentity.TileEntityBook");
		addTileEntity("com.xcompwiz.mystcraft.tileentity.TileEntityBookBinder");
		addTileEntity("com.xcompwiz.mystcraft.tileentity.TileEntityBookDisplay");
		addTileEntity("com.xcompwiz.mystcraft.tileentity.TileEntityBookReceptacle");
		addTileEntity("com.xcompwiz.mystcraft.tileentity.TileEntityBookstand");
		addTileEntity("com.xcompwiz.mystcraft.tileentity.TileEntityDesk");
		addTileEntity("com.xcompwiz.mystcraft.tileentity.TileEntityInkMixer");
		addTileEntity("com.xcompwiz.mystcraft.tileentity.TileEntityLextern");
		addTileEntity("com.xcompwiz.mystcraft.tileentity.TileEntityLinkModifier");
		/* Untested */
		addTileEntity("com.xcompwiz.mystcraft.tileentity.FluidTankFiltered");
		/*
		 * Untested, but a rift in an age shouldn't be storage in the first place.
		 * addTileEntity("com.xcompwiz.mystcraft.tileentity.TileEntityStarFisure");
		 */
}
}
