package spatialiocompat;


import java.util.List;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

import com.google.common.collect.Lists;

import spatialiocompat.core.SIOCompatMarker;
import spatialiocompat.core.SIOModule;
import spatialiocompat.modules.AdvancedGenetics;
import spatialiocompat.modules.BigReactors;
import spatialiocompat.modules.BloodMagic;
import spatialiocompat.modules.CarpenterBlocks;
import spatialiocompat.modules.ChickenChunks;
import spatialiocompat.modules.ComputerCraft;
import spatialiocompat.modules.EnderIO;
import spatialiocompat.modules.EnderStorage;
import spatialiocompat.modules.ExtraUtilities;
import spatialiocompat.modules.IronChests;
import spatialiocompat.modules.Jabba;
import spatialiocompat.modules.LogisticsPipes;
import spatialiocompat.modules.ModularPowersuits;
import spatialiocompat.modules.Mystcraft;
import spatialiocompat.modules.OpenBlocks;
import spatialiocompat.modules.OpenModsLib;
import spatialiocompat.modules.Railcraft;
import spatialiocompat.modules.SecurityCraft;
import spatialiocompat.modules.Thaumcraft;
import spatialiocompat.modules.ThermalDynamics;
import spatialiocompat.modules.ThermalExpansion;


@Mod( modid = SIOCompat.MOD_ID, name = SIOCompat.MOD_NAME, version = SIOCompat.MOD_VERSION, dependencies = SIOCompat.MOD_DEPENDENCIES )
public class SIOCompat
{
	public final static String MOD_ID = "spatialio-compat";
	public final static String MOD_NAME = "Spatial IO Compat";
	public final static String MOD_VERSION = "@version@";
	public final static String MOD_DEPENDENCIES = "required-after:appliedenergistics2";

	/**
	 * Contains all modules which will be registered
	 */
	private final List<SIOModule> modules;

	/**
	 * Creates a {@link SIOCompat}.
	 *
	 * Initializes all needed modules.
	 */
	public SIOCompat()
	{
		final SIOCompatMarker marker = new SIOCompatMarker();
		FMLCommonHandler.instance().registerCrashCallable( marker );

		final SIOModule advGenetics = new AdvancedGenetics( marker );
		final SIOModule bigReactors = new BigReactors( marker );
		final SIOModule bloodMagic = new BloodMagic( marker );
		final SIOModule carpenterBlocks = new CarpenterBlocks( marker );
		final SIOModule chickenChunks = new ChickenChunks( marker );
		final SIOModule computerCraft = new ComputerCraft( marker );
		final SIOModule enderIO = new EnderIO( marker );
		final SIOModule enderStorage = new EnderStorage( marker );
		final SIOModule extraUtilities = new ExtraUtilities( marker );
		final SIOModule ironChests = new IronChests( marker );
		final SIOModule jabba = new Jabba( marker );
		final SIOModule logisticsPipes = new LogisticsPipes( marker );
		final SIOModule modularPowersuits = new ModularPowersuits( marker );
		final SIOModule mystcraft = new Mystcraft( marker );
		final SIOModule openBlocks = new OpenBlocks( marker );
		final SIOModule openModsLib = new OpenModsLib( marker );
		final SIOModule railcraft = new Railcraft( marker );
		final SIOModule securityCraft = new SecurityCraft( marker );
		final SIOModule thaumcraft = new Thaumcraft( marker );
		final SIOModule thermalDynamics = new ThermalDynamics( marker );
		final SIOModule thermalExpansion = new ThermalExpansion( marker );

		this.modules = Lists.newArrayList(
				advGenetics,
				bigReactors,
				bloodMagic,
				carpenterBlocks,
				chickenChunks,
				computerCraft,
				enderIO,
				enderStorage,
				extraUtilities,
				ironChests,
				jabba,
				logisticsPipes,
				modularPowersuits,
				mystcraft,
				openBlocks,
				openModsLib,
				railcraft,
				securityCraft,
				thaumcraft,
				thermalDynamics,
				thermalExpansion
		);
	}

	/**
	 * Registers all added modules if corresponding mod is loaded
	 *
	 * @param event ignored
	 */
	@EventHandler
	void initialization( FMLInitializationEvent event )
	{
		for ( SIOModule module : this.modules )
		{
			if ( Loader.isModLoaded( module.getModID() ) )
			{
				module.register();
			}
		}
	}
}
