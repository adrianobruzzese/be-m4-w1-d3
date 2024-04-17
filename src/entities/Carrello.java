package u4.d2.es3;

public class Carrello {
    private Cliente cliente;
    private Articolo[] elencoArticoli;

    // Costruttore del carrello che inizializza il cliente e un array vuoto per gli articoli
    public Carrello(Cliente cliente) {
        this.cliente = cliente;
        this.elencoArticoli = new Articolo[0];
    }

    // Getters e setters per i dati del carrello
    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public Articolo[] getElencoArticoli() { return elencoArticoli; }
    public void setElencoArticoli(Articolo[] articoli) { elencoArticoli = articoli; }

    // Metodo per calcolare il costo totale degli articoli nel carrello
    public double getTotaleCostoArticoli() {
        double totale = 0;
        for (Articolo articolo : elencoArticoli) {
            if (articolo.getNumeroPezziInMagazzino() > 0) {
                totale += articolo.getPrezzo();
            } else {
                System.out.println("Non disponibile: " + articolo.getCodice());
            }
        }
        return totale;
    }
}
