package br.com.testcodes;

import java.util.Scanner;

public class ExerciciosBasicos_14 {
    
    public static void main (String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número a ser incrementado: ");
        int numero = entrada.nextInt();
        numero = numero + 1;
        System.out.println("Primeiro incremento.");
        numero ++;
        System.out.println("Segundo incremento.");
    }
}
// Não entendi bem esse, faltaram dois métodos de incremento que desconheço.