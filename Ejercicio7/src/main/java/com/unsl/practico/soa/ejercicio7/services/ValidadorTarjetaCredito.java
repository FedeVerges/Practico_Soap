package com.unsl.practico.soa.ejercicio7.services;

import java.util.Objects;

import com.unsl.practico.soa.ejercicio7.generated.tarjetas.CreditCardValidator;
import com.unsl.practico.soa.ejercicio7.generated.tarjetas.CreditCardValidatorSoap;


public class ValidadorTarjetaCredito {
    private final CreditCardValidatorSoap service = new CreditCardValidator().getCreditCardValidatorSoap();

    public boolean esValida(String tarjeta, String vencimiento) {
        if (Objects.isNull(tarjeta)) {
            return false;
        }
        
        // 0 -> Ok
        // 1001 -> No hay tarjeta
        // 1002 -> No hay fecha de vencimiento
        // 1003 -> Tarjeta inválida
        // 1004 -> Tamaño de tarjeta inválido
        // 1005 -> Error de validación módulo 10
        // 1006 -> Fecha de vencimiento inválida
        int responseNumber = service.validCard(tarjeta, vencimiento);
        return responseNumber == 0;
    }
}