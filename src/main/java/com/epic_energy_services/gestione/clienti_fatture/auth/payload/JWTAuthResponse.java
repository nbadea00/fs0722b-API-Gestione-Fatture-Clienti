package com.epic_energy_services.gestione.clienti_fatture.auth.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class JWTAuthResponse {
	private String username;
    private String accessToken;
    private String tokenType = "Bearer";
}