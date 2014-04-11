package br.com.testcodes;

import java.util.Scanner;

public class Exercicio_8 {
    public static void main (String []args) {
        Scanner entrada = new Scanner(System.in);
        double soma=0;
        int i;
        System.out.println("Entre com o valor do número maior que zero para saber seu número harmônico: ");
        int n = entrada.nextInt();
        for(i=1;i<=n;i++){
            soma=soma+1.0/i;
        }
        System.out.println("O número harmônico H"+n+" =  "+soma);
    }
}