package com.unsl.camara.vigilancia.services;

import com.unsl.camara.vigilancia.generated.Emergencias;
import com.unsl.camara.vigilancia.generated.EmergenciasService;

public class EmergenciasDAO {
    private final Emergencias service = new EmergenciasService().getEmergenciasPort();

    public void notificarEmergencia(String detalles) {
        service.notificarEmergencia(detalles);
    }
}
