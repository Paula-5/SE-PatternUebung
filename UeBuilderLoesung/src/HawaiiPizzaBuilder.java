// Konkreter Builder für Pizza Hawaii
class HawaiiPizzaBuilder implements PizzaBuilder {
    private Pizza pizza;

    public HawaiiPizzaBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.pizza = new Pizza();
    }

    @Override
    public void baueTeig() {
        pizza.setTeig("Flaumiger American Style Teig");
    }

    @Override
    public void baueSosse() {
        pizza.setSosse("Tomatensoße mit leichter Süße");
    }

    @Override
    public void fuegeBelagHinzu(String belag) {
        pizza.addBelag(belag);
    }

    @Override
    public void baueStandardBelaege() {
        pizza.addBelag("Schinken");
        pizza.addBelag("Ananas");
        pizza.addBelag("Käse-Mix");
    }

    @Override
    public Pizza getPizza() {
        Pizza fertigePizza = this.pizza;
        this.reset();
        return fertigePizza;
    }
}
