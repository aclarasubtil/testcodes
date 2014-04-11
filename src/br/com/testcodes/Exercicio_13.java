package br.com.testcodes;

import java.util.Scanner;

public class Exercicio_13 {
    public static void main (String []args) {
        Scanner entrada = new Scanner(System.in);
        int lista[] = new int [50];
        int totalImpares = 0;
        System.out.println("Entre com 50 numeros: ");
        
        for(int i=0; i<lista.length; i++) {
            lista[i] = entrada.nextInt();
            }
        
        for(int i=0; i<lista.length; i++) {
            if (lista[i]%2!=0) {
                System.out.println("O numero "+lista[i]+" é ímpar!");
                totalImpares++;
            }
            
            }
        System.out.println("No total foram "+totalImpares+" números ímpares.");
        }
    
}


