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

			while (scanner.hasNext()) {

				int persoonNr = scanner.nextInt();
				scanner.nextLine();
				String voornaam = scanner.nextLine();
				String familienaam = scanner.nextLine();
				int aantalKinderen = scanner.nextInt();
				if (scanner.hasNext()) {
					scanner.nextLine();
				}
				personen.add(new Persoon(persoonNr, voornaam, familienaam, aantalKinderen));
			}

		} catch (Exception ex) {
			System.out.println("Kapot:" + ex);
			return new ArrayList<>();
		}

		return personen;

	}

}
