package personnages;


public abstract class Personnage {
	
	public String nom; 
	public int force; 
	
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
	

	public double calculForce(double force) {
		return force = force/3;
	}
		
	public void frapper(Personnage adversaire) {
		System.out.println("Le " + donnerAuteur() + nom + " donne un grand coup au " + adversaire.donnerAuteur() + adversaire.getNom());
		adversaire.recevoirCoup(calculForce(force)); 
	}

	public double calculForceCoup(double forceCoup) {
		return force = (int) (force - forceCoup);
	}
	
	public void recevoirCoup(double forceCoup) {
		double force = calculForceCoup(forceCoup); 
		if (force <= 0) {
			force = 0; 
			System.out.println("Le " + donnerAuteur() + nom + " : " + "J'abandonne");
		}
		else {
			System.out.println("Le " + donnerAuteur() + nom + " : " + "Aie ! ");
		}
	}
	
	public boolean estATerre() {
	    return this.force <= 0;
	}
	

}
