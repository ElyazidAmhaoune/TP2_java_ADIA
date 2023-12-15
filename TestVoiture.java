// Classe TestVoiture
public class TestVoiture {
    public static void main(String[] args) {
        // Création d'une roue
        Roue roueAvantGauche = new Roue(16.0);

        // Création d'un moteur
        Moteur moteurEssence = new Moteur("Essence", 150);

        // Création d'une voiture avec 4 roues
        Roue[] rouesVoiture = {roueAvantGauche, new Roue(16.0), new Roue(16.0), new Roue(16.0)};
        Voiture maVoiture = new Voiture("Toyota", "Camry", 120, moteurEssence, rouesVoiture);

        // Affichage des informations de la voiture
        maVoiture.afficherInfos();
    }
}