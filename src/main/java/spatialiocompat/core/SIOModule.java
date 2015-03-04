package spatialiocompat.core;


/**
 * A Spatial IO Module generally reflects a Minecraft Mod
 */
public interface SIOModule
{
	/**
	 * Mod ID is used to determine if the Mod is loaded.
	 * Using an incorrect Mod ID will result the module not being loaded.
	 *
	 * @return Mod ID of the Mod representing this module
	 */
	String getModID();

	/**
	 * Contains the logic which needs to be done
	 * to register the TileEntities of the mod to AE2.
	 *
	 * AE2 has an IMC call to register new TileEntites to the Spatial IO registry.
	 */
	void register();
}
