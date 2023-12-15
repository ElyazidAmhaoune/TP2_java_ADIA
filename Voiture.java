// Classe Voiture
public class Voiture {
    // Attributs de la voiture
    private String marque;
    private String modele;
    private int vitesse;
    private Moteur moteur;
    private Roue[] roues;

    // Constructeur de la voiture
    public Voiture(String marque, String modele, int vitesse, Moteur moteur, Roue[] roues) {
        this.marque = marque;
        this.modele = modele;
        this.vitesse = vitesse;
        this.moteur = moteur;

        // Vérifier si le nombre de roues est correct (4 ou 5)
        if (roues.length == 4 || roues.length == 5) {
            this.roues = roues;
        } 
    }

    // Getter pour la marque de la voiture
    public String getMarque() {
        return marque;
    }

    // Getter pour le modèle de la voiture
    public String getModele() {
        return modele;
    }
    // Méthode pour afficher les informations de la voiture
    public void afficherInfos() {
        System.out.println("Voiture " + marque + " " + modele);
        System.out.println("Vitesse : " + vitesse);
        System.out.println("Moteur : " + moteur.getNom() + " - Puissance : " + moteur.getPuissance() + " ch");
        System.out.println("Roues :");
        for (int i = 0; i < roues.length; i++) {
            System.out.println("Roue " + (i + 1) + " - Diamètre : " + roues[i].getDiametre() + " pouces");
        }
    }
}
