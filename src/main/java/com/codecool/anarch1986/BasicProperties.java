package com.codecool.anarch1986;

import java.util.Random;

/**
 *This class is a collector of string arrays.
 * It has several methods for returning these arrays, or one of their elements.
 * The application uses these to set the BasicTrait object fields.
 */

public class BasicProperties {

    private static Random random = new Random();

    private String[] terrains =
            {"Airless Rock", "Arid Badland", "Blasted Waste", "Desert", "Endless Sea",
                    "Forest", "Glassed-over", "Icy Waste", "Island Archipelago",
                    "Jungle", "Landless Sky", "Moorland", "Mountains", "Plains", "River",
                    "Savannah", "Swamp", "Tundra", "Underwater", "Volcanic"};

    private String[] elements =
            {"Caverns", "Clouds", "Earth", "Earthquakes", "Fog", "Geysers", "Hills", "Lakes",
                    "Lightning", "Rain", "Rivers", "Seas", "Seasons", "Shores", "Sky",
                    "Stars", "Storms", "Thunder", "Tides", "Wind"};

    private String[] warpers = {"Births monsters","Comes from strange sources","Found where it shouldn't be",
            "Ignites in unclean flames","Induces a great emotion","Induces madness"
            ,"Is a home for dark things","Is a road to evil places","Is a slow poison",
            "Is a strange color","Is acidic or noxious","Is an ancient ruin remnant",
            "Is sentient","Issues terrible commands","Made of something strange",
            "Murderously dangerous","Punishes those who offend","Scours or wounds",
            "Serves dark powers","Whispers something"};

    private String[] floraList = {"Carnivorous","Colonial or hive-like",
            "Gelatinous or tentacular","Geometric in structure",
            "Grows in alien matter","Jewel-colored","Largely parasitic",
            "Like prehistoric cycads",
            "Made of strange stuff","Mobile","Nauseating in hue","Sentient to a degree",
            "Produces strange drugs","Produces strange music","Resembles animals",
            "Spongy and moss-like","Strangely fragrant","Symbiotic with animals",
            "Vine-like and creeping","Violently invasive"};

    private String[] faunaList = {"Avian or feathered","Made of strange stuff","Cries with human voices","Dead but still moving",
            "Feeds largely on carrion","Ghostly or semi-tangible","Insatiably voracious",
            "Inscribed with glyphs","Insectile or arthropodic","Intelligent as humans",
            "Made of light or fog","Metallic or artificial","Warped and tormented",
            "Parasitic on each other","Piscine or crablike","Plotting against humans",
            "Reptilian or serpentine","Resembles humans","Warped in its shape",
            "Swarm or hive entities"};

    public BasicProperties() {

    }

    public BasicProperties(String[]terrains, String[] elements,
                           String[] warpers, String[]floraList, String[] faunaList) {
        this.terrains=terrains;
        this.elements=elements;
        this.warpers=warpers;
        this.floraList=floraList;
        this.faunaList=faunaList;
    }

    /**
     * Returns the wohole terrain array
     * @return String Array
     */

    public String[] getTerrains() {
        return terrains;
    }

    /**
     * Randomly chooses an element from the terrain array
     * @return String
     */
    public String returnRandomTerrain() {

        return terrains[random.nextInt(terrains.length)];

    }

    public String[] getElements() {
        return elements;
    }

    public String returnRandomElement() {

        return elements[random.nextInt(elements.length)];

    }

    public String[] getWarpers() {
        return warpers;
    }

    public String returnRandomWarper() {

        return warpers[random.nextInt(warpers.length)];

    }

    public String[] getFloraList() {
        return floraList;
    }

    public String returnRandomFlora() {

        return floraList[random.nextInt(floraList.length)];

    }

    public String[] getFaunaList() {
        return faunaList;
    }

    public String returnRandomFauna() {

        return faunaList[random.nextInt(faunaList.length)];

    }
}






