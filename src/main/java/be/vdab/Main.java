package be.vdab;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import be.vdab.entities.Persoon;
import be.vdab.presentation.PersoonViewer;
import be.vdab.presentation.PresentationConfig;
import be.vdab.repositories.RepositoriesConfig;
import be.vdab.services.ServicesConfig;

public class Main {
	
	public static void main(String[] args) {
	
		Persoon p1 = new Persoon(1, "Jan", "Jansens", 1);
		Persoon p2 = new Persoon(2, "Piet", "Pieters", 10);
		Persoon p3 = new Persoon(3, "Willem", "Willemsen", 5);
		Persoon p4 = new Persoon(4, "Jos", "Ghysen", 3);
		
		List<Persoon> personen = new ArrayList<>();
		
		personen.add(p1);
		personen.add(p2);
		personen.add(p3);
		personen.add(p4);
		
		try (AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(ServicesConfig.class, RepositoriesConfig.class, PresentationConfig.class)) {
			
			PersoonViewer viewer = context.getBean("persoonViewer", PersoonViewer.class);
			viewer.afbeelden();
			
		}
		catch (Exception ex) {
			System.out.println(ex);
		}
		
	}

}
