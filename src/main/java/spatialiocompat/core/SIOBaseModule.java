package spatialiocompat.core;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.event.FMLInterModComms;

public class SIOBaseModule {

    final private static SIOCompatMarker Marker;
    
    static {

    	Marker = new SIOCompatMarker();
        FMLCommonHandler.instance().registerCrashCallable(Marker);
        
    }
    
    public static void addTileEntity(String tileEntityPath)
    {
        Marker.add(tileEntityPath);
        FMLInterModComms.sendMessage("appliedenergistics2", "whitelist-spatial", tileEntityPath);
    }
    
}
