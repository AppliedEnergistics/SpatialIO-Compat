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

    public final static String modid        = "spatialio-compat";
    public final static String name         = "Spatial IO Compat";
    public final static String version      = "@version@";
    public final static String dependencies = "required-after:appliedenergistics2";

    private static SIOCompatMarker Marker = new SIOCompatMarker();

    public SIOCompat()
    {
        // Mark in the crash logs that this is installed visibly.
        FMLCommonHandler.instance().registerCrashCallable(Marker);
    }

    public static void addTileEntity(String tileEntityPath)
    {
        Marker.add(tileEntityPath);
        FMLInterModComms.sendMessage("appliedenergistics2", "whitelist-spatial", tileEntityPath);
    }

    @EventHandler
    void PreInit(FMLPreInitializationEvent event)
    {
        // nothing.
    }

    @EventHandler
    void Init(FMLInitializationEvent event)
    {
        SIOCCarpenterBlocks.RegisterCompat();
        SIOCIronChests.RegisterCompat();
        SIOCThaumcraft.RegisterCompat();

    }

	@EventHandler
	void PostInit(FMLPostInitializationEvent event)
	{
		// nothing.
	}

}
