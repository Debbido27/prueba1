/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba1_david_medina_22141094;

public class Email {
String correoE;
String asunto;
String contenido;
boolean leido;


public Email (String correoE, String asunto, String contenido){
    this.correoE=correoE;
    this.asunto=asunto;
    this.contenido=contenido;
    this.leido=false;
}

    public String getCorreoE() {
        return correoE;
    }

    public void setCorreoE(String correoE) {
        this.correoE = correoE;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public boolean isLeido() {
        return leido;
    }

    public void setLeido(boolean leido) {
        this.leido = leido;
    }

    
    public void marcarLeido(){
        this.leido=true;
    }

    
    public void impresion(){
        System.out.print("De: <"+correoE+">");
        System.out.print("ASUNTO: <"+asunto+">");
        System.out.println("<"+contenido+">");
        
    }

    
}

