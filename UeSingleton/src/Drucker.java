public class Drucker {
    private String name;

    public Drucker(String name) {
        System.out.println("Neue Druckerinstanz '" + name + "' erstellt.");
        this.name = name;
    }

    public void druckeSeite(String inhalt, String benutzer) {
        System.out.println("Drucker '" + name + "' druckt für Benutzer '" + benutzer + "': " + inhalt);
    }

    public String getName() {
        return name;
    }
}
