package net.tremzack.jameswebbpainting.painting;

import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.tremzack.jameswebbpainting.JamesWebbPainting;

public class ModPaintings {

    public static final PaintingVariant CARINA_ROUGH = registerPainting("carina_rough", new PaintingVariant(64,32));

    public static final PaintingVariant SMACS_ROUGH = registerPainting("smacs_rough", new PaintingVariant(32,32));

    public static final PaintingVariant BIG_SMACS_ROUGH = registerPainting("big_smacs_rough", new PaintingVariant(64,64));

    public static final PaintingVariant SOUTHERN_RING_NEBULA_ROUGH = registerPainting("southern_ring_nebula_rough", new PaintingVariant(64,64));

    public static final PaintingVariant STEPHEN_QUINTET_ROUGH = registerPainting("stephen_quintet_rough", new PaintingVariant(64,64));



    private static PaintingVariant registerPainting (String name, PaintingVariant paintingVariant){
        return Registry.register(Registry.PAINTING_VARIANT, new Identifier(JamesWebbPainting.MOD_ID, name), paintingVariant);
    }
    public static void registerPaintings() {
        JamesWebbPainting.LOGGER.debug("Registering Paintings for" + JamesWebbPainting.MOD_ID);
    }
}
