package spatialiocompat.modules;

import spatialiocompat.core.SIOBaseModule;
import spatialiocompat.core.SIOCompatMarker;

public class LogisticsPipes extends SIOBaseModule {
	
	public LogisticsPipes(SIOCompatMarker marker) {
		super("LogisticsPipes",marker);
	}
	
	@Override
	public void register() {
		addTileEntity("logisticspipes.blocks.LogisticsSolidBlock");
		addTileEntity("logisticspipes.blocks.powertile.LogisticsIC2PowerProviderTileEntity");
		addTileEntity("logisticspipes.blocks.powertile.LogisticsPowerProviderTileEntity");
		addTileEntity("logisticspipes.blocks.powertile.LogisticsPowerJunctionTileEntity");
		addTileEntity("logisticspipes.blocks.powertile.LogisticsRFPowerProviderTileEntity");
		addTileEntity("logisticspipes.blocks.crafting.AutoCraftingInventory");
		addTileEntity("logisticspipes.blocks.crafting.FakePlayer");
		addTileEntity("logisticspipes.blocks.crafting.LogisticsCraftingTableTileEntity");
		addTileEntity("logisticspipes.blocks.LogisticsSecurityTileEntity");
		addTileEntity("logisticspipes.blocks.LogisticsSolderingTileEntity");
		addTileEntity("logisticspipes.pipes.PipeBlockRequestTable");
		addTileEntity("logisticspipes.pipes.PipeFluidBasic");
		addTileEntity("logisticspipes.pipes.PipeFluidExtractor");
		addTileEntity("logisticspipes.pipes.PipeFluidInsertion");
		addTileEntity("logisticspipes.pipes.PipeFluidProvider");
		addTileEntity("logisticspipes.pipes.PipeFluidRequestLogistics");
		addTileEntity("logisticspipes.pipes.PipeFluidSatellite");
		addTileEntity("logisticspipes.pipes.PipeItemsApiaristAnalyser");
		addTileEntity("logisticspipes.pipes.PipeApiaristSink");
		addTileEntity("logisticspipes.pipes.PipeItemsBasicLogistics");
		addTileEntity("logisticspipes.pipes.PipeItemsCraftingLogistics");
		addTileEntity("logisticspipes.pipes.PipeItemsCraftingLogisticsMk2");
		addTileEntity("logisticspipes.pipes.PipeItemsCraftingLogisticsMk3");
		addTileEntity("logisticspipes.pipes.PipeItemsFirewall");
		addTileEntity("logisticspipes.pipes.PipeItemsFluidSupplier");
		addTileEntity("logisticspipes.pipes.PipeItemsInvSysConnector");
		addTileEntity("logisticspipes.pipes.PipeItemsProviderLogistics");
		addTileEntity("logisticspipes.pipes.PipeItemsProviderLogisticsMk2");
		addTileEntity("logisticspipes.pipes.PipeItemsRemoteOrdererLogistics");
		addTileEntity("logisticspipes.pipes.PipeItemsRequestLogistics");
		addTileEntity("logisticspipes.pipes.PipeItemsRequestLogisticsMk2");
		addTileEntity("logisticspipes.pipes.PipeItemsSatelliteLogistics");
		addTileEntity("logisticspipes.pipes.PipeItemsSupplierLogistics");
		addTileEntity("logisticspipes.pipes.PipeItemsSystemDestinationLogistics");
		addTileEntity("logisticspipes.pipes.PipeItemsSystemEntranceLogistics");
		addTileEntity("logisticspipes.pipes.PipeLogisticsChassi");
		addTileEntity("logisticspipes.pipes.PipeLogisticsChassiMk1");
		addTileEntity("logisticspipes.pipes.PipeLogisticsChassiMk2");
		addTileEntity("logisticspipes.pipes.PipeLogisticsChassiMk3");
		addTileEntity("logisticspipes.pipes.PipeLogisticsChassiMk4");
		addTileEntity("logisticspipes.pipes.PipeLogisticsChassiMk5");
		addTileEntity("logisticspipes.renderer.LogisticsTileRenderController");
	}

}
