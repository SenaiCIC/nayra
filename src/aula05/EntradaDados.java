
package aula05;

import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
         System.out.println("digite um número inteiro");   
         int x = sc.nextInt();
            System.out.println(x);
            System.out.println("você digitou o número:"
            +x);
            
        sc.close();
    }
}

