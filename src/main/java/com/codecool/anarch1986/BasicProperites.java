package com.codecool.anarch1986;

import java.util.Random;

/**
 * Created by tomi on 2017.05.31..
 */
public class BasicProperites {
    private static Random random = new Random();

    private static String[] terrains =
            {"Airless Rock", "Arid Badland", "Blasted Waste", "Desert", "Endless Sea",
                    "Forest", "Glassed-over", "Icy Waste", "Island Archipelago",
                    "Jungle", "Landless Sky", "Moorland", "Mountains", "Plains", "River",
                    "Savannah", "Swamp", "Tundra", "Underwater", "Volcanic"};

    private static String[] elements =
            {"Caverns", "Clouds", "Earth", "Earthquakes", "Fog", "Geysers", "Hills", "Lakes",
                    "Lightning", "Rain", "Rivers", "Seas", "Seasons", "Shores", "Sky",
                    "Stars", "Storms", "Thunder", "Tides", "Wind"};

    private static String[] wrappers = {"Births monsters","Comes from strange sources","Found where it shouldn't be",
            "Ignites in unclean flames","Induces a great emotion","Induces madness"
            ,"Is a home for dark things","Is a road to evil places","Is a slow poison",
            "Is a strange color","Is acidic or noxious","Is an ancient ruin remnant",
            "Is sentient","Issues terrible commands","Made of something strange",
            "Murderously dangerous","Punishes those who offend","Scours or wounds",
            "Serves dark powers","Whispers something"};

    private static String[] floraList = {"Carnivorous","Colonial or hive-like",
            "Gelatinous or tentacular","Geometric in structure",
            "Grows in alien matter","Jewel-colored","Largely parasitic",
            "Like prehistoric cycads",
            "Made of strange stuff","Mobile","Nauseating in hue","Sentient to a degree",
            "Produces strange drugs","Produces strange music","Resembles animals",
            "Spongy and moss-like","Strangely fragrant","Symbiotic with animals",
            "Vine-like and creeping","Violently invasive"};

    private static String[] faunaList = {"Avian or feathered","Made of strange stuff","Cries with human voices","Dead but still moving",
            "Feeds largely on carrion","Ghostly or semi-tangible","Insatiably voracious",
            "Inscribed with glyphs","Insectile or arthropodic","Intelligent as humans",
            "Made of light or fog","Metallic or artificial","Warped and tormented",
            "Parasitic on each other","Piscine or crablike","Plotting against humans",
            "Reptilian or serpentine","Resembles humans","Warped in its shape",
            "Swarm or hive entities"};


    public static String[] getTerrains() {
        return terrains;
    }

    public static String returnRandomTerrain() {

        return terrains[random.nextInt(terrains.length)];

    }

    public static String[] getElements() {
        return elements;
    }

    public static String returnRandomElement() {

        return elements[random.nextInt(elements.length)];

    }

    public static String[] getWrappers() {
        return wrappers;
    }

    public static String returnRandomWrapper() {

        return wrappers[random.nextInt(wrappers.length)];

    }

    public static String[] getFloraList() {
        return floraList;
    }

    public static String returnRandomFlora() {

        return floraList[random.nextInt(floraList.length)];

    }

    public static String[] getFaunaList() {
        return faunaList;
    }

    public static String returnRandomFauna() {

        return faunaList[random.nextInt(faunaList.length)];

    }
}






