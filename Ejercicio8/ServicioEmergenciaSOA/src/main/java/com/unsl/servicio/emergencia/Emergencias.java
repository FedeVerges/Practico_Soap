package com.unsl.servicio.emergencia;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@WebService(name = "Emergencias", serviceName = "EmergenciasService")
public class Emergencias {
    private final DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

    @WebMethod
    public void notificarEmergencia(
            @WebParam(name = "detalles")
            @XmlElement(required = true) String detalles
    ) {
        System.out.println("Se recibió una emergencia:");
        System.out.println("\tFecha: " + LocalDateTime.now().format(formatter));
        System.out.println("\tDetalles: " + detalles);
    }
}
