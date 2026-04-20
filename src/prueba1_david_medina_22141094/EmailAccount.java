
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Email[] getInbox() {
        return inbox;
    }

    public void setInbox(Email[] inbox) {
        this.inbox = inbox;
    }
    
    
    public boolean recibirCorreo(Email email){
        for (int i = 0; i < inbox.length; i++) {
            if(inbox[i]==null){
                inbox[i]=email;
                return true;
            }
        }
        return false;
    }
    
    public void mostrarInbox(){
        System.out.println("===INBOX===");
        System.out.println("Cuenta :"+address);
        System.out.println("Usuario: "+nombreCompleto);
        System.out.println("========================");
        
        int total = 0;
        int sinLeer =0;
        
        for (int i = 0; i < inbox.length; i++) {
            if(inbox[i]!=null){
                String estado;
                
                if(inbox[i].isLeido()){
                    estado="Leido";
                }else{
                    estado="No leido";
                }
                
                System.out.println(i+"-"+inbox[i].getCorreoE()+"-"+inbox[i].getAsunto()+"-["+estado+"]");
                total++;
                
                if(!inbox[i].isLeido()){
                    sinLeer++;
                }
            }
        }
        
        System.out.println("--     --");
        System.out.println("Sin leer: "+sinLeer+" | Total: "+total); 
    }
    
    public void leercorreo(int pocision){
        if(pocision<0){
            System.out.println("numero no valido");
            return;
        }
        
        if(pocision>=inbox.length){
            System.out.println("Correo no existe");
            return;
        }
        
        if(inbox[pocision]==null){
            System.out.println("Correo no existe");
            return;
        }
        
        inbox[pocision].impresion();
        inbox[pocision].marcarLeido();
        
    }
    
    public void eliminarLeidos(){
        int eliminados=0;
        
        for (int i = 0; i < inbox.length; i++) {
            if(inbox[i]!=null){
                if(inbox[i].isLeido()){
                    inbox[i]=null;
                    eliminados++;
                }
            }
        }
        System.out.println(eliminados+"correos eliminados");
    }
    
}
