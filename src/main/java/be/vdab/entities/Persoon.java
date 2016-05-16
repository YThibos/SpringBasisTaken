package be.vdab.entities;

public class Persoon {
	
	// MEMBER VARIABLES
	private int persoonNr;
	private String voornaam;
	private String familienaam;
	private int aantalKinderen;

	// CONSTRUCTORS
	public Persoon(int persoonNr, String voornaam, String familienaam, int aantalKinderen) {
		this.persoonNr = persoonNr;
		this.voornaam = voornaam;
		this.familienaam = familienaam;
		this.aantalKinderen = aantalKinderen;
	}

	// GETTERS
	public int getPersoonNr() {
		return persoonNr;
	}
	public String getVoornaam() {
		return voornaam;
	}
	public String getFamilienaam() {
		return familienaam;
	}
	public int getAantalKinderen() {
		return aantalKinderen;
	}

	// OVERRIDEN OBJECT METHODS
	@Override
	public String toString() {
		return "(" + persoonNr + "): " + voornaam + " " + familienaam + " - " + aantalKinderen + " kinderen.";
	}

}
