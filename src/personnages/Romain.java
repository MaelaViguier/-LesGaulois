package personnages;

public class Romain extends Personnage{
	
	public Romain(String nom, int force) {
		super(nom, force); 
	}
	
	@Override
	public String donnerAuteur() {
		return "romain "; 
	}

}

/*package personnages;

public class Romain extends personnage{
	private String nom; 
	private int force; 
	
	public Romain(String nom, int force) {
		this.nom = nom; 
		this.force = force; 
	}
	
	public String getNom() {
		return nom; 
	}
	
	public void parler(String chaine) {
		System.out.println("Le romain " + nom + " : \"" + chaine + "\".");
	}
	
	public String recevoirCoup(int forceCoup) {
		force = force - forceCoup; 
		if (force <= 0) {
			force = 0; 
			return "J'abandonne";
		}
		else {
			return "Aie ! ";
		}
	}

}
*/