package br.com.testcodes;

import java.util.Scanner;

public class Exercicio_4 {
    public static void main (String []args) {
        Scanner entrada = new Scanner(System.in);
        int n, contador = 2, fatorial = 1;
        System.out.println("Digite um inteiro nao-negativo: ");
        n = entrada.nextInt();
        
        while (contador <= n) {
            fatorial = fatorial * contador;
            contador = contador + 1;
            }
        System.out.println("O valor de "+n+" é "+fatorial);
        
        }
    }

        