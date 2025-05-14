// Client-Code Pizzeria
public class Main {
    public static void main(String[] args) {
        System.out.println("Willkommen in der Pizzeria!");

        PizzaDirector director = new PizzaDirector();

        // 1. Erstelle eine Margherita Pizza mit dem Director
        System.out.println("\nBestellung: Margherita über Director");
        PizzaBuilder margheritaBuilderFuerDirector = new MargheritaPizzaBuilder();
        director.setPizzaBuilder(margheritaBuilderFuerDirector);
        // TODO: Lassen Sie den Director eine Margherita konstruieren
        // TODO: Holen Sie die Pizza vom Director und geben Sie sie aus


        // 2. Erstelle eine Hawaii Pizza mit dem Director (VORGEGEBEN als Beispiel)
        System.out.println("\nBestellung: Hawaii über Director (Beispiel)");
        PizzaBuilder hawaiiBuilderFuerDirector = new HawaiiPizzaBuilder();
        director.setPizzaBuilder(hawaiiBuilderFuerDirector);
        director.constructPizzaHawaii();
        Pizza hawaiiVomDirector = director.getConstructedPizza();
        System.out.println("Erhalten (Beispiel): " + hawaiiVomDirector);

        // 3. Erstelle eine benutzerdefinierte Pizza direkt mit einem Builder
        System.out.println("\nBestellung: Benutzerdefinierte Pizza (Margherita mit Extra Schinken)");
        MargheritaPizzaBuilder customBuilder = new MargheritaPizzaBuilder();
        // TODO: Verwenden Sie den customBuilder direkt, um eine Pizza zu bauen:
        // - Rufen Sie baueTeig() auf.
        // - Rufen Sie baueSosse() auf (nachdem Sie es implementiert haben).
        // - Rufen Sie baueStandardBelaege() auf (nachdem Sie es implementiert haben).
        // - Fügen Sie einen extra Belag "Schinken" hinzu mit fuegeBelagHinzu().
        // TODO: Holen Sie die Pizza vom Builder und geben Sie sie aus.

        System.out.println("\nDanke für Ihre Bestellung!");
    }
}
