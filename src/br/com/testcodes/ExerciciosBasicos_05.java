package br.com.testcodes;

import java.util.Scanner;

public class ExerciciosBasicos_05 {
    public static void main(String[] args) {
        // Exercício 03
        Scanner entrada = new Scanner(System.in); // Esse é o Sacanner que captura dados do teclado. Para utilizá-lo é preciso importar a classe java.util.Scanner
        int mes = 1;
        while (mes != 0) {
            System.out.println("Digite um número: "); // Perguntamos um número...o programa vai esperar até o usuário digitar alguma coisa.
            mes = entrada.nextInt(); // Aqui que o Scanner que criamos acima efetua a captura do teclado e atribui seu valor a variavel dia_da_semana.
            switch(mes){
                case 1:
                    System.out.println("Janeiro");
                    break;
                case 2:
                    System.out.println("Fevereiro");
                    break;
                case 3:
                    System.out.println("Março");
                    break;
                case 4:
                    System.out.println("Abril");
                    break;
                case 5:
                    System.out.println("Maio");
                    break;
                case 6:
                    System.out.println("Junho");
                    break;
                case 7:
                    System.out.println("Julho");
                    break;
                case 8:
                    System.out.println("Agosto");
                    break;
                case 9:
                    System.out.println("Setembro");
                    break;
                case 10:
                    System.out.println("Outubro");
                    break;
                case 11:
                    System.out.println("Novembro");
                    break;
                case 12:
                    System.out.println("Dezembro");    
                    break;
                default:
                System.out.println("Mês inválido!");
                    System.out.println("Digite um número: "); // Perguntamos um número...o programa vai esperar até o usuário digitar alguma coisa.
                    }
            }
        System.out.println("Você digitou zero, o programa foi terminado!");
        
    }
    
}
