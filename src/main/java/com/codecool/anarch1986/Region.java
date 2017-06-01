package com.codecool.anarch1986;


import java.util.ArrayDeque;

public class Region {
    public static ArrayDeque<Region> regionsDeque = new ArrayDeque<>();
    String id;
    BasicTraits basicTraits= new BasicTraits();

    public static ArrayDeque<Region> getRegionsDeque() {
        return regionsDeque;
    }
}




