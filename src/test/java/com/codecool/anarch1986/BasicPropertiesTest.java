package com.codecool.anarch1986;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


class BasicPropertiesTest {
    String[]terrains={"testTerrain"};
    String[] elements={"testElement"};
    String[] warpers={"testWarper"};
    String[]floraList={"testFlora"};
    String[] faunaList={"testFauna"};



    @Test
    void testGetTerrains() {
        BasicProperties testBasicProperties =new BasicProperties(terrains,elements,
                warpers,floraList,faunaList);
        assertArrayEquals(new String[]{"testTerrain"},testBasicProperties.getTerrains());

    }

    @Test
    void testReturnRandomTerrain() {
        BasicProperties testBasicProperties =new BasicProperties(terrains,elements,
                warpers,floraList,faunaList);
        assertEquals("testTerrain",testBasicProperties.returnRandomTerrain());
    }

    @Test
    void testGetElements() {
        BasicProperties testBasicProperties =new BasicProperties(terrains,elements,
                warpers,floraList,faunaList);
        assertArrayEquals(new String[]{"testElement"},testBasicProperties.getElements());
    }

    @Test
    void testReturnRandomElement() {
        BasicProperties testBasicProperties =new BasicProperties(terrains,elements,
                warpers,floraList,faunaList);
        assertEquals("testElement",testBasicProperties.returnRandomElement());
    }

    @Test
    void testGetWarpers() {
        BasicProperties testBasicProperties =new BasicProperties(terrains,elements,
                warpers,floraList,faunaList);
        assertArrayEquals(new String[]{"testWarper"},testBasicProperties.getWarpers());
    }

    @Test
    void testReturnRandomWarper() {
        BasicProperties testBasicProperties =new BasicProperties(terrains,elements,
                warpers,floraList,faunaList);
        assertEquals("testWarper",testBasicProperties.returnRandomWarper());
    }

    @Test
    void testGetFloraList() {
        BasicProperties testBasicProperties =new BasicProperties(terrains,elements,
                warpers,floraList,faunaList);
        assertArrayEquals(new String[]{"testFlora"},testBasicProperties.getFloraList());
    }

    @Test
    void testReturnRandomFlora() {
        BasicProperties testBasicProperties =new BasicProperties(terrains,elements,
                warpers,floraList,faunaList);
        assertEquals("testFlora",testBasicProperties.returnRandomFlora());
    }


    @Test
    void testGetFaunaList() {
        BasicProperties testBasicProperties =new BasicProperties(terrains,elements,
                warpers,floraList,faunaList);
        assertArrayEquals(new String[]{"testFauna"},testBasicProperties.getFaunaList());
    }

    @Test
    void returnRandomFauna() {
        BasicProperties testBasicProperties =new BasicProperties(terrains,elements,
                warpers,floraList,faunaList);
        assertEquals("testFauna",testBasicProperties.returnRandomFauna());
    }

}