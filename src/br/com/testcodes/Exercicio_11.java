package br.com.testcodes;

import java.util.Scanner;

public class Exercicio_11 {
    public static void main (String []args) {
        Scanner entrada = new Scanner(System.in);
        double soma;
        int i, n;
        
        System.out.println("Digite o valor de n: ");
        n = entrada.nextInt();
        
        soma = 0;
        
        for (i = 0; i < n; i++){
            soma = soma + (1+i)/(n-i);
            }
        System.out.println("Valor da soma = "+soma);
     
        }
}