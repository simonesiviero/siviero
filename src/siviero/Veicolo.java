package siviero;

/**
 * la classe veicolo descrive le caratteristiche e 
 * il comportamento di un veicolo generico
 * 
 * @author simone.siviero 3INC
 * 
 */
public class Veicolo {
    public String   colore;
    private Integer nMarce;
    private Boolean isAutomatico;
    public Float    velocita=0f;
    private Integer velocitaMax;
    public Integer  cavalli;
    
    
   /**
    * costruttore senza parametri
    */

    public Veicolo() {
    }
    /**
     * costruttore con parametri
     * @param colore
     * @param nMarce
     * @param isAutomatico
     * @param velocitaMax
     * @param cavalli 
     */

    public Veicolo(String colore, Integer nMarce, Boolean isAutomatico, 
                                         Integer velocitaMax, Integer cavalli) {
        this.colore       = colore;
        this.nMarce       = nMarce;
        this.isAutomatico = isAutomatico;
        this.velocitaMax  = velocitaMax;
        this.cavalli      = cavalli;
        
    }
    /**
     * restituisce il colore del veicolo 
     * @return colore
     */

    public String getColore() {
        return colore;
    }
    
    /**
     * imposta il colore del veicolo 
     * @param colore 
     */
    
    public void setColore(String colore) {
        this.colore = colore;
    }

    public Integer getnMarce() {
        return nMarce;
    }
    
    public void setnMarce(Integer nMarce) {
        this.nMarce = nMarce;
    }

    public Boolean getIsAutomatico() {
        return isAutomatico;
    }
    
    public void setIsAutomatico(Boolean isAutomatico) {
        this.isAutomatico = isAutomatico;
    }

    public Float getVelocita() {
        return velocita;
    }
    
    public void setVelocita(Float velocita) {
        this.velocita = velocita;
    }

    public Integer getVelocitaMax() {
        return velocitaMax;
    }
    
    public void setVelocitaMax(Integer velocitaMax) {
        this.velocitaMax = velocitaMax;
    }

    public Integer getCavalli() {
        return cavalli;
    }
    
    public void setCavalli(Integer cavalli) {
        this.cavalli = cavalli;
    }
    
    /**
     * Inserire la marcia desiderata
     * @param nMarcia
     * @return Boolean
     */
    
    
    public Boolean cambiaMarcia(Integer nMarcia){
    
        return true;
    }
    
    /**
     * Inserire la velocita desiderata
     * @param velocita 
     */
    
    public void  accelera(Float velocita){
        
    }
    
    /**
     * stampa le caratteristiche dell'oggetto
     * @return 
     */
    
    public String info(){
      return null;  
    }

}
