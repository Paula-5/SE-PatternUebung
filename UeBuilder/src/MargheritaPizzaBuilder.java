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
        // TODO: Implementieren Sie das Setzen der Soße für eine Margherita
    }

    @Override
    public void fuegeBelagHinzu(String belag) {
        // Diese Methode ist für zusätzliche, individuelle Beläge.
        pizza.addBelag(belag);
    }

    @Override
    public void baueStandardBelaege() {
        // TODO: Fügen Sie hier die Standardbeläge für eine Margherita hinzu
    }

    @Override
    public Pizza getPizza() {
        Pizza fertigePizza = this.pizza;
        this.reset();
        return fertigePizza;
    }
}