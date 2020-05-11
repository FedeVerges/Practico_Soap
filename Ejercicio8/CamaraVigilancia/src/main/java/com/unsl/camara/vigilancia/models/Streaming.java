package com.unsl.camara.vigilancia.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Streaming implements Serializable {
    private String imageURL;

    public Streaming() {
    }

    public Streaming(String imageURL) {
        this.imageURL = imageURL;
    }
}
