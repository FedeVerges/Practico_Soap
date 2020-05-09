package com.unsl.practico.soa.ejercicio7.services;

import java.util.Objects;

import com.unsl.practico.soa.ejercicio7.generated.email.EmailVerNoTestEmail;
import com.unsl.practico.soa.ejercicio7.generated.email.EmailVerNoTestEmailSoap;

public class ValidadorEmail {
    private final EmailVerNoTestEmailSoap service = new EmailVerNoTestEmail().getEmailVerNoTestEmailSoap();

    public boolean esValido(String email) {
        if (Objects.isNull(email)) {
            return false;
        }

        int responseCode = service
                .verifyEmail(email, "")
                .getResponseCode();

        return responseCode == 2 || responseCode == 3;
    }
}