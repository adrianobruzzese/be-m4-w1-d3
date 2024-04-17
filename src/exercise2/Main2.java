package u4.d2.es2;

public class Main2 {

    public static void main(String[] args) {
        // Creazione di una nuova SIM e aggiunta di credito
        Sim sim1 = new Sim("+39 0000000000");
        sim1.aggiungiCredito(20);

        // Inizializzazione della lista delle chiamate e popolamento con nuove chiamate
        Chiamata[] listaChiamate = new Chiamata[5];
        listaChiamate[0] = new Chiamata("+39 1111111111", 20);
        listaChiamate[1] = new Chiamata("+39 2222222222", 1);
        listaChiamate[2] = new Chiamata("+39 3333333333", 7);
        listaChiamate[3] = new Chiamata("+39 4444444444", 1);
        listaChiamate[4] = new Chiamata("+39 5555555555", 13);
        sim1.setListaChiamate(listaChiamate);

        // Stampa dei dati della SIM
        sim1.stampaDati();
    }
}
