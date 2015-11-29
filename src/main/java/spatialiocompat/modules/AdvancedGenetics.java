package spatialiocompat.modules;

import spatialiocompat.core.SIOBaseModule;
import spatialiocompat.core.SIOCompatMarker;

public class AdvancedGenetics extends SIOBaseModule {
	
	public AdvancedGenetics (SIOCompatMarker marker) {
		super("advancedgenetics",marker);
	}

	@Override
	public void register() {
		this.addTileEntity("com.advGenetics.TileEntity.TileEntityAutoScraper");
		this.addTileEntity("com.advGenetics.TileEntity.TileEntityCentrifuge");
		this.addTileEntity("com.advGenetics.TileEntity.TileEntityCombustionGenerator");
		this.addTileEntity("com.advGenetics.TileEntity.TileEntityDeathEnderchest");
		this.addTileEntity("com.advGenetics.TileEntity.TileEntityDNA");
		this.addTileEntity("com.advGenetics.TileEntity.TileEntityDNAAnalyser");
		this.addTileEntity("com.advGenetics.TileEntity.TileEntityDNAAutoSplitter");
		this.addTileEntity("com.advGenetics.TileEntity.TileEntityDNABreeder");
		this.addTileEntity("com.advGenetics.TileEntity.TileEntityDNACloner");
		this.addTileEntity("com.advGenetics.TileEntity.TileEntityDNACombiner");
		this.addTileEntity("com.advGenetics.TileEntity.TileEntityDNAEncoder");
		this.addTileEntity("com.advGenetics.TileEntity.TileEntityDNAExtractor");
		this.addTileEntity("com.advGenetics.TileEntity.TileEntityDNAInsulator");
		this.addTileEntity("com.advGenetics.TileEntity.TileEntityDNARemover");
		this.addTileEntity("com.advGenetics.TileEntity.TileEntityDNATransmuter");
		this.addTileEntity("com.advGenetics.TileEntity.TileEntityHealCrystal");
		this.addTileEntity("com.advGenetics.TileEntity.TileEntityHomeostasisTube");
		this.addTileEntity("com.advGenetics.TileEntity.TileEntityMicroscope");
		
		this.addTileEntity("com.advGenetics.Blocks.BlockAutoScraper");
		this.addTileEntity("com.advGenetics.Blocks.BlockCentrifuge");
		this.addTileEntity("com.advGenetics.Blocks.BlockCombustionGenerator");
		this.addTileEntity("com.advGenetics.Blocks.BlockDeathEnderchest");
		this.addTileEntity("com.advGenetics.Blocks.BlockDNA");
		this.addTileEntity("com.advGenetics.Blocks.BlockDNAAnalyser");
		this.addTileEntity("com.advGenetics.Blocks.BlockDNAAutoSplitter");
		this.addTileEntity("com.advGenetics.Blocks.BlockDNABreeder");
		this.addTileEntity("com.advGenetics.Blocks.BlockDNACloner");
		this.addTileEntity("com.advGenetics.Blocks.BlockDNACombiner");
		this.addTileEntity("com.advGenetics.Blocks.BlockDNAEncoder");
		this.addTileEntity("com.advGenetics.Blocks.BlockDNAExtractor");
		this.addTileEntity("com.advGenetics.Blocks.BlockDNAInsulator");
		this.addTileEntity("com.advGenetics.Blocks.BlockDNARemover");
		this.addTileEntity("com.advGenetics.Blocks.BlockDNATransmuter");
		this.addTileEntity("com.advGenetics.Blocks.BlockHealCrystal");
		this.addTileEntity("com.advGenetics.Blocks.BlockHomeostasisTube");
		this.addTileEntity("com.advGenetics.Blocks.BlockMicroscope");
	}
}
