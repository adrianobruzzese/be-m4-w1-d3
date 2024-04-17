package u4.d2.es2;

public class Chiamata {
    // Attributi privati per numero chiamato e durata per mantenere l'incapsulamento
    private String numeroChiamato;
    private int durata;

    // Costruttore per inizializzare i dati della chiamata
    public Chiamata(String numChiamato, int durata) {
        this.numeroChiamato = numChiamato;
        this.durata = durata;
    }

    // Metodo getter per ottenere il numero chiamato
    public String getNumeroChiamato() {
        return this.numeroChiamato;
    }

    // Metodo getter per ottenere la durata della chiamata
    public int getDurata() {
        return this.durata;
    }
}
