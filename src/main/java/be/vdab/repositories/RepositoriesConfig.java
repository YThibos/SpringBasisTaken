package be.vdab.repositories;

import java.io.File;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:persoonrepo.properties")
public class RepositoriesConfig {
	
	@Value("${csvFile}")
	private File csvFile;
	
	@Value("${multilineFile}")
	private File multilineFile;
	
	@Bean
	@Qualifier("CSV")
	PersoonRepository csvPersoonRepository() {
		return new CSVPersoonRepository(csvFile);
	}
	
	@Bean
	@Qualifier("Multiline")
	PersoonRepository multilinePersoonRepository() {
		return new MultilinePersoonRepository(multilineFile);
	}

}
