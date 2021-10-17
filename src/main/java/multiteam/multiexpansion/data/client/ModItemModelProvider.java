package multiteam.multiexpansion.data.client;

import multiteam.multiexpansion.MultiExpansion;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, MultiExpansion.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //Blockitems
        withExistingParent("withered_bone_block", modLoc("block/withered_bone_block"));


        //Items
        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

        //Regular Items
        builder(itemGenerated, "acacia_bark");
        builder(itemGenerated, "birch_bark");
        builder(itemGenerated, "dark_oak_bark");
        builder(itemGenerated, "jungle_bark");
        builder(itemGenerated, "oak_bark");
        builder(itemGenerated, "spruce_bark");

        builder(itemGenerated, "emerald_apple");

        builder(itemGenerated, "withered_bone");
        builder(itemGenerated, "withered_bone_meal");

        builder(itemGenerated, "ender_pearl_shard");

    }

    private ItemModelBuilder builder(ModelFile itemGenerated, String name) {
        return getBuilder(name).parent(itemGenerated).texture("layer0", "item/"+name);
    }

}
