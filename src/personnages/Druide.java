package personnages;

public class Druide extends Personnage{
	
	public Druide(String nom, int force) {
		super(nom, force); 
	}
	
	@Override
	public String donnerAuteur() {
		return "Druide "; 
	}
	
	public void fabriquerPotion(int doses , int force) {
		
	}
}