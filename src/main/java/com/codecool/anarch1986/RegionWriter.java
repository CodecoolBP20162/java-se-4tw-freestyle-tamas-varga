package com.codecool.anarch1986;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by tomi on 2017.05.31..
 */
public class RegionWriter {

    public static void writeOutRegion(BasicTraits region) {
        BufferedWriter bw = null;
        FileWriter fw = null;

        try {
            String content = "The terrain is " + region.terrain + ".\n" +
                    region.element + " " + region.wrapper + ".\n" +
                    "The flora is " + region.flora + ".\n" +
                    "The fauna is " + region.fauna + ".\n";


            fw = new FileWriter("./src/main/resources/regions/" +
                    new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date()) +
                    "-region.txt");
            bw = new BufferedWriter(fw);
            bw.write(content);
            System.out.println("success");

        } catch (IOException e) {
            System.out.println("not working");
            e.printStackTrace();

        } finally {
            try {

                if (bw != null)
                    bw.close();

                if (fw != null)
                    fw.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }

    }

}
