package rfg.examplemod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import rfg.examplemod.tileentities.TestTileEntity;

public class TestBlock extends BlockContainer {

    public TestBlock(int id) {
        super(Material.iron);

        setCreativeTab(CreativeTabs.tabRedstone);
        setHardness(2F);
        setStepSound(Block.soundTypeMetal);

    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TestTileEntity();
    }
}
