// Konkreter Builder für Pizza Margherita
class MargheritaPizzaBuilder implements PizzaBuilder {
    private Pizza pizza;

    public MargheritaPizzaBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.pizza = new Pizza();
    }

    @Override
    public void baueTeig() {
        pizza.setTeig("Klassischer dünner Teig");
    }

    @Override
    public void baueSosse() {
        pizza.setSosse("Tomatensoße");
    }

    @Override
    public void fuegeBelagHinzu(String belag) {
        // Diese Methode ist für zusätzliche, individuelle Beläge.
        pizza.addBelag(belag);
    }

    @Override
    public void baueStandardBelaege() {
        pizza.addBelag("Mozzarella");
        pizza.addBelag("Basilikum");
    }

    @Override
    public Pizza getPizza() {
        Pizza fertigePizza = this.pizza;
        this.reset();
        return fertigePizza;
    }
}
