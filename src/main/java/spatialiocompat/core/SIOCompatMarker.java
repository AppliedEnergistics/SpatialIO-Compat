package spatialiocompat.core;


import java.util.Collection;
import java.util.LinkedList;

import net.minecraftforge.fml.common.ICrashCallable;

import org.apache.commons.lang3.StringUtils;




/**
 * Provides transparency in the crash log so other mod-devs can see if their tiles are enabled or not.
 */
public final class SIOCompatMarker implements ICrashCallable
{
	private final Collection<String> list = new LinkedList<String>();

	@Override
	public String call() throws Exception
	{
		return StringUtils.join( this.list, ", " );
	}

	@Override
	public String getLabel()
	{
		return "Spatial IO Compat";
	}

	public void add( String tileEntityPath )
	{
		this.list.add( tileEntityPath );
	}
}
