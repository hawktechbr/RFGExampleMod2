package rfg.examplemod.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDoublePlant;
import rfg.examplemod.tileentities.TestTileEntity;

public class InitBlocks {
    public static Block machine;

    public static void init() {
        machine = new TestBlock(BlockInfo.MACHINE_ID);
        GameRegistry.registerBlock(machine, BlockInfo.MACHINE_KEY);
    }

    public static void addNames() {
        LanguageRegistry.addName(machine, BlockInfo.MACHINE_NAME);
    }

    public static void registerTileEntities() {
        GameRegistry.registerTileEntity(TestTileEntity.class, "testTileEntity");
    }

}
