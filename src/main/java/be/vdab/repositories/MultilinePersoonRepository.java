package be.vdab.repositories;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import be.vdab.entities.Persoon;

public class MultilinePersoonRepository implements PersoonRepository {

	private final File file;

	public MultilinePersoonRepository(File file) {
		this.file = file;
	}

	@Override
	public List<Persoon> findAll() throws IOException {

		List<Persoon> personen = new ArrayList<>();

		try (Scanner scanner = new Scanner(file)) {

			while (scanner.hasNextLine()) {
				personen.add(new Persoon(Integer.parseInt(scanner.nextLine()),	// id
						scanner.nextLine(),										// voornaam
						scanner.nextLine(),										// familienaam
						Integer.parseInt(scanner.next())));						// #kinderen
			}

		}
		catch (Exception ex) {
			System.out.println("Kapot:" + ex);
			return new ArrayList<>();
		}

		return personen;

	}

}
