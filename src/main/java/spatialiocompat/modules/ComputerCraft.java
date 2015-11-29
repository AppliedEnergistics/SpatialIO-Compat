package spatialiocompat.modules;

import spatialiocompat.core.SIOBaseModule;
import spatialiocompat.core.SIOCompatMarker;

public class ComputerCraft extends SIOBaseModule {
	
	public ComputerCraft( SIOCompatMarker marker ) {
		super("ComputerCraft",marker);
	}
	
	@Override
	public void register() {
		addTileEntity("dan200.computercraft.shared.common.TileGeneric");
	}

}
