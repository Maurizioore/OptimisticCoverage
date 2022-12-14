package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CollezioneEmailTest {

    @Test
    void printLista() {
        InserisciCredenziali Leclerc= new InserisciCredenziali();
        Leclerc.compilaICampi("charlesLeclerc97@gmail.com","Charles","Leclerc","M",25);
        InserisciCredenziali Sainz= new InserisciCredenziali();
        Sainz.compilaICampi("carlosSainz94@gmail.com","Carlos","Sainz","M",28);
        InserisciCredenziali Ricciardo= new InserisciCredenziali();
        Ricciardo.compilaICampi("charlesLeclerc97@gmail.com","Daniel","Ricciardo","M",33);
        assertEquals(0,Ricciardo.printLista());
    }
}