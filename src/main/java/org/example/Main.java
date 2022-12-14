package org.example;

/*il coverage dà 100%, il test non fallisce, ma c'e' un bug, ossia quando l'utente inserisce una e-mail già
presente nel sistema, tutto sembra andare per il verso giusto ma il realtà la sua e-mail non è stata inserita*/

public class Main {
    public static void main(String[] args) {
        InserisciCredenziali Leclerc= new InserisciCredenziali();
        Leclerc.compilaICampi("charlesLeclerc97@gmail.com","Charles","Leclerc","M",25);
        InserisciCredenziali Sainz= new InserisciCredenziali();
        Sainz.compilaICampi("carlosSainz94@gmail.com","Carlos","Sainz","M",28);
        InserisciCredenziali Ricciardo= new InserisciCredenziali();
        Ricciardo.compilaICampi("charlesLeclerc97@gmail.com","Daniel","Ricciardo","M",33);
        InserisciCredenziali Binotto= new InserisciCredenziali();
        Binotto.compilaICampi(null,"Mattia","Binotto","M",53);
        Binotto.printLista();
    }
}