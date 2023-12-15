public class Rectangle {
    private Point hg; // Coin haut gauche
    private Point bd; // Coin bas droit
    // Constructeur
    public Rectangle(Point hg, Point bd) {
        this.hg = new Point(hg);  // Utilisation du constructeur copie
        this.bd = new Point(bd);  // Utilisation du constructeur copie
    }

    // Méthode pour afficher les coordonnées des coins
    public void affiche() {
        System.out.println("Coin supérieur gauche : (" + hg.getX() + ", " + hg.getY() + ")");
        System.out.println("Coin inférieur droit : (" + bd.getX() + ", " + bd.getY() + ")");
    }

    // Méthode pour calculer la superficie du rectangle
    public int calculerSuperficie() {
        return Math.abs((bd.getX() - hg.getX()) * (bd.getY() - hg.getY()));
    }

    // Méthode pour calculer le périmètre du rectangle
    public int calculerPerimetre() {
        return 2 * (Math.abs(bd.getX() - hg.getX()) + Math.abs(bd.getY() - hg.getY()));
    }

    // Méthode pour zoomer sur le rectangle par un facteur
    public void zoom(int facteur) {
        hg.setX(hg.getX() * facteur);
        hg.setY(hg.getY() * facteur);
        bd.setX(bd.getX() * facteur);
        bd.setY(bd.getY() * facteur);
    }

    // Méthodes set et get pour le coin haut gauche (hg)
    public void setHG(Point hg) {
        this.hg = new Point(hg);
    }

    public Point getHG() {
        return new Point(hg);
    }

    // Méthodes set et get pour le coin bas droit (bd)
    public void setBD(Point bd) {
        this.bd = new Point(bd);
    }

    public Point getBD() {
        return new Point(bd);
    }
}

    