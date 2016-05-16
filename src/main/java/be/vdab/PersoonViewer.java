package be.vdab;

import java.util.List;

import be.vdab.entities.Persoon;

public class PersoonViewer {

	// private boolean aantalKinderenTonen;

	private final PersoonEigenschap[] eigenschappen;

	public PersoonViewer(PersoonEigenschap[] eigenschappen) {
		this.eigenschappen = eigenschappen;
	}

	public void afbeelden(List<Persoon> personen) {

		// personen.stream().forEach((Persoon p) -> {
		// System.out.print(String.format("(%d): %s %s", p.getPersoonNr(),
		// p.getVoornaam(), p.getFamilienaam()));
		// if (aantalKinderenTonen) {
		// System.out.print(" - " + p.getAantalKinderen() + " kinderen");
		// }
		// System.out.println();
		// });

		for (Persoon persoon : personen) {
			for (PersoonEigenschap eigenschap : eigenschappen) {
				toonEigenschap(persoon, eigenschap);
				System.out.print(' ');
			}
			System.out.println();
		}
	}

	private void toonEigenschap(Persoon persoon, PersoonEigenschap eigenschap) {

		switch (eigenschap) {
		case PERSOON_NR:
			System.out.print(persoon.getPersoonNr());
			break;
		case VOORNAAM:
			System.out.print(persoon.getVoornaam());
			break;
		case FAMILIENAAM:
			System.out.print(persoon.getFamilienaam());
			break;
		case AANTAL_KINDEREN:
			System.out.print(persoon.getAantalKinderen());
			break;
		}

	}

}
