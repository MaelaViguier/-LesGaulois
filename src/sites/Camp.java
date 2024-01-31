package sites;

import personnages.Grade;
import personnages.Soldat;

public class Camp {
	private Soldat commandant;
	private Soldat[] armeeRomain = new Soldat[4];
	private int nbSoldat = 0;

	public Camp(Soldat commandant) {
		this.commandant = commandant;
	}

	public Soldat getCommandant() {
		return commandant;
	}

	public boolean ajouterSoldat(Soldat soldat) {
		if (nbSoldat < armeeRomain.length) {
			armeeRomain[nbSoldat] = soldat;
			System.out.println("Le " + soldat.donnerAuteur() + soldat.nom + " : "
					+ "\"Je mets mon epee au service de Rome dans le camp dirige par \" " + commandant.nom);
			nbSoldat++;
			return true;
		}
		System.out.println("Le " + soldat.donnerAuteur() + commandant.nom + " : \" D�sol� " + soldat.nom
				+ " notre camp est complet ! \"");
		return false;
	}

	public void afficherCamp(Camp camp) {
		System.out.println("Le camp dirige " + commandant.nom + " est habit� par : \"");

		for (int i = 0; i < nbSoldat; i++) {
			System.out.println("- " + armeeRomain[i].nom);
		}
	}

	public void changerCommandant(Soldat commandant) {
		if (commandant.grade != Grade.CENTURION) {
			this.commandant = commandant;
			System.out.println("Le " + commandant.donnerAuteur() + commandant.nom
					+ " : \" Je ne suis pas suffisamment grad� pour prendre la direction du camp\r\n" + "romain. \".");
		} else {
			System.out.println("Le " + commandant.donnerAuteur() + "\"Moi " + commandant.nom
					+ "je prends la direction du camp romain.\"");
		}
	}

}
