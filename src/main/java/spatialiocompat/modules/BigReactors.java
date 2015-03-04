package spatialiocompat.modules;


import spatialiocompat.core.SIOBaseModule;
import spatialiocompat.core.SIOCompatMarker;


/**
 * Big Reactors
 * <p/>
 * Tested by yueh.
 * <p/>
 * Moving reactors and turbines works.
 * Moving will reset reactors and turbines though,
 * reactors can be re-activated through redstone, but turbines need GUI-Interaction.
 * <p/>
 * Friday, December 26, 2014
 * BigReactors 0.4.0A for MC 1.7.10
 */
public class BigReactors extends SIOBaseModule
{
	public BigReactors( SIOCompatMarker marker )
	{
		super( "BigReactors", marker );
	}

	@Override
	public void register()
	{
		this.addTileEntity( "erogenousbeef.core.multiblock.MultiblockTileEntityBase" );
	}
}
