package spatialiocompat.modules;

import spatialiocompat.core.SIOBaseModule;
import spatialiocompat.core.SIOCompatMarker;

public class ModularPowersuits extends SIOBaseModule{
	
	public ModularPowersuits(SIOCompatMarker marker) {
		super("powersuits",marker);
	}
	
	@Override
	public void register()
	{
		addTileEntity("net.machinemuse.powersuits.block.TileEntityLuxCapacitor");
		addTileEntity("net.machinemuse.powersuits.block.TileEntityTinkerTable");
	}
}
