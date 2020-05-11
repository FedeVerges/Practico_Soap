package com.unsl.camara.vigilancia;

import com.unsl.camara.vigilancia.models.Streaming;
import com.unsl.camara.vigilancia.services.EmergenciasDAO;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService(name = "CamaraVigilancia", serviceName = "CamaraVigilanciaService")
public class CamaraVigilancia {
    private final EmergenciasDAO emergenciasDAO;
    private final List<String> cameraImages;

    public CamaraVigilancia() {
        emergenciasDAO = new EmergenciasDAO();

        cameraImages = new ArrayList<String>() {{
            add("https://i.ytimg.com/vi/kVe3e4WkEUM/maxresdefault.jpg");
            add("https://ak.picdn.net/shutterstock/videos/20189968/thumb/1.jpg");
            add("https://i.ytimg.com/vi/E2fvBv09ggs/maxresdefault.jpg");
            add("https://i.ytimg.com/vi/ZhgNqRMvDG8/maxresdefault.jpg");
        }};
    }

    @WebMethod
    public Streaming obtenerStreaming() {
        int index = (int) Math.floor(Math.random() * cameraImages.size());
        if (index == 3) {
            String detalle = "Se detectó a Juan Perez en actividad ilícita";
            emergenciasDAO.notificarEmergencia(detalle);
        }
        String imageURL = cameraImages.get(index);
        return new Streaming(imageURL);
    }
}
