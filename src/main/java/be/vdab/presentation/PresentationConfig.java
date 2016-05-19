package be.vdab.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import be.vdab.enums.PersoonEigenschap;
import be.vdab.services.PersoonService;

@Configuration
public class PresentationConfig {
	
	@Autowired
	private PersoonService persoonService;
	
	@Bean
	PersoonViewer persoonViewer() {
		return new PersoonViewer(new PersoonEigenschap[] 
				{PersoonEigenschap.VOORNAAM, PersoonEigenschap.FAMILIENAAM, PersoonEigenschap.AANTAL_KINDEREN}, persoonService);
	}

}
