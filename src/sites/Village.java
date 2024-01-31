package sites;

import personnages.Gaulois;

public class Village {
	Gaulois chef;
	Gaulois[] armeeGaulois = new Gaulois[50];
	
	public Village(Gaulois chef , Gaulois[] armeeGaulois) {
		this.chef = chef; 
		this.armeeGaulois = armeeGaulois; 
	}
	public Gaulois chef() {
		return chef; 
	}
	
	public boolean ajouterSoldat(Gaulois gaulois) {
		
		for(int i =0; i <80; i++) {
			if (armeeGaulois[i] == null) {
				armeeGaulois[i] = gaulois; 
				System.out.println("Bienvenue " + gaulois.nom + "!");
				return true; 
			}
		}
		return false; 
	}
	
	public void afficherCamp(Village village) {
		System.out.println("Le village de " + village.chef + "est habité par : "); 
		
		for (int i=0 ; i<80; i++) {
			if (village.armeeGaulois[i] != null ) {
				System.out.println("- " + village.armeeGaulois[i]); 
			}
		}
	}
	
	public void changerChef(Village village, Gaulois chef) {
		
	}

}
