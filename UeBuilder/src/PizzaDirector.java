// Director-Klasse
class PizzaDirector {
    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pb) {
        this.pizzaBuilder = pb;
    }

    public void constructPizzaMargherita() {
        // TODO: Implementieren Sie die Konstruktionsschritte für eine Margherita Pizza.
        // Stellen Sie sicher, dass der pizzaBuilder gesetzt ist.
        // Rufen Sie reset(), baueTeig(), baueSosse() und baueStandardBelaege()
        // auf dem pizzaBuilder auf.
        if (pizzaBuilder == null) {
            throw new IllegalStateException("PizzaBuilder wurde nicht gesetzt.");
        }
        // hier Code einfügen
    }

    public void constructPizzaHawaii() {
        if (pizzaBuilder == null) {
            throw new IllegalStateException("PizzaBuilder wurde nicht gesetzt.");
        }
        pizzaBuilder.reset();
        pizzaBuilder.baueTeig();
        pizzaBuilder.baueSosse();
        pizzaBuilder.baueStandardBelaege();
    }

    public Pizza getConstructedPizza() {
        if (pizzaBuilder == null) {
            throw new IllegalStateException("PizzaBuilder wurde nicht gesetzt oder keine Pizza konstruiert.");
        }
        return pizzaBuilder.getPizza();
    }
}