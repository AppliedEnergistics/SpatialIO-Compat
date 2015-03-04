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
import spatialiocompat.modules.BigReactors;
import spatialiocompat.modules.BloodMagic;
import spatialiocompat.modules.CarpenterBlocks;
import spatialiocompat.modules.IronChests;
import spatialiocompat.modules.Jabba;
import spatialiocompat.modules.OpenModsLib;
import spatialiocompat.modules.Thaumcraft;


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

		final SIOModule bigReactors = new BigReactors( marker );
		final SIOModule bloodMagic = new BloodMagic( marker );
		final SIOModule carpenterBlocks = new CarpenterBlocks( marker );
		final SIOModule ironChests = new IronChests( marker );
		final SIOModule jabba = new Jabba( marker );
		final SIOModule openModsLib = new OpenModsLib( marker );
		final SIOModule thaumcraft = new Thaumcraft( marker );

		this.modules = Lists.newArrayList(
				bigReactors,
				bloodMagic,
				carpenterBlocks,
				ironChests,
				jabba,
				openModsLib,
				thaumcraft
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
