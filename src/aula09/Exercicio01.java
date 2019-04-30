
package aula09;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("digite um número");
        double x = sc.nextDouble();
        while (x>=0) {
            double res = Math.sqrt(x);
            System.out.printf("%.3f%n", res);
            System.out.println("digite um número");
            x = sc.nextDouble();
      }
        System.out.println("numero negativo");
    }
}

