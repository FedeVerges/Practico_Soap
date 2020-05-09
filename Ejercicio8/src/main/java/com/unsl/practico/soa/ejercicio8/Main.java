package com.unsl.practico.soa.ejercicio8;

import static spark.Spark.get;

import com.unsl.practico.soa.ejercicio8.controllers.DefaultController;

public class Main {
    public static void main(String[] args) {
        get("/", DefaultController.index);
    }
}