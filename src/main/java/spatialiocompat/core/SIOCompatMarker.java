package spatialiocompat.core;

import java.util.LinkedList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import cpw.mods.fml.common.ICrashCallable;

/**
 * Provides transparency in the crash log so other mod-devs can see if their tiles are enabled or not.
 */
public class SIOCompatMarker implements ICrashCallable {

	List<String> list = new LinkedList();
	
	@Override
	public String call() throws Exception
	{
		return StringUtils.join( list, ", " );
	}

	@Override
	public String getLabel()
	{
		return "Spatial IO Compat";
	}

	public void add(String tileEntityPath) {
		list.add( tileEntityPath );
	}

}
