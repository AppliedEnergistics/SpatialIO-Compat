package spatialiocompat.modules;

import spatialiocompat.core.SIOBaseModule;
import spatialiocompat.core.SIOCompatMarker;

public class SecurityCraft extends SIOBaseModule {
	
	public SecurityCraft (SIOCompatMarker marker) {
		super("SecurityCraft",marker);
	}

	@Override
	public void register() {
		this.addTileEntity("org.freeforums.geforce.securitycraft.tileentity.CustomizableSCTE");
		this.addTileEntity("org.freeforums.geforce.securitycraft.tileentity.TileEntityAlarm");
		this.addTileEntity("org.freeforums.geforce.securitycraft.tileentity.TileEntityEmpedWire");
		this.addTileEntity("org.freeforums.geforce.securitycraft.tileentity.TileEntityInventoryScanner");
		this.addTileEntity("org.freeforums.geforce.securitycraft.tileentity.TileEntityKeycardReader");
		this.addTileEntity("org.freeforums.geforce.securitycraft.tileentity.TileEntityKeypadChest");
		this.addTileEntity("org.freeforums.geforce.securitycraft.tileentity.TileEntityKeypadChestRenderer");
		this.addTileEntity("org.freeforums.geforce.securitycraft.tileentity.TileEntityLaserBlock");
		this.addTileEntity("org.freeforums.geforce.securitycraft.tileentity.TileEntityLogger");
		this.addTileEntity("org.freeforums.geforce.securitycraft.tileentity.TileEntityMineLoc");
		this.addTileEntity("org.freeforums.geforce.securitycraft.tileentity.TileEntityOwnable");
		this.addTileEntity("org.freeforums.geforce.securitycraft.tileentity.TileEntityPortableRadar");
		this.addTileEntity("org.freeforums.geforce.securitycraft.tileentity.TileEntityRAM");
		this.addTileEntity("org.freeforums.geforce.securitycraft.tileentity.TileEntityReinforcedDoor");
		this.addTileEntity("org.freeforums.geforce.securitycraft.tileentity.TileEntityRetinalScanner");
		this.addTileEntity("org.freeforums.geforce.securitycraft.tileentity.TileEntitySCTE");
		this.addTileEntity("org.freeforums.geforce.securitycraft.tileentity.TileEntitySecurityCamera");
		
		this.addTileEntity("org.freeforums.geforce.securitycraft.blocks.BlockAlarm");
		this.addTileEntity("org.freeforums.geforce.securitycraft.blocks.BlockBogusLava");
		this.addTileEntity("org.freeforums.geforce.securitycraft.blocks.BlockBogusWater");
		this.addTileEntity("org.freeforums.geforce.securitycraft.blocks.BlockEmpedWire");
		this.addTileEntity("org.freeforums.geforce.securitycraft.blocks.BlockInventoryScanner");
		this.addTileEntity("org.freeforums.geforce.securitycraft.blocks.BlockKeycardReader");
		this.addTileEntity("org.freeforums.geforce.securitycraft.blocks.BlockKeypadChest");
		this.addTileEntity("org.freeforums.geforce.securitycraft.blocks.BlockKeypadChestRenderer");
		this.addTileEntity("org.freeforums.geforce.securitycraft.blocks.BlockLaserBlock");
		this.addTileEntity("org.freeforums.geforce.securitycraft.blocks.BlockLogger");
		this.addTileEntity("org.freeforums.geforce.securitycraft.blocks.BlockMineLoc");
		this.addTileEntity("org.freeforums.geforce.securitycraft.blocks.BlockOwnable");
		this.addTileEntity("org.freeforums.geforce.securitycraft.blocks.BlockPortableRadar");
		this.addTileEntity("org.freeforums.geforce.securitycraft.blocks.BlockReinforcedDoor");
		this.addTileEntity("org.freeforums.geforce.securitycraft.blocks.BlockyRetinalScanner");
		this.addTileEntity("org.freeforums.geforce.securitycraft.blocks.BlockReinforcedFenceGate");
		this.addTileEntity("org.freeforums.geforce.securitycraft.blocks.BlockReinforcedGlass");
		this.addTileEntity("org.freeforums.geforce.securitycraft.blocks.BlockReinforcedWood");
		this.addTileEntity("org.freeforums.geforce.securitycraft.blocks.BlockUnbreakableBars");
		this.addTileEntity("org.freeforums.geforce.securitycraft.blocks.mines.BlockMine");

	}
}
