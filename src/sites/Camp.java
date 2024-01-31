package sites;

import personnages.Gaulois;
import personnages.Grade;
import personnages.Soldat;

public class Camp { 
	Soldat commandant;
	Soldat[] armeeRomain = new Soldat[4];
	
	public Camp(Soldat commandant) {
		this.commandant = commandant; 
	}
	
	public Soldat getCommandant(){
		return commandant; 
	}

	
	public boolean ajouterSoldat(Soldat soldat) {
		
		for(int i =0; i <3; i++) {
			if (armeeRomain[i] == null) {
				armeeRomain[i] = soldat; 
				System.out.println("Le " + soldat.donnerAuteur() + soldat.nom + " : " + "\"Je mets mon epee au service de Rome dans le camp dirige par \" " + commandant.nom);
				return true; 
			}
		}
		System.out.println("Le " + soldat.donnerAuteur() + commandant.nom + " : \" Désolé " + soldat.nom + " notre camp est complet ! \""); 
		return false; 
	}
	
	public void afficherCamp(Camp camp) {
		System.out.println("Le camp dirige " + commandant.nom + " est habité par : \""); 
		
		for (int i=0 ; i<3; i++) {
			if (camp.armeeRomain[i] != null ) {
				System.out.println("- " + armeeRomain[i].nom); 
			}
		}
	}
	
	public void changerCommandant(Soldat commandant) {
		if (commandant.grade != Grade.CENTURION) {
			this.commandant = commandant;
			System.out.println("Le " + commandant.donnerAuteur() + commandant.nom + " : \" Je ne suis pas suffisamment gradé pour prendre la direction du camp\r\n"
					+ "romain. \"."); 
		}
		else {
			System.out.println("Le " + commandant.donnerAuteur() + "\"Moi " + commandant.nom +"je prends la direction du camp romain.\"" ); 
		}
	}

}

