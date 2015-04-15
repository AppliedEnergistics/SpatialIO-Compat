package spatialiocompat.modules;

import spatialiocompat.core.SIOBaseModule;
import spatialiocompat.core.SIOCompatMarker;

public class EnderIO extends SIOBaseModule{
	
	public EnderIO (SIOCompatMarker marker)
	{
		super("EnderIO",marker);
	}
	
	@Override
	public void register() {
		addTileEntity("crazypants.enderio.TileEntityEio");
	}

}
