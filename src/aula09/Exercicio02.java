
package aula09;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
        System.out.println("Quantos números você deseja somar?");
        int quant = sc.nextInt();
        double res = 0;
        int c = 0;
        while (c<quant) {
         System.out.println("digite o "+(c+1)+"número");
        double r = sc.nextDouble();
        res = r+res;
        c++;
        }
       System.out.println("a soma é"+res);
    }
}
