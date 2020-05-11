package com.unsl.practico.soa.ejercicio8;

import static spark.Spark.get;

import com.unsl.practico.soa.ejercicio8.controllers.ClientController;

public class Main {
    public static void main(String[] args) {
        get("/", ClientController.camaras);
    }
}