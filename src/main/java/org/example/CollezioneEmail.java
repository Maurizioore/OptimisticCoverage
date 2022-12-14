package org.example;

import java.util.HashSet;
import java.util.LinkedHashSet;

public abstract class CollezioneEmail {
    //variabile che tiene conto del numero di email inserite in totale fino ad ora
    protected static int numeroEmail=0;
    //variabile in cui vengono inserite le email
    protected static HashSet<String> collezioneEmail = new HashSet<String>();
    protected int printLista() {
        for (String stringa : collezioneEmail) {
            System.out.println(stringa);
        }
        return 0;
    }






}
