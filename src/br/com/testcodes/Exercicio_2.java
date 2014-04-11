package br.com.testcodes;

import java.util.Scanner;

public class Exercicio_2 {
    public static void main (String []args) {
        Scanner entrada = new Scanner(System.in);
        int soma = 0;
        int i = 1;
        System.out.println("Digite o número que deseja saber seus inteiros antecessores: ");
        int n = entrada.nextInt();
        while (i < n) {
            soma = soma + i;
            i = i + 1;
        }
        System.out.println("A soma do inteiros antecessores de "+n+" é "+soma);
  }
}
        