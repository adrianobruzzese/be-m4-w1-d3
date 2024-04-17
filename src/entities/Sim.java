package u4.d2.es2;

public class Sim {
    // Numero della SIM pubblico per un facile accesso se necessario
    public String numero;
    // Credito e lista chiamate mantenuti privati per proteggere i dati
    private double credito;
    private Chiamata[] listaChiamate;

    // Costruttore che inizializza la SIM con un numero e imposta credito e lista chiamate a valori di default
    public Sim(String numero) {
        this.numero = numero;
        this.credito = 0; // inizializza il credito a 0
        this.listaChiamate = new Chiamata[5]; // array per memorizzare fino a 5 chiamate
    }

    // Metodo per aggiungere credito alla SIM
    public void aggiungiCredito(double nuovoCredito) {
        this.credito += nuovoCredito;
    }

    // Metodo per impostare la lista delle chiamate
    public void setListaChiamate(Chiamata[] listaChiamate) {
        this.listaChiamate = listaChiamate;
    }

    // Metodo per stampare i dati della SIM, inclusi i dettagli delle chiamate
    public void stampaDati() {
        System.out.println("Sim: " + this.numero);
        System.out.println("Credito disponibile: " + this.credito);
        for (int i = 0; i < listaChiamate.length; i++) {
            if (listaChiamate[i] != null) {
                System.out.println("- Chiamata " + (i + 1) + ": " + listaChiamate[i].getNumeroChiamato() + " - Durata minuti: " + listaChiamate[i].getDurata());
            }
        }
    }
}
