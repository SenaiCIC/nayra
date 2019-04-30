
package aula07;

import java.util.Scanner;


public class CondicionalCasee {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("tecle umnúmero de 1 á 7: ");
        int dia = sc.nextInt();
        String dsemana;
        switch (dia) {
            case 1: 
                dsemana = "domingo";
                break;
                
            case 2:
                dsemana = "segunda";
                break;
                
            case 3:
                dsemana = "terça";
                break;
                
            case 4:
                dsemana = "quarta";
                break;
                
            case 5:
                dsemana = "quinta";
                break;
                
            case 6:
                dsemana = "sexta";
                break;
                
            case 7:
                dsemana = "sabado";
                break;
                
            default:
                dsemana = "número invalido";
        }
        System.out.println(dsemana);
       
    }
    
}
