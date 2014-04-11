package br.com.testcodes;

import java.util.Scanner;

public class Exercicio_1 {
    public static void main (String []args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        for (int i = 0; i < 10; i++){
            System.out.println("Digite o número que deseja saber o quadrado, digite zero para sair.");
        numero = entrada.nextInt();
        if (numero == 0){
            System.out.println("Você digitou zero, o programa encerrou.");
            break;
        }
        System.out.println("O quadrado de "+numero+" é "+numero * numero);
        }
        
        
    }
}