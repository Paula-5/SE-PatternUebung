// Builder Interface
interface PizzaBuilder {
    void reset();
    void baueTeig();
    void baueSosse();
    void fuegeBelagHinzu(String belag); // Für individuelle Beläge
    void baueStandardBelaege(); // Für die typischen Beläge einer Pizza-Sorte
    Pizza getPizza();
}