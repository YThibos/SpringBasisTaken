package be.vdab.repositories;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import be.vdab.entities.Persoon;

class CSVPersoonRepository implements PersoonRepository {
	
	private final File file;
	
	CSVPersoonRepository(File file) {
		this.file = file;
	}

	@Override
	public List<Persoon> findAll() throws IOException {
		
		List<Persoon> personen = new ArrayList<>();
		
		try (Scanner scanner = new Scanner(file)){
			
			while (scanner.hasNext()) {
				String[] strings = scanner.nextLine().split(",");
				personen.add(new Persoon(Integer.parseInt(strings[0]),
				strings[1], strings[2], Integer.parseInt(strings[3])));
				}
			
		}
		
		return personen;
		
	}

}
