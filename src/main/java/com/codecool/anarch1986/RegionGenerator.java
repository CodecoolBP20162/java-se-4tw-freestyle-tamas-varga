package com.codecool.anarch1986;

import spark.ModelAndView;
import spark.Spark;
import spark.template.thymeleaf.ThymeleafTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;

/**
 * Created by tomi on 2017.05.30..
 */
public class RegionGenerator {
    static Map params = new HashMap<>();
    static BasicTraits basicTraits = new BasicTraits();

    public static void main(String[] args) {
        Spark.staticFileLocation("/public");
        get("/", (req, res) ->
        {
            params.put("terrains", BasicProperites.getTerrains());
            if (basicTraits.terrain !=null) {
                params.put("terrain", basicTraits.terrain);
            }
            params.put("elements", BasicProperites.getElements());
            if (basicTraits.element !=null) {
                params.put("element", basicTraits.element);
            }
            params.put("wrappers", BasicProperites.getWrappers());
            if (basicTraits.wrapper !=null) {
                params.put("wrapper", basicTraits.wrapper);
            }
            params.put("floraList", BasicProperites.getFloraList());
            if (basicTraits.flora !=null) {
                params.put("flora", basicTraits.flora);
            }
            params.put("faunaList", BasicProperites.getFaunaList());
            if (basicTraits.fauna !=null) {
                params.put("fauna", basicTraits.fauna);
            }
            return new ThymeleafTemplateEngine().
                    render(new ModelAndView(params, "index"));
        });

        get("/random_all", (req, res) ->
        {
            basicTraits.terrain = BasicProperites.returnRandomTerrain();
            basicTraits.element = BasicProperites.returnRandomElement();
            basicTraits.wrapper = BasicProperites.returnRandomWrapper();
            basicTraits.flora = BasicProperites.returnRandomFlora();
            basicTraits.fauna = BasicProperites.returnRandomFauna();

            res.redirect("/");
            return new ThymeleafTemplateEngine().
                    render(new ModelAndView(params, "index"));
        });

        get("/random_terrain", (req, res) ->
        {
            basicTraits.terrain = BasicProperites.returnRandomTerrain();
            res.redirect("/");
            return new ThymeleafTemplateEngine().
                    render(new ModelAndView(params, "index"));
        });

        get("/terrain/:terr", (req, res) ->
        {
            String choosenTerrain = req.params(":terr");
            basicTraits.terrain = choosenTerrain;
            res.redirect("/");
            return new ThymeleafTemplateEngine().
                    render(new ModelAndView(params, "index"));
        });


        get("/random_element", (req, res) ->
        {
            basicTraits.element = BasicProperites.returnRandomElement();
            res.redirect("/");
            return new ThymeleafTemplateEngine().
                    render(new ModelAndView(params, "index"));
        });

        get("/element/:elem", (req, res) ->
        {
            String choosenElement = req.params(":elem");
            basicTraits.element = choosenElement;
            res.redirect("/");
            return new ThymeleafTemplateEngine().
                    render(new ModelAndView(params, "index"));
        });

        get("/random_way", (req, res) ->
        {
            basicTraits.wrapper = BasicProperites.returnRandomWrapper();
            res.redirect("/");
            return new ThymeleafTemplateEngine().
                    render(new ModelAndView(params, "index"));
        });

        get("/way/:wrap", (req, res) ->
        {
            String choosenWay = req.params(":wrap");
            basicTraits.wrapper = choosenWay;
            res.redirect("/");
            return new ThymeleafTemplateEngine().
                    render(new ModelAndView(params, "index"));
        });

        get("/random_flora", (req, res) ->
        {
            basicTraits.flora = BasicProperites.returnRandomFlora();
            res.redirect("/");
            return new ThymeleafTemplateEngine().
                    render(new ModelAndView(params, "index"));
        });

        get("/flora/:flor", (req, res) ->
        {
            String choosenFlora = req.params(":flor");
            basicTraits.flora = choosenFlora;
            res.redirect("/");
            return new ThymeleafTemplateEngine().
                    render(new ModelAndView(params, "index"));
        });

        get("/random_fauna", (req, res) ->
        {
            basicTraits.fauna = BasicProperites.returnRandomFauna();
            res.redirect("/");
            return new ThymeleafTemplateEngine().
                    render(new ModelAndView(params, "index"));
        });

        get("/fauna/:faun", (req, res) ->
        {
            String choosenFauna = req.params(":faun");
            basicTraits.fauna = choosenFauna;
            res.redirect("/");
            return new ThymeleafTemplateEngine().
                    render(new ModelAndView(params, "index"));
        });

        get("/save", (req, res) -> {
            RegionWriter.writeOutRegion(basicTraits);
            res.redirect("/");
            return new ThymeleafTemplateEngine().
                    render(new ModelAndView(params, "index"));
        });

    }

}
