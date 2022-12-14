package org.example;

import java.util.HashSet;

public class InserisciCredenziali extends CollezioneEmail {
    private int userId;
    private String emailAddress;
    private String nome;
    private String cognome;
    private String sesso;
    private int età;

    //metodo utilizzato dall'utente per iscriversi a un estrazione di un premio in palio organizzato da un azienda
    public int compilaICampi(String emailAddress,String nome,String cognome,String sesso,int età){
        this.cognome=cognome;
        this.emailAddress=emailAddress;
        this.sesso=sesso;
        this.età=età;
        this.nome=nome;
        if(this.emailAddress==null){
            System.out.println("inserisci una mail");
            return -1;
        }
        return InserisciEmail();
    }
    //metodo con il quale viene inserita l'email dell'utente nella lista delle email
    private int InserisciEmail(){
        collezioneEmail.add(this.emailAddress);
        userId=numeroEmail;
        numeroEmail++;
        System.out.println("email dell'utente "+this.nome+" con id: "+ userId + " inserita con successo");
        return 0;
      }
}

