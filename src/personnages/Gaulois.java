package personnages;

public class Gaulois extends Personnage{
	
	private double booster = 1; 
	
	public Gaulois(String nom, int force) {
		super(nom, force); 
	}
	
	@Override
	public String donnerAuteur() {
		return "gaulois "; 
	}
	
	public void boirePotion(Potion potion) {
        this.booster *= potion.getPuissance();
        this.parler("Tiens " + this.nom + " une peu de potion maagique ");
    }
	
	@Override
	public double calculForce(double force) {
		return (force/3)*booster; 
	}
	
	 @Override
	    public void frapper(Personnage victime) {
	        double forceCoup = (double)(this.force * this.booster);

			if (victime.estATerre()) {
				victime.parler("J'abandonne...");
			}
			else if(!victime.estATerre() && !this.estATerre()) {
				super.parler("envoie un grand coup dans la mâchoire de " + victime.getNom() + " avec une force de " + forceCoup);
				victime.recevoirCoup(forceCoup);
			}
	        
			if (booster>1) {
				this.booster = this.booster - 0.5 ; 
			}

	    }
	 
}


/*package personnages;

public class Gaulois extends personnage{
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
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
	}

//	public static void main(String[] args) {
//		Gaulois asterix = new Gaulois("Astérix", 8);
//		System.out.println(asterix);
//		System.out.println(asterix.getNom());
//	}

}
*/