package rfg.examplemod.config;

import net.minecraftforge.common.config.Configuration;
import rfg.examplemod.blocks.BlockInfo;

import java.io.File;




public class ConfigHandler {
    private static final String CATEGORY_EXAMPLE = "EXAMPLE CATEGORY";

    public static int VALUE_EXAMPLE;
    private static final String NAME_EXAMPLE = "EXAMPLE NAME";
    private static final int DEFAULT_EXAMPLE = 5;

    public static void initConfig(File configFile) {
        Configuration config = new Configuration(configFile);

        config.load();

        BlockInfo.MACHINE_ID = config.get("BLOCK IDS", BlockInfo.MACHINE_KEY, BlockInfo.MACHINE_DEFAULT).getInt();

        VALUE_EXAMPLE = config.get(CATEGORY_EXAMPLE, NAME_EXAMPLE, DEFAULT_EXAMPLE).getInt();

        config.save();
    }
}
