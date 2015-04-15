package spatialiocompat.modules;

import spatialiocompat.core.SIOBaseModule;
import spatialiocompat.core.SIOCompatMarker;

public class ThermalDynamics extends SIOBaseModule {
	
	public ThermalDynamics (SIOCompatMarker marker) {
		super("ThermalDynamics",marker);
	}
	
	@Override
	public void register() {
		this.addTileEntity("cofh.thermaldynamics.block.TileTDBase");
	}

}
