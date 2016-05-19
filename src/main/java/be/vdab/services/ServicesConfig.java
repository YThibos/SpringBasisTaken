package be.vdab.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import be.vdab.repositories.PersoonRepository;

@Configuration
public class ServicesConfig {
	
	@Autowired
	@Qualifier("Multiline")
	private PersoonRepository persoonRepository;
	
	@Bean
	PersoonService persoonService() {
		return new PersoonServiceImpl(persoonRepository);
	}

}
