package sites;

import personnages.Gaulois;

public class Village {
	private Gaulois chef;
	private Gaulois[] armeeGaulois = new Gaulois[4];
	private int nbVillageois; 
	
	public Village(Gaulois chef ) {
		this.chef = chef; 
	}
	public Gaulois chef() {
		return chef; 
	}
	
	public boolean ajouterVillageois(Gaulois gaulois) {
		if (nbVillageois < armeeGaulois.length) {
				armeeGaulois[nbVillageois] = gaulois; 
				System.out.println("Le " + chef.donnerAuteur() + chef.nom + " : \" Bienvenue " + gaulois.nom + "! \" ");
				return true; 
			}
	System.out.println("Le " + chef.donnerAuteur() + chef.nom + " : \" Désolé "+ gaulois.nom + " mon village est deja bien rempli.\""); 
		return false; 
	}
	
	public void afficherVillageois(Village village) {
		System.out.println("Le village de " + chef.nom + " est habité par : "); 
		
		for (int i=0 ; i<nbVillageois; i++) {
			if (village.armeeGaulois[i] != null ) {
				System.out.println("- " + armeeGaulois[i].nom); 
			}
		}
	}
	
	public void changerChef( Gaulois chef) {
				this.chef = chef ; 
				System.out.println("Le " + this.chef.donnerAuteur() + this.chef.nom + " : \" Je laisse mon grand bouclier au grand" + chef.nom + "\"."); 
				System.out.println("Le " + chef.donnerAuteur() + chef.nom + " : \"Merci ! \""); 
			}
}