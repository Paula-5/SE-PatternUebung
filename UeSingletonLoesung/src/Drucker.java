public class Drucker {
    private static volatile Drucker instance;
    private String name = "ZentralerBüroDrucker"; // Ein fester Name für den Singleton-Drucker

    private Drucker() {
        System.out.println("Neue Druckerinstanz '" + name + "' (Singleton) erstellt.");
    }

    public static Drucker getInstance() {
        if (instance == null) {
            synchronized (Drucker.class) {
                if (instance == null) {
                    instance = new Drucker();
                }
            }
        }
        return instance;
    }

    public void druckeSeite(String inhalt, String benutzer) {
        System.out.println("Drucker '" + name + "' (Singleton) druckt für Benutzer '" + benutzer + "': " + inhalt);
    }

    public String getName() {
        return name;
    }
}
