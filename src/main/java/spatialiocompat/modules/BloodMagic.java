package spatialiocompat.modules;

import spatialiocompat.core.SIOBaseModule;

/**
 * Created by FireBall1725 on 12/16/2014.
 */
public class BloodMagic extends SIOBaseModule {
    public static void register()
    {
        addTileEntity("WayofTime.alchemicalWizardry.api.alchemy.energy.TileSegmentedReagentHandler");
        addTileEntity("WayofTime.alchemicalWizardry.api.alchemy.energy.TileReagentHandler");
        addTileEntity("WayofTime.alchemicalWizardry.common.tileEntity.TEAltar");
        addTileEntity("WayofTime.alchemicalWizardry.common.tileEntity.TEHomHeart");
        addTileEntity("WayofTime.alchemicalWizardry.common.tileEntity.TEImperfectRitualStone");
        addTileEntity("WayofTime.alchemicalWizardry.common.tileEntity.TEMasterStone");
        addTileEntity("WayofTime.alchemicalWizardry.common.tileEntity.TEOrientable");
        addTileEntity("WayofTime.alchemicalWizardry.common.tileEntity.TEPedestal");
        addTileEntity("WayofTime.alchemicalWizardry.common.tileEntity.TEPlinth");
        addTileEntity("WayofTime.alchemicalWizardry.common.tileEntity.TESchematicSaver");
        addTileEntity("WayofTime.alchemicalWizardry.common.tileEntity.TESocket");
        addTileEntity("WayofTime.alchemicalWizardry.common.tileEntity.TESpectralBlock");
        addTileEntity("WayofTime.alchemicalWizardry.common.tileEntity.TESpectralContainer");
        addTileEntity("WayofTime.alchemicalWizardry.common.tileEntity.TETeleposer");
        addTileEntity("WayofTime.alchemicalWizardry.common.tileEntity.TEWritingTable");
    }
}
