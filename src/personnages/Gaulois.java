package personnages;

public class Gaulois {
	private String nom;
	private int force;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	
	public int getForce() {
		return force;
	}

	public void parler(String chaine) {
		System.out.println("Le gaulois " + nom + " : \"" + chaine + "\".");
	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la m�choire de " + romain.getNom());
	}

//	public static void main(String[] args) {
//		Gaulois asterix = new Gaulois("Ast�rix", 8);
//		System.out.println(asterix);
//		System.out.println(asterix.getNom());
//	}

}
