package spatialiocompat.modules;

import spatialiocompat.core.SIOBaseModule;
import spatialiocompat.core.SIOCompatMarker;

public class ThermalExpansion extends SIOBaseModule {
	
	public ThermalExpansion(SIOCompatMarker marker) {
		super("ThermalExpansion",marker);
	}
	
	@Override
    public void register()
    {
    	addTileEntity("cofh.thermalexpansion.block.TileTEBase");
    }
}
