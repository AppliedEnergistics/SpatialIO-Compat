package spatialiocompat.modules;

import spatialiocompat.core.SIOBaseModule;
import spatialiocompat.core.SIOCompatMarker;

public class ChickenChunks extends SIOBaseModule{
	
	public ChickenChunks( SIOCompatMarker marker )
	{
		super("ChickenChunks",marker);
	}
	
	@Override
	public void register()
	{
		addTileEntity("codechicken.chunkloader.TileChunkLoaderBase");
	}

}