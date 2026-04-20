
package prueba1_david_medina_22141094;

public class EmailAccount {
    String address;
    String password;
    String nombreCompleto;
    Email [] inbox;
   
    public EmailAccount(String address, String password, String nombreCompleto){
        this.address=address;
        this.password=password;
        this.nombreCompleto=nombreCompleto;
        this.inbox=new Email[100];
    }
    
    
    
}
