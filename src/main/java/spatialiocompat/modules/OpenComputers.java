package spatialiocompat.modules;

import spatialiocompat.core.SIOBaseModule;
import spatialiocompat.core.SIOCompatMarker;


/**
 * OpenComputers
 *
 * 
 * 
 *
 * 
 *
 */
public class OpenComputers extends SIOBaseModule
{
	final private static String OC_PREFIX = "li.cil.oc.common.tileentity.";

	public OpenComputers( SIOCompatMarker marker )
	{
		super( "OpenComputers", marker );
	}

	@Override
	public void register()
    {
		this.addTileEntity( OC_PREFIX + "AcessPoint");
		this.addTileEntity( OC_PREFIX + "Adapter");
		this.addTileEntity( OC_PREFIX + "Assembler");
		this.addTileEntity( OC_PREFIX + "Cable");
		this.addTileEntity( OC_PREFIX + "Capacitor");
		this.addTileEntity( OC_PREFIX + "Case");
		this.addTileEntity( OC_PREFIX + "Charger");
		this.addTileEntity( OC_PREFIX + "Disassembler");
		this.addTileEntity( OC_PREFIX + "DiskDrive");
		this.addTileEntity( OC_PREFIX + "Geolyzer");
		this.addTileEntity( OC_PREFIX + "Hologram");
		this.addTileEntity( OC_PREFIX + "Keyboard");
		this.addTileEntity( OC_PREFIX + "Microcontroller");
		this.addTileEntity( OC_PREFIX + "MotionSensor");
		this.addTileEntity( OC_PREFIX + "PowerConverter");
		this.addTileEntity( OC_PREFIX + "PowerDistributor");
		this.addTileEntity( OC_PREFIX + "Print");
		this.addTileEntity( OC_PREFIX + "Printer");
		this.addTileEntity( OC_PREFIX + "Raid");
		this.addTileEntity( OC_PREFIX + "Redstone");
		this.addTileEntity( OC_PREFIX + "Robot");
		this.addTileEntity( OC_PREFIX + "RobotProxy");
		this.addTileEntity( OC_PREFIX + "Screen");
		this.addTileEntity( OC_PREFIX + "ServerRack");
		this.addTileEntity( OC_PREFIX + "Switch");
		

    }
}
