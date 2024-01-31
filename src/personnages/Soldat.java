package personnages;

public class Soldat extends Romain{
	
	public EnumGARDE garde; 
	
	public Soldat(String nom, int force, EnumGARDE garde) {
		super(nom,force); 
		this.garde = garde; 
	}

}
