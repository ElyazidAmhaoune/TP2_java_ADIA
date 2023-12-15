public class TestRectangle {

    public static void main(String[] args) {
        // Exemple d'utilisation avec des Points
        Point pointHG = new Point(1, 4);
        Point pointBD = new Point(5, 2);
        Rectangle monRectangle = new Rectangle(pointHG, pointBD);

        // Afficher les coordonnées initiales
        System.out.println("Coordonnées initiales :");
        monRectangle.affiche();

        // Calculer et afficher la superficie
        int superficie = monRectangle.calculerSuperficie();
        System.out.println("Superficie : " + superficie);

        // Calculer et afficher le périmètre
        int perimetre = monRectangle.calculerPerimetre();
        System.out.println("Périmètre : " + perimetre);

        // Zoom sur le rectangle et afficher les nouvelles coordonnées
        monRectangle.zoom(2);
        System.out.println("Coordonnées après le zoom :");
        monRectangle.affiche();
    }
}
