Spatial IO Compat
=========================

Welcome to the AE2 Spatial IO Compatibility Project.

The purpose of this project is to create a community driven effort to test and mark TileEntities as compatible.

### Mods that Support Spatial IO Natively

1. AE2 ( obviously; AE2 enables moving of vanilla tile entities. )
2. BuildCraft 6+
3. Rotatable Blocks
4. Mine Factory Reloaded
5. Tinkers Construct
6. ExtraCells 2

### Download Builds
Builds are automtaically done at drone.io [click here](https://drone.io/github.com/AlgorithmX2/SpatialIO-Compat/files): [![Build Status](https://drone.io/github.com/AlgorithmX2/SpatialIO-Compat/status.png)](https://drone.io/github.com/AlgorithmX2/SpatialIO-Compat/latest)

Contributing to the Effort
=========================

### Pull Requests
If you wish to submit a pull request to further expand and enhance the compatibility list feel free to do so.

### Reporting issues
If you encounter an issue with Spatial IO and a TileEntity enabled by this list please let us know, so we can remove from the supported list and mark it as not supported, it is important that we keep this list as accurate and up-to-date as possible.

### Compiling and packaging Spatial IO Compat
1. Clone this repo into a new folder.
2. Use Gradle to setup work space.
 * gradlew setupDecompWorkspace
 * gradlew eclipse
3. Optional: Make Changes
4. gradlew build
 * binaries will be output into build/lib/

Philosophy
=========================

The idea is not to force compatibility on other mods, but rather to enable support for TileEntities which would other wise already function without changes, We also wish to support the decision of any mod developer which wishes to not support, or support the feature themselves.

Before PR'ing any tile entity to the main repository as supported please make sure you rigorously test the effected tile entity with Spatial IO to ensure that it functions properly.

Be very cautious of marking any sort of MultiBlock structure, or Grid Based structures as supported, this should most likely require native support rather then belonging in this mod.
