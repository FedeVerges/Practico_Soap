package com.unsl.practico.soa.ejercicio8.controllers;


import com.unsl.practico.soa.ejercicio8.generated.camara.CamaraVigilancia;
import com.unsl.practico.soa.ejercicio8.generated.camara.CamaraVigilanciaService;
import com.unsl.practico.soa.ejercicio8.generated.camara.Streaming;
import com.unsl.practico.soa.ejercicio8.template.velocity.VelocityTemplateEngine;
import spark.ModelAndView;
import spark.Route;

import java.util.ArrayList;
import java.util.HashMap;

public class ClientController {
    public static Route camaras = (req, response) -> {
        String error = null;
        ArrayList<String> camaras = new ArrayList<>();

        // Instranciar camaras.
        CamaraVigilancia servicio = new CamaraVigilanciaService().getCamaraVigilanciaPort();
        camaras.add(servicio.obtenerStreaming().getImageURL());
        camaras.add(servicio.obtenerStreaming().getImageURL());
        camaras.add(servicio.obtenerStreaming().getImageURL());
        camaras.add(servicio.obtenerStreaming().getImageURL());

        error= "";
        HashMap<String, Object> model = new HashMap<>();
        model.put("template", "velocity/view/home.vtl");
        model.put("error", error);
        model.put("camaras", camaras);
        return new VelocityTemplateEngine().render(
                new ModelAndView(model, "velocity/main.vtl")
        );
    };

}
