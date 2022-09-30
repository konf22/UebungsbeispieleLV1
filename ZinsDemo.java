public class ZinsDemo {

    /**
     * Deklarieren Sie eine Variable kontostand und zinsen.
     * Initialisieren Sie diese Variablen mit geeigneten
     * Werten (zB.: kontostand = 1000 | zinsen = 2,25).
     * <p>
     * Berechnen Sie die erhaltenen Zinsen am Ende der
     * Laufzeit und geben Sie den errechneten Wert auf der Konsole aus
     *
     * @param args Programmargumente (nicht genutzt)
     */
    public static void main(String[] args) {
        double kontostand = 1000;
        double zinsen = 2.25;

        System.out.println(berechneZinsen(kontostand, zinsen));
        System.out.println(berechneZinsen(2333.33, 1.5));
        System.out.println(berechneZinsen(2323, 6.75));
    }

    private static double berechneZinsen(double kontostand, double zinsen) {
        return kontostand * zinsen / 100;
    }
}
