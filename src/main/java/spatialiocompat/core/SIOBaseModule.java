package spatialiocompat.core;

import net.minecraftforge.fml.common.event.FMLInterModComms;


/**
 * Basic implementation of {@link spatialiocompat.core.SIOModule}.
 *
 * Adds an easy way to add {@link net.minecraft.tileentity.TileEntity} by just providing it the path of the {@link net.minecraft.tileentity.TileEntity}
 */
public abstract class SIOBaseModule implements SIOModule
{
	private final String modID;
	private final SIOCompatMarker marker;

	public SIOBaseModule( String modID, SIOCompatMarker marker )
	{
		this.modID = modID;
		this.marker = marker;
	}

	@Override
	public String getModID()
	{
		return this.modID;
	}

	/**
	 * Adds a wrapper method to add the {@link net.minecraft.tileentity.TileEntity} to the Spatial IO registry
	 * and is listed in the {@link cpw.mods.fml.common.FMLCommonHandler} as a {@link cpw.mods.fml.common.ICrashCallable}
	 *
	 * @param tileEntityPath canonical name of the {@link net.minecraft.tileentity.TileEntity}
	 */
	public void addTileEntity( String tileEntityPath )
	{
		this.marker.add( tileEntityPath );
		FMLInterModComms.sendMessage( "appliedenergistics2", "whitelist-spatial", tileEntityPath );
	}
}
