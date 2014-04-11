package br.com.testcodes;

import java.util.Scanner;

public class Exercicio_16 {
    public static void main (String []args) {
        Scanner entrada = new Scanner(System.in);
        int tamanho;
        System.out.println("Defina o tamanho da lista: ");
        tamanho = entrada.nextInt();
        int lista[] = new int [tamanho];
        
        System.out.println("Digite uma sequência de "+tamanho+" números.");
        for (int i = 0; i < tamanho; i++){
            lista[i] = entrada.nextInt();
        }
        for (int i = tamanho-1; i >= 0; i--){
            System.out.println(lista[i]);
        }
        
    }

}

