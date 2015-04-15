package spatialiocompat.modules;

import spatialiocompat.core.SIOBaseModule;
import spatialiocompat.core.SIOCompatMarker;

public class Railcraft extends SIOBaseModule {
	
	public Railcraft(SIOCompatMarker marker) {
		super("Railcraft",marker);
	}
	
	@Override
	public void register() {
		addTileEntity("mods.railcraft.common.blocks.machine.TileMachineBase");
		addTileEntity("mods.railcraft.common.blocks.machine.TileMachineItem");
		addTileEntity("mods.railcraft.common.blocks.machine.TileTank");
		addTileEntity("mods.railcraft.common.blocks.machine.alpha.TileBlastFurnace");
		addTileEntity("mods.railcraft.common.blocks.machine.alpha.TileCokeOven");
		addTileEntity("mods.railcraft.common.blocks.machine.alpha.TileRockCrusher");
		addTileEntity("mods.railcraft.common.blocks.machine.alpha.TileRollingMachine");
		addTileEntity("mods.railcraft.common.blocks.machine.alpha.TileSteamOven");
		addTileEntity("mods.railcraft.common.blocks.tracks.TileTrack");
		addTileEntity("mods.railcraft.common.blocks.RailcraftTileEntity");
	}

}
