package com.unsl.practico.soa.ejercicio7;

import static spark.Spark.get;

import com.unsl.practico.soa.ejercicio7.controllers.DefaultController;
import com.unsl.practico.soa.ejercicio7.controllers.RegistroController;

public class Main {
    public static void main(String[] args) {
        get("/", DefaultController.index);
        get("/registrar", RegistroController.registrar);
    }
}