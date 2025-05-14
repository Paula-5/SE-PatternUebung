public class Main {
    public static void main(String[] args) {
        Runnable mitarbeiter1 = () -> {
            Drucker drucker = Drucker.getInstance();
            drucker.druckeSeite("Wichtiger Bericht Seite 1", "Mitarbeiter 1");
        };

        Runnable mitarbeiter2 = () -> {
            Drucker drucker = Drucker.getInstance();
            drucker.druckeSeite("Gehaltsabrechnung", "Mitarbeiter 2");
        };

        Thread t1 = new Thread(mitarbeiter1);
        Thread t2 = new Thread(mitarbeiter2);
        t1.start();
        t2.start();
    }
}