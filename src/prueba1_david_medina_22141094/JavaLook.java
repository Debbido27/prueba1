/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba1_david_medina_22141094;

import java.util.Scanner;
public class JavaLook {
    private static EmailAccount[] cuentas=new EmailAccount[100];
    private static EmailAccount cuentaActiva = null;
    private static Scanner entrada = new Scanner (System.in);
    
  
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        do{
            System.out.println("Menu principal");
            System.out.println("1.Login");
            System.out.println("2.Crear cuenta");
            System.out.println("0. Salir");
            System.out.println("Opcion: ");
            opcion=entrada.nextInt();
            
            switch (opcion){
                case 1:
                    
                    break;
                    
                case 2:
                    
                    break;
                    
                case 0:
                    
                    break;
                    
                    
                default:
                    
                    break;
                    
            }
        }while(opcion !=0);
    }
    
}
