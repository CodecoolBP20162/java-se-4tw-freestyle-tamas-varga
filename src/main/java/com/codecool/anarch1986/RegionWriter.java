package com.codecool.anarch1986;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by tomi on 2017.05.31..
 */
public class RegionWriter {
    static BufferedWriter bw;
    static FileWriter fw;

    public static void writeOutRegion(Region region) {

            try {
                String content = "The terrain is " + region.basicTraits.terrain + ".\n" +
                        region.basicTraits.element + " " + region.basicTraits.warper + ".\n" +
                        "The flora is " + region.basicTraits.flora + ".\n" +
                        "The fauna is " + region.basicTraits.fauna + ".\n";


                fw = new FileWriter("./src/main/resources/regions/"
                        + region.id + ".txt");
                bw = new BufferedWriter(fw);
                bw.write(content);

            } catch (IOException e) {
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


