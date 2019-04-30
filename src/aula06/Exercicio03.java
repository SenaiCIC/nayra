
 
package aula06;

import java.util.Scanner;


 
public class Exercicio03 {
    public static void main(String[] args) {
        try ( // condicionais
                Scanner sc = new Scanner (System.in)) {
            System.out.println("digite um número inteiro");
            int num = nextInt();
            int res = num%2;
            if (res==0){
                System.out.println("o número é par");
            } else {
                System.out.println("o número é impar");
            }
        }
        
       
                
    }

    private static int nextInt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
