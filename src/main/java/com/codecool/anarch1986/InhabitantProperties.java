package com.codecool.anarch1986;

import java.util.Random;

/**
 * Created by tomi on 2017.06.01..
 */
public class InhabitantProperties {

    private static Random random = new Random();

    String[] basicInspirations = {"Ancient Rome or Greece",
            "Historical China or Southeast Asia",
            "Historical India or subcontinental",
            "Historical Japan– Heian, Meiji, Sengoku, etc.",
            "Middle East– Islamic, Pre-Islamic, Golden Age, etc.",
            "Medieval Africa– Dahomey, Ethiopia, Mali, etc.",
            "Medieval continental Europe or Scandinavia", "Pre-Colonial Polynesia",
            "Pre-Columbian New World– Aztecs, Incas, Mayans, etc.",
            "Pre-modern tribal of a region of choice"};

    String[][] rigidityList = {{"Frozen.", "The society can never change, but only be destroyed."},
            {"Variations.", "The culture can change in its details, but will " +
                    "always be fundamentally the same society."},
            {"Changeable.", "They can change as easily or as painfully as " +
                    "any normal Earth culture."},
            {"Flux. The culture will inevitably alter in drastic ways."}};

    String[][] populationList = {{"One household.", "Or even one person"},
            {"One clan.", "A few hundred at the most."},
            {"One town.", "A few thousand, sufficient to make a viable population."},
            {"Many towns.", "A few tens of thousands, whether spread out " +
                    "in numerous towns or clustered in a single city."},
            {"Many cities.", "A few hundreds of thousands, sufficient for a " +
                    "small nation or a great feudal domain."},
            {"A nation.", "A million or more members of the society."}};

    String[][] technologyList = {{"Stone Age.", "The locals are unable even to work metals."},
            {"Bronze Age.", "They have metalworking and muscle-powered devices and tools."},
            {"Renaissance.", "Complex muscle, wind, and water-powered " +
                    "devices are possible, perhaps with crude firearms."},
            {"Victorian.", "Steam power, firearms, and industrial plants are possible for them."},
            {"Modern.", "They have equivalents of computers, synthetics, internal combustion, " +
                    "and other modern trappings."},
            {"Futuristic.", "Their technology encompasses many of the things we would consider " +
                    "plausible for hard sci-fi."},
            {"Alien.", "They have devices that work on logical but unknown principles and perform" +
                    " soft sci-fi miracles."},
            {"Enigmatic.", "Their tech is indistinguishable from outright magic, and it may actually be as much."}};

    String[][] magicalList = {{"None.", "This culture has absolutely no magical tradition, " +
            "and may be incapable of using it."},
            {"Lost.", "The culture may have once had magical arts, but they have since been lost or " +
                    "rendered unusable.It may be they never had any, but a predecessor culture did."},
            {"Hidden.", "Sorcery is deplored and despised, and those who " +
                    "shepherd knowledge of it must hide that fact."},
            {"Reserved.", "These people have a magical tradition, but it is restricted to a specific group–" +
                    " rulers, priests, specially ordained wizards, or some other subgroup."},
            {"Limited.", "While there is no cultural bar on the practice of magic, " +
                    "only a limited number of the inhabitants have the " +
                    "talent or interest necessary to pursue the art."},
            {"Widespread.", "Widespread. Most of the culture are either practitioners or " +
                    "participants in magical rituals. Elements of their society are " +
                    "likely strongly colored by their arcane arts."}};

    String[][] factionList = {{"One.", "The culture is unified around one authority."},
            {"Two.", "Either near-equal or one strong and the other weak"},
            {"2-5 groups.", "Each with a largely fixed membership. " +
                    "consisting of traditional allies and mutual interests."},
            {"2-5 major alliances.", "Each composed of a shifting constellation of groups, castes, or occupations."},
            {"Clan against clan", "Real trust only exists within the scope of extended families, castes, or communities."},
            {"All against all", "Any formal organization is just a thin skin over a seething mass of treachery."}};

    String[][] societies = {{"Anarchy.", "The culture recognizes no authority beyond " +
            "brute force and immediate convenience. " +
            "Optionally, they are so cooperative and peaceful as to require no authority."},
            {"Caste leaders.", "Members obey the leader of their occupational or birth caste."},
            {"Clan elders.", "The heads of extended families work together to arrange affairs."},
            {"Democracy.", "Whether direct or in the form of a republic, " +
                    "the culture rules by general consensus."},
            {"Feudal lordship.", "A great lord rules through lesser ones."},
            {"Hive mind.", "They obey the will of the collective."},
            {"Magocracy.", "Sorcerers may rule them, or some other special caste of gifted entities."},
            {"Monarchy.", "A strong autarch directly rules the domain."},
            {"Oligarchy.", "A group of powerful nobles, merchants, or other figures of importance make decisions."},
            {"Subjection.", "The culture is subjected by a stronger power, " +
                    "whether neighbors, dark gods, or uncaring aliens."},
            {"Theocracy.", "Priests of the elder gods or adepts of some mystical dream-faith are obeyed."}};

}
