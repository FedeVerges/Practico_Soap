package com.unsl.practico.soa.ejercicio7.controllers;

import java.util.HashMap;

import com.unsl.practico.soa.ejercicio7.services.ValidadorEmail;
import com.unsl.practico.soa.ejercicio7.services.ValidadorTarjetaCredito;
import com.unsl.practico.soa.ejercicio7.template.velocity.VelocityTemplateEngine;

import spark.ModelAndView;
import spark.Route;

public class RegistroController {
    public static Route registrar = (request, response) -> {
        String error = null;
        String resultado = null;

        String nombre = request.queryParams("nombre");
        String apellido = request.queryParams("apellido");
        String email = request.queryParams("email");
        String tarjetaNro = request.queryParams("tarjeta-nro");
        String tarjetaVencimiento = request.queryParams("tarjeta-vencimiento");

        if (nombre != null && 
            apellido != null && 
            email != null &&
            tarjetaNro != null &&
            tarjetaVencimiento != null) {
            try {
                ValidadorEmail validadorEmail = new ValidadorEmail();
                ValidadorTarjetaCredito validadorTarjeta = new ValidadorTarjetaCredito();
                if (nombre.length() == 0) {
                    throw new Exception("'Nombre' no puede ser vacio");
                }
                if (apellido.length() == 0) {
                    throw new Exception("'Apellido' no puede ser vacio");
                }
                if (!validadorEmail.esValido(email)) {
                    throw new Exception("'Email' no es válido");
                }
                if (!validadorTarjeta.esValida(tarjetaNro, tarjetaVencimiento)) {
                    throw new Exception("'Tarjeta' no es válida");
                }
                resultado = "Se registró el Usuario";
            } catch (Exception e) {
                e.printStackTrace();
                error = e.getMessage();
            }
        }

        HashMap<String, Object> model = new HashMap<>();
        model.put("error", error);
        model.put("resultado", resultado);
        model.put("template", "velocity/view/registrar.vtl");
        return new VelocityTemplateEngine().render(
                new ModelAndView(model, "velocity/main.vtl")
        );
    };
}