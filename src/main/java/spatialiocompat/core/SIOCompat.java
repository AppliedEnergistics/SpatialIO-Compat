package spatialiocompat.core;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLInterModComms;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = SIOCompat.modid, name = SIOCompat.name, version = SIOCompat.version, dependencies = SIOCompat.dependencies)
public class SIOCompat 
{

	public final static String modid = "spatialio-compat";
	public final static String name = "Spatial IO Compat";
	public final static String version = "@version@";
	public final static String dependencies ="required-after:appliedenergistics2";

	private SIOCompatMarker Marker = new SIOCompatMarker();

	public SIOCompat()
	{
		// Mark in the crash logs that this is installed visibly.
		FMLCommonHandler.instance().registerCrashCallable( Marker );		
	}

	void addTileEntity( String tileEntityPath )
	{
		Marker.add( tileEntityPath );
		FMLInterModComms.sendMessage( "appliedenergistics2", "whitelist-spatial", tileEntityPath );
	}

	@EventHandler
	void PreInit(FMLPreInitializationEvent event)
	{
		// nothing.
	}

	@EventHandler
	void Init(FMLInitializationEvent event)
	{

		/**
		 * Carpenters Blocks
		 *
		 * Tested by AlgorithmX2 - no issues found.
		 * Friday, June 20, 2014
		 *
		 * Includes all Customizable Blocks
		 */
		addTileEntity( "carpentersblocks.tileentity.TEBase" );

		/**
		 * Iron Chests
		 *
		 * Tested by AlgorithmX2 - no issues found.
		 * Friday, June 20, 2014
		 *
		 * Includes All Types of Chests
		 */
		addTileEntity( "cpw.mods.ironchest.TileEntityIronChest" );

        /**
         * Thaumcraft
         *
         * Tested by J3FF97 - no issues found.
         * Tuesday, July 15, 2014
         *
         * Includes everything. Aspects are retained, everything still functions.
         * NOTE: Did not test on multiblocks. Do not try them if you don't want to lose your stuff. (High probability of not working/crashing)
         */
        addTileEntity("thaumcraft.common.tiles.TileThaumcraft");


    }

	@EventHandler
	void PostInit(FMLPostInitializationEvent event)
	{
		// nothing.
	}

}
