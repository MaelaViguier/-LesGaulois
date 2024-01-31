package sites;

import personnages.EnumGARDE;
import personnages.Gaulois;
import personnages.Soldat;

public class TestSites {

	Gaulois vercingetorix = new Gaulois("Vercingétorix" , 5);
	Village village = new Village(vercingetorix, null); 
	
	private EnumGARDE CENTURION;
	Soldat minus = new Soldat("Minus", 2, CENTURION); 
	Camp camp = new Camp(minus, null); 
	
	//vercingetorix.parler("Je suis un grand guerrier et je vais créer mon village"); 
	//minus.parler("Je suis en charge de créer un nouveau camp romain. "); 
	
	//Création des gaulois
	Gaulois Agecanomix = new Gaulois("Agecanomix", 1);
	Gaulois Assurancetourix = new Gaulois("Assurancetourix", 2);
	Gaulois Astérix = new Gaulois("Astérix", 5);
	Gaulois Obelix = new Gaulois("Obelix", 15);
	Gaulois Prolix = new Gaulois("Prolix", 2);
	
	//Creation des soldats
	private EnumGARDE SOLDAT;
	private EnumGARDE TESSERARIUS; 
	private EnumGARDE OPTIO; 

	Soldat Brutus = new Soldat("Brutus", 5, CENTURION); 
	Soldat Milexcus = new Soldat("Milexcus", 2, SOLDAT);
	Soldat TulliusOctopus = new Soldat("Tullius Octopus", 2, TESSERARIUS);
	Soldat Ballondebaudrus = new Soldat("Ballondebaudrus", 3, OPTIO); 
	
	//Ajout de Soldat et de Villageois
	//camp.ajouterSoldat(Brutus); 
	//camp.ajouterSoldat(Milexcus); 
	//camp.ajouterSoldat(TulliusOctopus); 
	//camp.ajouterSoldat(Ballondebaudrus); 

	//village.ajouterVillageois(Agecanomix);
	//village.ajouterVillageois(Assurancetourix);
	//village.ajouterVillageois(Astérix);
	//village.ajouterVillageois(Obelix);
	//village.ajouterVillageois(Prolix);

	
}
