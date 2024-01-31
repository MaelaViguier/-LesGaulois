package sites;

import personnages.Gaulois;
import personnages.Soldat;

public class Camp { 
	Soldat commandant;
	Soldat[] armeeRomain = new Soldat[80];
	
	public Camp(Soldat commandant , Soldat[] armeeRomain) {
		this.commandant = commandant; 
		this.armeeRomain = armeeRomain; 
	}
	
	public Soldat getCommandant(){
		return commandant; 
	}

	
	public boolean ajouterSoldat(Soldat soldat) {
		
		for(int i =0; i <80; i++) {
			if (armeeRomain[i] == null) {
				armeeRomain[i] = soldat; 
				System.out.println("Le " + soldat.donnerAuteur() + soldat.nom + " : " + "Je mets mon épée au service de Rome dans le camp dirigé par Minus.");
				return true; 
			}
		}
		return false; 
	}
	
	public void afficherCamp(Camp camp) {
		System.out.println("Le village de " + camp.commandant + "est habité par : "); 
		
		for (int i=0 ; i<80; i++) {
			if (camp.armeeRomain[i] != null ) {
				System.out.println("- " + camp.armeeRomain[i]); 
			}
		}
	}
	
	public void changerCommandant(Camp camp, Soldat commandant) {
		
	}

}

