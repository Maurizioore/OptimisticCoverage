package org.example;

import static org.junit.jupiter.api.Assertions.*;

class InserisciCredenzialiTest {

    @org.junit.jupiter.api.Test
    void compilaICampi() {
        InserisciCredenziali Leclerc= new InserisciCredenziali();
        assertEquals(0,Leclerc.compilaICampi("charlesLeclerc97@gmail.com","Charles","Leclerc","M",25));
    }

}