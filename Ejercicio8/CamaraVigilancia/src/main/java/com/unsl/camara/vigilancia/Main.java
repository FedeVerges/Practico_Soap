package com.unsl.camara.vigilancia;

import javax.xml.ws.Endpoint;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        String url = "http://localhost:1234/camaraVigilancia";
        Logger.getAnonymousLogger().info("Servicio corriendo en '" + url + "'");
        Endpoint.publish(url, new CamaraVigilancia());
    }
}
