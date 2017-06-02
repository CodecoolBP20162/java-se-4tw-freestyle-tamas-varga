package com.codecool.anarch1986;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import spark.ModelAndView;
import spark.Spark;
import spark.template.thymeleaf.ThymeleafTemplateEngine;

import javax.servlet.http.HttpServletResponse;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.post;

/**
 * The main runner of the application. The basis of it is the Spark framework.
 */

public class RegionGenerator {
    static boolean downloadMode =true;
    static Map params = new HashMap<>();
    static Region region = new Region();
    static BasicProperties basicProperties = new BasicProperties();
    private static final Logger logger = LoggerFactory.getLogger(RegionGenerator.class);

    public static void main(String[] args) {
        Spark.staticFileLocation("/public");
        get("/", (req, res) ->
        {
            params.put("terrains", basicProperties.getTerrains());
            if (region.basicTraits.terrain != null) {
                params.put("terrain", region.basicTraits.terrain);
                logger.debug("DEBUG: '" + region.basicTraits.terrain + "', the region's basic " +
                        "trait terrain has been putted into the params.");
            }
            params.put("elements", basicProperties.getElements());
            if (region.basicTraits.element != null) {
                params.put("element", region.basicTraits.element);
                logger.debug("DEBUG: '" + region.basicTraits.element + "', the region's basic " +
                        "trait element has been putted into the params.");
            }
            params.put("warpers", basicProperties.getWarpers());
            if (region.basicTraits.warper != null) {
                params.put("warper", region.basicTraits.warper);
                logger.debug("DEBUG: '" + region.basicTraits.warper + "', the region's basic " +
                        "trait element warper has been putted into the params.");
            }
            params.put("floraList", basicProperties.getFloraList());
            if (region.basicTraits.flora != null) {
                params.put("flora", region.basicTraits.flora);
                logger.debug("DEBUG: '" + region.basicTraits.flora + "', the region's basic " +
                        "trait flora has been putted into the params.");
            }
            params.put("faunaList", basicProperties.getFaunaList());
            if (region.basicTraits.fauna != null) {
                params.put("fauna", region.basicTraits.fauna);
                logger.debug("DEBUG: '" + region.basicTraits.fauna + "', the region's basic " +
                        "trait fauna has been putted into the params.");
            }
            return new ThymeleafTemplateEngine().
                    render(new ModelAndView(params, "index"));

        });

        get("/random_all", (req, res) ->
        {
            region.basicTraits.terrain = basicProperties.returnRandomTerrain();
            logger.debug("DEBUG: The region's basic trait terrain has " +
                    "been set with Random All method: '" + region.basicTraits.terrain + "'.");
            region.basicTraits.element = basicProperties.returnRandomElement();
            logger.debug("DEBUG: The region's basic trait element has " +
                    "been set with Random All method: '" + region.basicTraits.element + "'.");
            region.basicTraits.warper = basicProperties.returnRandomWarper();
            logger.debug("DEBUG: The region's basic trait element warper has " +
                    "been set with Random All method: '" + region.basicTraits.warper + "'.");
            region.basicTraits.flora = basicProperties.returnRandomFlora();
            logger.debug("DEBUG: The region's basic trait terrain has " +
                    "been set with Random All method: '" + region.basicTraits.flora + "'.");
            region.basicTraits.fauna = basicProperties.returnRandomFauna();
            logger.debug("DEBUG: The region's basic trait terrain has " +
                    "been set with Random All method: '" + region.basicTraits.fauna + "'.");

            res.redirect("/");
            return new ThymeleafTemplateEngine().
                    render(new ModelAndView(params, "index"));
        });

        get("/random_terrain", (req, res) ->
        {
            region.basicTraits.terrain = basicProperties.returnRandomTerrain();
            logger.debug("DEBUG: The region's basic trait terrain has " +
                    "been set with Random Terrain method: '"
                    + region.basicTraits.terrain + "'.");
            res.redirect("/");
            return new ThymeleafTemplateEngine().
                    render(new ModelAndView(params, "index"));
        });

        get("/terrain/:terr", (req, res) ->
        {
            String choosenTerrain = req.params(":terr");
            region.basicTraits.terrain = choosenTerrain;
            logger.debug("DEBUG: The region's basic trait terrain has " +
                    "been set with User Choice method: '"
                    + region.basicTraits.terrain + "'.");
            res.redirect("/");
            return new ThymeleafTemplateEngine().
                    render(new ModelAndView(params, "index"));
        });


        get("/random_element", (req, res) ->
        {
            region.basicTraits.element = basicProperties.returnRandomElement();
            logger.debug("DEBUG: The region's basic trait element has " +
                    "been set with Random Element method: '"
                    + region.basicTraits.element + "'.");
            res.redirect("/");
            return new ThymeleafTemplateEngine().
                    render(new ModelAndView(params, "index"));
        });

        get("/element/:elem", (req, res) ->
        {
            String choosenElement = req.params(":elem");
            region.basicTraits.element = choosenElement;
            logger.debug("DEBUG: The region's basic trait element has " +
                    "been set with User Choice method: '"
                    + region.basicTraits.element + "'.");
            res.redirect("/");
            return new ThymeleafTemplateEngine().
                    render(new ModelAndView(params, "index"));
        });

        get("/random_way", (req, res) ->
        {
            region.basicTraits.warper = basicProperties.returnRandomWarper();
            logger.debug("DEBUG: The region's basic trait element warper has " +
                    "been set with Random Warper method: '"
                    + region.basicTraits.warper + "'.");
            res.redirect("/");
            return new ThymeleafTemplateEngine().
                    render(new ModelAndView(params, "index"));
        });

        get("/way/:warp", (req, res) ->
        {
            String choosenWay = req.params(":warp");
            region.basicTraits.warper = choosenWay;
            logger.debug("DEBUG: The region's basic trait element warper has " +
                    "been set with User Choice method: '"
                    + region.basicTraits.warper + "'.");
            res.redirect("/");
            return new ThymeleafTemplateEngine().
                    render(new ModelAndView(params, "index"));
        });

        get("/random_flora", (req, res) ->
        {
            region.basicTraits.flora = basicProperties.returnRandomFlora();
            logger.debug("DEBUG: The region's basic trait flora has " +
                    "been set with Random Flora method: '"
                    + region.basicTraits.flora + "'.");
            res.redirect("/");
            return new ThymeleafTemplateEngine().
                    render(new ModelAndView(params, "index"));
        });

        get("/flora/:flor", (req, res) ->
        {
            String choosenFlora = req.params(":flor");
            region.basicTraits.flora = choosenFlora;
            logger.debug("DEBUG: The region's basic trait element has " +
                    "been set with User Choice method: '"
                    + region.basicTraits.flora + "'.");
            res.redirect("/");
            return new ThymeleafTemplateEngine().
                    render(new ModelAndView(params, "index"));
        });

        get("/random_fauna", (req, res) ->
        {
            region.basicTraits.fauna = basicProperties.returnRandomFauna();
            logger.debug("DEBUG: The region's basic trait flora has " +
                    "been set with Random Fauna method: '"
                    + region.basicTraits.fauna + "'.");
            res.redirect("/");
            return new ThymeleafTemplateEngine().
                    render(new ModelAndView(params, "index"));
        });

        get("/fauna/:faun", (req, res) ->
        {
            String choosenFauna = req.params(":faun");
            region.basicTraits.fauna = choosenFauna;
            logger.debug("DEBUG: The region's basic trait flora has " +
                    "been set with User Choice method: '"
                    + region.basicTraits.fauna + "'.");
            res.redirect("/");
            return new ThymeleafTemplateEngine().
                    render(new ModelAndView(params, "index"));
        });

        post("/save", (req, res) -> {
            if (region.basicTraits.terrain != null &&
                    region.basicTraits.element != null &&
                    region.basicTraits.warper != null &&
                    region.basicTraits.flora != null &&
                    region.basicTraits.fauna != null) {
                region.id = "region_" + new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").
                        format(new Date());
                Region.regionsDeque.addFirst(region);
                logger.debug("DEBUG: region: '" + region.id + "' has been added to regionsDeque");
                logger.debug("DEBUG: The regionsDeque contains " + Region.regionsDeque.size() +
                        " elements.");
                RegionWriter.writeOutRegion(region);
                logger.debug("DEBUG: region: '" + region.id + "' has been saved to" +
                        "./src/main/resources/regions/");

                if (downloadMode) {
                byte[] bytes = Files.readAllBytes(Paths.get("./src/main/resources/regions/"
                        + region.id + ".txt"));
                    HttpServletResponse raw = res.raw();
                    raw.setContentType("application/text/force-download");
                    raw.setHeader("Content-Disposition","attachment; filename="+region.id+".txt");
                    raw.getOutputStream().write(bytes);
                    raw.getOutputStream().flush();
                    raw.getOutputStream().close();
                    logger.debug("DEBUG: file offered for download.");
                }
                params.clear();
                region.basicTraits = new BasicTraits();
                logger.debug("DEBUG: params and region's basic traits cleared.");
            } else {
                logger.warn("WARNING: Some region traits are not set! Region is NOT saved!");
            }
            res.redirect("/");
            return res.raw();
        });

    }

}
