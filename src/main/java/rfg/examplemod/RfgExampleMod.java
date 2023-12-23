package rfg.examplemod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.item.crafting.CraftingManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import rfg.examplemod.blocks.InitBlocks;
import rfg.examplemod.config.ConfigHandler;

@Mod(modid = ModInformation.ID, name = ModInformation.NAME, version = ModInformation.VERSION/*Tags.VERSION*/)
public class RfgExampleMod {

    @Mod.Instance(ModInformation.ID)
    public static RfgExampleMod exampleInstance;

    /*@SidedProxy(modId = "RFGExampleMod", clientSide = "example.proxies.ClientProxy", serverSide = "example.proxies.CommonProxy")
    public static CommonProxy proxy;*/

    @Mod.EventHandler
    public void examplePreInitMethod(FMLPreInitializationEvent examplePreInitEvent) {
        ConfigHandler.initConfig(examplePreInitEvent.getSuggestedConfigurationFile());
        InitBlocks.init();
    }

    @Mod.EventHandler
    public void exampleInitMethod(FMLInitializationEvent exampleInitEvent) {
        InitBlocks.addNames();
        InitBlocks.registerTileEntities();

    }

    @Mod.EventHandler
    public void examplePostInitMethod(FMLPostInitializationEvent examplePostInitEvent) {

    }
}













   /* public static final Logger LOGGER = LogManager.getLogger("RFGExampleMod");

    @Mod.EventHandler
    @SuppressWarnings("unused")
    public void init(FMLInitializationEvent ev) {
        LOGGER.info("Hello, RFG example mod!");
        LOGGER.info("Recipe count now: {}", CraftingManager.getInstance().getRecipeList().size());
    }*/
