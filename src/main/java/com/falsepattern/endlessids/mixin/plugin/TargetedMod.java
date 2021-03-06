package com.falsepattern.endlessids.mixin.plugin;

import com.falsepattern.endlessids.config.DarkWorldIDConfig;
import com.falsepattern.endlessids.config.FuturepackIDConfig;
import com.falsepattern.lib.config.ConfigException;
import com.falsepattern.lib.config.ConfigurationManager;
import com.falsepattern.lib.mixin.ITargetedMod;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.function.Predicate;

import static com.falsepattern.lib.mixin.ITargetedMod.PredicateHelpers.startsWith;

@RequiredArgsConstructor
public enum TargetedMod implements ITargetedMod {

    ABYSSALCRAFT("AbyssalCraft", true, startsWith("abyssalcraft-")),
    ATG("Alternate Terrain Generation", true, startsWith("atg")),
    ANTIQUEATLAS("Antique Atlas", true, startsWith("antiqueatlas")),
    ANTIIDCONFLICT("Anti ID Conflict", true, startsWith("antiidconflict")),
    BOP("Biomes O' Plenty", true, startsWith("biomesoplenty-")),
    BIOMETWEAKER("Biome Tweaker", true, startsWith("biometweaker-")),
    BIOMEWAND("Biome Wand", true, startsWith("1.7.10-biome-wand-").or(startsWith("biome-wand"))),
    COFHLIB("CoFH Lib", true, startsWith("cofhlib-")),
    DARKWORLD("Dark World", true, startsWith("darkworld-")),
    DRAGONAPI("DragonAPI", false, startsWith("dragonapi")),
    EB("Enhanced Biomes", true, startsWith("Enhanced Biomes").or(startsWith("enhancedbiomes"))),
    EREBUS("The Erebus", true, startsWith("theerebus")),
    EXTRAPLANETS("Extra Planets", false, startsWith("extraplanets-")),
    EXTRAUTILITIES("Extra Utilities", true, startsWith("extrautilities-")),
    FUTUREPACK("Futurepack", true, startsWith("[1.7.10]futurepack").or(startsWith("futurepack-"))),
    GALACTICRAFTCORE("GalactiCraftCore", false, startsWith("galacticraftcore")),
    HIGHLANDS("Highlands", true, startsWith("highlands")),
    ICG("Immersive Cavegen", true, startsWith("immersivecavegen")),
    LOTR("LOTR Mod", false, startsWith("lotrmod")),
    MFQM("More Fun Quicksand Mod", true, startsWith("morefunquicksandmod-")),
    NATURESCOMPASS("Nature's Compass", true, startsWith("naturescompass")),
    NETHERLICIOUS("Netherlicious", true, startsWith("netherlicious-")),
    RTG("Realistic Terrain Generation", true, startsWith("rtg-")),
    THAUMCRAFT("Thaumcraft", true, startsWith("thaumcraft")),
    TROPICRAFT("Tropicraft", true, startsWith("tropicraft-")),
    TWILIGHTFOREST("Twilight Forest", true, startsWith("twilightforest")),
    UBC("Underground Biomes Constructs", true, startsWith("undergroundbiomesconstructs-")),
    WORLDEDIT("WorldEdit", false, startsWith("worldedit-")),
    ;

    @Getter
    private final String modName;
    @Getter
    private final boolean loadInDevelopment;
    @Getter
    private final Predicate<String> condition;
}
