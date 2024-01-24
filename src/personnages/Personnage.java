package personnages;

public abstract class Personnage {
	
	private String nom; 
	private int force; 
	
	public Personnage(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String chaine) {
		System.out.println("Le " + donnerAuteur()+ nom + " : \"" + chaine + "\".");
	}
	
	public abstract String donnerAuteur(); 
	
	public void frapper(Personnage adversaire) {
		System.out.println("Le " + donnerAuteur() + nom + " donne un grand coup au " + adversaire.donnerAuteur() + adversaire.getNom());
		adversaire.recevoirCoup(force/3); 
	}
	
	public void recevoirCoup(int forceCoup) {
		force = force - forceCoup; 
		if (force < 0) {
			force = 0; 
			System.out.println("Le " + donnerAuteur() + nom + " : " + "J'abandonne");
		}
		else {
			System.out.println("Le " + donnerAuteur() + nom + " : " + "A�e ! ");
		}
	}

	
}
