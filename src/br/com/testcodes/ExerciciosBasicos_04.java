
package br.com.testcodes;

import java.util.Scanner;

public class ExerciciosBasicos_04 {
    public static void main(String[] args) {
        // Exercício 03
        Scanner entrada = new Scanner(System.in); // Esse é o Sacanner que captura dados do teclado. Para utilizá-lo é preciso importar a classe java.util.Scanner
        int dia_da_semana = 1;
        while (dia_da_semana != 0) {
            System.out.println("Digite um número: "); // Perguntamos um número...o programa vai esperar até o usuário digitar alguma coisa.
            dia_da_semana = entrada.nextInt(); // Aqui que o Scanner que criamos acima efetua a captura do teclado e atribui seu valor a variavel dia_da_semana.
            switch(dia_da_semana){
                case 1:
                    System.out.println("Domingo");
                    break;
                case 2:
                    System.out.println("Segunda");
                    break;
                case 3:
                    System.out.println("Terça");
                    break;
                case 4:
                    System.out.println("Quarta");
                    break;
                case 5:
                    System.out.println("Quinta");
                    break;
                case 6:
                    System.out.println("Sexta");
                    break;
                case 7:
                    System.out.println("Sábado");
                    break;
                default:
                System.out.println("É necessário digitar um número entre 1 e 7 ou 0 para sair.");
                    System.out.println("Digite um número: "); // Perguntamos um número...o programa vai esperar até o usuário digitar alguma coisa.
                    }
            }
        System.out.println("Você digitou zero, o programa foi terminado!");
        
    }
    
}
