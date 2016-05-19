package be.vdab.repositories;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import be.vdab.entities.Persoon;

public class CSVPersoonRepository implements PersoonRepository {
	
	private final File file;
	
	public CSVPersoonRepository(File file) {
		this.file = file;
	}

	@Override
	public List<Persoon> findAll() throws IOException {
		
		List<Persoon> personen = new ArrayList<>();
		
		try (Scanner scanner = new Scanner(file)){
			
			scanner.useDelimiter(",");
			
			while (scanner.hasNext()) {
				personen.add(new Persoon(scanner.nextInt(), scanner.next(), scanner.next(), scanner.nextInt()));
			}
			
		} catch (FileNotFoundException ex) {
			System.out.println(ex);
			return new ArrayList<>();
		}
		
		return personen;
		
	}

}
