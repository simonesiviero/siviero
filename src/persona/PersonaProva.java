
package persona;

/**
 *
 * @author simone.siviero
 */
public class PersonaProva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p=new Persona();
        Persona p2= new Persona(1.80, "cognome", "28/09/2022","simone", 74f);
        
        String info = p2.info();
        System.out.println(info);
    }
    
}
