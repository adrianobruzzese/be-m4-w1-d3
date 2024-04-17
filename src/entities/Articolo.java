package u4.d2.es3;

public class Articolo {
    // Utilizzo di attributi privati per garantire l'incapsulamento
    private String codice;
    private String descrizione;
    private double prezzo;
    private int numeroPezziInMagazzino;

    // Costruttore per inizializzare un articolo con codice, descrizione e prezzo
    public Articolo(String codice, String descrizione, double prezzo) {
        this.codice = codice;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.numeroPezziInMagazzino = 0; // Default a 0 pezzi in magazzino
    }

    // Getters e setters per accesso controllato agli attributi
    public String getCodice() { return codice; }
    public void setCodice(String codice) { this.codice = codice; }

    public String getDescrizione() { return descrizione; }
    public void setDescrizione(String descrizione) { this.descrizione = descrizione; }

    public double getPrezzo() { return prezzo; }
    public void setPrezzo(double prezzo) { this.prezzo = prezzo; }

    public int getNumeroPezziInMagazzino() { return numeroPezziInMagazzino; }
    public void setNumeroPezziInMagazzino(int numero) { numeroPezziInMagazzino = numero; }

    // Metodo per aggiungere pezzi al magazzino
    public void aggiungiPezziAMagazzino(int pezzi) {
        numeroPezziInMagazzino += pezzi;
    }

    // Override del metodo toString per una stampa personalizzata dell'articolo
    @Override
    public String toString() {
        return "Codice: " + codice + " - " + descrizione + " Prezzo: " + prezzo + "€ Pezzi in magazzino: " + numeroPezziInMagazzino;
    }
}
