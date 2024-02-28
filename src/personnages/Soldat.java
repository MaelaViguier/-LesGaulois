package personnages;

import Equipement.Equipement;

public class Soldat extends Romain {
 
    public Grade grade;
    private boolean casque = false;
    private boolean plastron = false;
    private boolean bouclier = false;

    public Soldat(String nom, int force, Grade grade) {
        super(nom, force);
        this.grade = grade;
    }

    public void equiperCasque() {
        this.casque = true; 
    }

    public void equiperPlastron() {
        this.plastron = true;
    }

    public void equiperBouclier() {
        this.bouclier = true;
    }

    @Override
    public void frapper(Personnage adversaire) {
        int forceCoup = force;
        if (casque != false) {
            forceCoup = forceCoup - 2; 
            System.out.println("Le casque absorbe 2 du coup."); 
        }
        if (plastron != false) {
            forceCoup = forceCoup - 3;
            System.out.println("Le plastron absorbe 3 du coup."); 
        }
        if (bouclier != false) {
            forceCoup = forceCoup - 3;
            System.out.println("Le bouclier absorbe 3 du coup."); 
        }

        super.parler("donne un grand coup avec une force de " + forceCoup);
        adversaire.recevoirCoup(forceCoup);
    }

    @Override
    public void parler(String message) {
        System.out.println("Le soldat " + grade + " " + getNom() + " : \"" + message + "\".");
    }
}