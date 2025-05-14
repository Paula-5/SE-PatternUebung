// Client-Code Pizzeria
public class Main {
    public static void main(String[] args) {
        System.out.println("Willkommen in der Pizzeria!");

        PizzaDirector director = new PizzaDirector();

        // 1. Erstelle eine Margherita Pizza mit dem Director
        System.out.println("\nBestellung: Margherita über Director");
        PizzaBuilder margheritaBuilderFuerDirector = new MargheritaPizzaBuilder();
        director.setPizzaBuilder(margheritaBuilderFuerDirector);
        director.constructPizzaMargherita();
        Pizza margheritaVomDirector = director.getConstructedPizza();
        System.out.println("Erhalten: " + margheritaVomDirector);


        // 2. Erstelle eine Hawaii Pizza mit dem Director
        System.out.println("\nBestellung: Hawaii über Director (Beispiel)");
        PizzaBuilder hawaiiBuilderFuerDirector = new HawaiiPizzaBuilder();
        director.setPizzaBuilder(hawaiiBuilderFuerDirector);
        director.constructPizzaHawaii();
        Pizza hawaiiVomDirector = director.getConstructedPizza();
        System.out.println("Erhalten (Beispiel): " + hawaiiVomDirector);


        // 3. Erstelle eine benutzerdefinierte Pizza direkt mit einem Builder
        System.out.println("\nBestellung: Benutzerdefinierte Pizza (Margherita mit Extra Schinken)");
        MargheritaPizzaBuilder customBuilder = new MargheritaPizzaBuilder();
        customBuilder.baueTeig();
        customBuilder.baueSosse();
        customBuilder.baueStandardBelaege();
        customBuilder.fuegeBelagHinzu("Schinken");
        Pizza customPizza = customBuilder.getPizza();
        System.out.println("Erhalten: " + customPizza);

        System.out.println("\nDanke für Ihre Bestellung!");
    }
}
