package br.com.testcodes;

import java.util.Scanner;

public class ExerciciosBasicos_12 {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in); // Entrada do teclado
        int num1 = 0; // Inicializa variavel
        int num2 = 0;
        int soma = 0;
        
            do {
                System.out.println("Digite um numero diferente de 0: "); // Pedi para digitar um numero
                num1 = entrada.nextInt(); // Atribui o numero a variavel num
                if (num1 != 0){
                    num2 = num1;
                    }
                } while(num2 != 0) ; // Verifica se o numero é diferente de 0. Se pede para digitar outro numero, Senao sai do laço e exibe o numero.
            
            for (int i=1; i<num2; ++i){
                if (num2 % i == 0){
                    soma=soma+i;
                    }
                }
            if (num2 == soma && soma != 0){
                System.out.println("O número " + num1+ " é um numero perfeito.");
            
            }else{
            System.out.println("O número " + num1 + " não é um número perfeito.");
            }
        }
}    