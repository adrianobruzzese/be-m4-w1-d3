package u4.d2.es1;

public class Rettangolo {
    // Attributi privati per altezza e larghezza per garantire l'incapsulamento.
    private double altezza;
    private double larghezza;

    // Costruttore per inizializzare un nuovo Rettangolo con altezza e larghezza specificate.
    public Rettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    // Metodo pubblico per calcolare l'area del rettangolo.
    public double area() {
        return altezza * larghezza;
    }

    // Metodo pubblico per calcolare il perimetro del rettangolo.
    public double perimetro() {
        return (altezza + larghezza) * 2;
    }
}
