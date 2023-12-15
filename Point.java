/**
 * Point
 */
public class Point {

    private int x;
    private int y;

    // Définir la coordonnée x
    public void setX(int x) {
        this.x = x;
    }

    // Définir la coordonnée y
    public void setY(int y) {
        this.y = y;
    }
    

    // Réinitialiser la coordonnée x à 0
    public void resetX() {
        this.x = 0;
    }

    // Réinitialiser la coordonnée y à 0
    public void resetY() {
        this.y = 0;
    }

    // Déplacer la coordonnée x par une certaine distance
    public void moveX(int distance) {
        this.x = this.x + distance;
    }

    // Déplacer la coordonnée y par une certaine distance
    public void moveY(int distance) {
        this.y = this.y + distance;
    }

    // Calculer la distance par rapport à une autre coordonnée x
    public int calcDistanceX(int bx) {
        return Math.abs(bx - this.x);
    }

    // Calculer la distance par rapport à une autre coordonnée y
    public int calcDistanceY(int by) {
        return Math.abs(by - this.y);
    }

    // Obtenir la coordonnée x
    public int getX() {
        return x;
    }

    // Obtenir la coordonnée y
    public int getY() {
        return y;
    }

    // Méthode equals pour comparer deux points par leurs coordonnées
    public boolean equals(Point a) {
        return this.x == a.x && this.y == a.y;
    }

    /* Calculer la distance entre deux points en utilisant la formule :
       distance = sqrt((x2-x1)^2 + (y2-y1)^2) */
    public double calculateDistance(int autreX, int autreY) {
        int distanceX = Math.abs(autreX - this.x);
        int distanceY = Math.abs(autreY - this.y);
        return Math.sqrt(Math.pow(distanceX, 2) + Math.pow(distanceY, 2));
    }

    // Constructeur sans paramètre pour initialiser un point à (0, 0)
    public Point() {
        // Appel du constructeur avec paramètres en utilisant this(0, 0)
        this(0, 0);
    }

    // Constructeur avec paramètres pour initialiser un point à (a, b)
    public Point(int a, int b) {
        this.x = a;
        this.y = b;
    }
    // Constructeur copie
    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    // Constructeur avec un seul paramètre pour initialiser l'abscisse (affecte le paramètre à x et 0 à y)
    public Point(int a) {
        // Deux façons différentes d'écrire le constructeur
        // Première façon
        // this.x = a;
        // this.y = 0;

        // Deuxième façon
        this(a, 0);
    }
    // Redéfinir la méthode toString()
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
