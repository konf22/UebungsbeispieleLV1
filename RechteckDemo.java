public class RechteckDemo {

    /**
     * Deklarieren Sie eine Variable breite und eine Variable laenge.
     * Beide Werte sollen eine Ganzzahl als Wert aufnehmen können und
     * repräsentieren die Länge und Bereite eines Rechtecks.
     * <p>
     * Deklarieren Sie eine dritte Variable umfang und
     * berechnen Sie den Umfang für das Rechteck.
     * <p>
     * Deklarieren Sie eine vierte Variable flaeche und
     * berechnen Sie die Fläche des Rechtecks.
     * <p>
     * Geben Sie beide Werte auf der Konsole aus
     *
     * @param args Programmargumente (nicht genutzt)
     */
    public static void main(String[] args) {
        int breite = 3;
        int laenge = 4;

        //int umfang = (breite + laenge) * 2;
        //int flaeche = breite * laenge;
        int umfang = berechneUmfang(breite, laenge);
        int flaeche = berechneFlaeche(breite, laenge);

        System.out.println("umfang = " + umfang);
        System.out.println("flaeche = " + flaeche);
    }

    /**
     * Berechne die Fläche anhand der übergebenen Parameter
     *
     * @param breite die breite
     * @param laenge die länge
     * @return die berechnete Fläche
     */
    private static int berechneFlaeche(int breite, int laenge) {
        return breite * laenge;
    }

    /**
     * Berechne den Umfang anhand der übergebenen Parameter
     *
     * @param breite die breite
     * @param laenge die länge
     * @return der berechnete Umfang
     */
    private static int berechneUmfang(int breite, int laenge) {
        return (breite + laenge) * 2;
    }
}
