package com.unsl.servicio.emergencia;

import javax.xml.ws.Endpoint;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        String url = "http://localhost:911/servicioEmergencia";
        Logger.getAnonymousLogger().info("Servicio corriendo en '" + url + "'");
        Endpoint.publish(url, new Emergencias());
    }
}
