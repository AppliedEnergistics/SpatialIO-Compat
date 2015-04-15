package spatialiocompat.modules;

import spatialiocompat.core.SIOBaseModule;
import spatialiocompat.core.SIOCompatMarker;

public class EnderStorage extends SIOBaseModule {
	
	public EnderStorage(SIOCompatMarker marker) {
		super("EnderStorage",marker);
	}
	
	@Override
	public void register() {
		addTileEntity("codechicken.enderstorage.storage.item.TileEnderChest");
		addTileEntity("codechicken.enderstorage.storage.liquid.TileEnderTank");
	}
}
