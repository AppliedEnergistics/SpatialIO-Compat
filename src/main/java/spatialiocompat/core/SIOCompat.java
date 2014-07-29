package spatialiocompat.core;

import spatialiocompat.modules.CarpenterBlocks;
import spatialiocompat.modules.IronChests;
import spatialiocompat.modules.Thaumcraft;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = SIOCompat.modid, name = SIOCompat.name, version = SIOCompat.version, dependencies = SIOCompat.dependencies)
public class SIOCompat 
{

    public final static String modid        = "spatialio-compat";
    public final static String name         = "Spatial IO Compat";
    public final static String version      = "@version@";
    public final static String dependencies = "required-after:appliedenergistics2";

    @EventHandler
    void PreInit(FMLPreInitializationEvent event)
    {
        // nothing.
    }

    @EventHandler
    void Init(FMLInitializationEvent event)
    {
        if ( Loader.isModLoaded( "CarpentersBlocks" ) )
            CarpenterBlocks.register();
        
        if ( Loader.isModLoaded( "IronChest" ) )
            IronChests.register();
        
        if ( Loader.isModLoaded( "Thaumcraft" ) )
    		Thaumcraft.register();
    }

	@EventHandler
	void PostInit(FMLPostInitializationEvent event)
	{
		// nothing.
	}

}
