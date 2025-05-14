// Director-Klasse
class PizzaDirector {
    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pb) {
        this.pizzaBuilder = pb;
    }

    public void constructPizzaMargherita() {
        if (pizzaBuilder == null) {
            throw new IllegalStateException("PizzaBuilder wurde nicht gesetzt.");
        }
        pizzaBuilder.reset();
        pizzaBuilder.baueTeig();
        pizzaBuilder.baueSosse();
        pizzaBuilder.baueStandardBelaege();
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