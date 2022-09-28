
package persona;

/**
 *La classe Persona definisce alcune caratteristiche e comportamenti di un essere umano 
 * @author simone.siviero
 * @version  28/09/2022
 */
public class Persona {
    public Double altezza;
    public String cognome;
    public String dataDiNascita;
    public String mome;
    public Float peso;
    /** 
     * Costruttore della classe Persona senza parametri per impostare i
     * parametri si possono usare i seguenti metodi:
     * {@link #setAltezza(Double altezza) } <br>
     * {@link #setCognome(String cognome) } <br>
     * {@link #setMome(String mone) } <br>
     * {@link #setPeso(Float Peso) } <br>
     * {@link #setDataDiNascita(java.lang.String) (String dataDiNascita) } <br>
     * 
     */

    public Persona() {
    }
    /**
     * Costruttore della classe Persona parametri
     * 
     * @param altezza
     * @param cognome
     * @param dataDiNascita
     * @param mome
     * @param peso 
     */

    public Persona(Double altezza, String cognome, String dataDiNascita, String mome, Float peso) {
        this.altezza = altezza;
        this.cognome = cognome;
        this.dataDiNascita = dataDiNascita;
        this.mome = mome;
        this.peso = peso;
    }
    /**
     * restituisce l'altezza della Persona
     * 
     * @return altezza
     */

    public Double getAltezza() {
        return altezza;
    }
    /**
     * Imposta l'altezza della Persona
     * @param altezza  Altezza
     */

    public void setAltezza(Double altezza) {
        this.altezza = altezza;
    }
    /**
     * Restituisce il Cognome della Persona
     * 
     * @return cognome
     */

    public String getCognome() {
        return cognome;
    }
    /**
     * Imposta il Cognome della Persona
     * 
     * @param cognome Cognome
     */

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    /**
     * Restituisce la data di nascita della Persona
     * 
     * @return dataDiNascita
     */

    public String getDataDiNascita() {
        return dataDiNascita;
    }
    /**
     * Imposta la data di nasciita della Persona
     * 
     * @param dataDiNascita Data di nascita
     */

    public void setDataDiNascita(String dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }
    /**
     * Restituisce il nome della Persona
     * 
     * @return nome
     */

    public String getMome() {
        return mome;
    }
    /**
     * imposta il nome della Persona
     * 
     * @param mome  Mome
     */

    public void setMome(String mome) {
        this.mome = mome;
    }
    /**
     * Restituisce il peso della Persona
     * 
     * @return peso
     */

    public Float getPeso() {
        return peso;
    }
    /**
     * Imposta il peso della Persona
     * 
     * @param peso Peso
     */

    public void setPeso(Float peso) {
        this.peso = peso;
    }
    /**
     * Restituisce le caratteristivhe della Persona
     * 
     * @return Riepilogo caratteristiche
     */
     
    public String info(){
        String info ;
       info= "cognome             :"+this.cognome       +"\n"
           + "nome                :"+this.mome          +"\n"
           + "altezza             :"+this.altezza       +"\n" 
           + "peso                :"+this.peso          +"\n"
           + "data di nascita     :"+this.dataDiNascita +"\n";
       
           
        
        return info;
    }
    
    
}
