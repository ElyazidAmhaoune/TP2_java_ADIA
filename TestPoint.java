public class TestPoint {

    public static void main(String[] args) {
        // Création de deux points p et q avec les mêmes coordonnées
        Point p = new Point();
        Point q = new Point();

        // Vérification du résultat de la méthode equals
        System.out.println("Est-ce que p est égal à q ? " + p.equals(q));
        // Le résultat devrait être true, car p et q référencent le même objet

        // Création et initialisation d'un objet Point à (0, 0) par défaut
        Point defaultPoint = new Point();

        // Création et initialisation d'un objet Point à (5, 2)
        Point customPoint = new Point(5, 2);

        // Affichage des coordonnées des nouveaux points
        System.out.println("Coordonnées de defaultPoint : (" + defaultPoint.getX() + ", " + defaultPoint.getY() + ")");
        System.out.println("Coordonnées de customPoint : (" + customPoint.getX() + ", " + customPoint.getY() + ")");

        // Création d'un point avec un seul paramètre (initialisation de l'abscisse)
        Point pointWithX = new Point(3);

        // Affichage des coordonnées du nouveau point
        System.out.println("Coordonnées de pointWithX : (" + pointWithX.getX() + ", " + pointWithX.getY() + ")");
        Point pt = new Point(2, 5);

        System.out.println(pt.toString());
    }
}
