package com.unsl.practico.soa.ejercicio8.controllers;

import java.util.HashMap;

import com.unsl.practico.soa.ejercicio8.template.velocity.VelocityTemplateEngine;

import spark.ModelAndView;
import spark.Route;

public class DefaultController {
    public static Route index = (req, response) -> {
        HashMap<String, Object> model = new HashMap<>();
        model.put("template", "velocity/view/home.vtl");
        return new VelocityTemplateEngine().render(
                new ModelAndView(model, "velocity/main.vtl")
        );
    };
}