package com.codecool.anarch1986;


import java.util.ArrayDeque;

/**
 * This is the most highest level class of the different trait classes.
 * It collects all the subtraits.
 * Also it has a static ArrayDeque for collecting all the regions
 * that are created during the application's run.
 */

public class Region {
    public static ArrayDeque<Region> regionsDeque = new ArrayDeque<>();
    String id;
    BasicTraits basicTraits= new BasicTraits();

    public static ArrayDeque<Region> getRegionsDeque() {
        return regionsDeque;
    }
}




