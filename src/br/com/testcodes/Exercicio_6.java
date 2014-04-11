package br.com.testcodes;

import java.util.Scanner;

public class Exercicio_6 {
    public static void main (String []args) {
        Scanner entrada = new Scanner(System.in);
        int num, num1 = 0, pot2 = 1, resultado = 0;
        
        System.out.println("Digite o numero a ser transformado da base 2 para a base 10: ");
        num = entrada.nextInt();
        num1 = num;
                
        while (num1 != 0){
            resultado = resultado + num1 % 10 * pot2; // processa um dígito binário.
            num1 = num1 / 10;
            pot2 = pot2 * 2;
        }
        System.out.println(num+" na base 10 é: "+resultado);
    }
}
