import java.util.ArrayList;
import java.util.List;

// Produktklasse: Die Pizza
class Pizza {
    private String teig = "";
    private String sosse = "";
    private List<String> belaeges = new ArrayList<>();

    public void setTeig(String teig) {
        this.teig = teig;
        System.out.println("Teig gesetzt: " + teig);
    }

    public void setSosse(String sosse) {
        this.sosse = sosse;
        System.out.println("Soße gesetzt: " + sosse);
    }

    public void addBelag(String belag) {
        this.belaeges.add(belag);
        System.out.println("Belag hinzugefügt: " + belag);
    }

    @Override
    public String toString() {
        return "Pizza [Teig=" + teig + ", Soße=" + sosse + ", Beläge=" + belaeges + "]";
    }
}