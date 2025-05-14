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
        // TODO: Implementieren Sie das Setzen der Soße für eine Hawaii-Pizza
    }

    @Override
    public void fuegeBelagHinzu(String belag) {
        pizza.addBelag(belag);
    }

    @Override
    public void baueStandardBelaege() {
        // TODO: Fügen Sie hier die Standardbeläge für eine Hawaii-Pizza hinzu
    }

    @Override
    public Pizza getPizza() {
        Pizza fertigePizza = this.pizza;
        this.reset();
        return fertigePizza;
    }
}
