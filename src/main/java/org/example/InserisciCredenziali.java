package org.example;
public class InserisciCredenziali extends CollezioneEmail {
    private int userId;
    private String emailAddress;
    private String nome;
    private String cognome;
    private String sesso;
    private int età;

    //metodo utilizzato dal personale per partecipare all'estrazione di persona piu' simpatica del tea
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

