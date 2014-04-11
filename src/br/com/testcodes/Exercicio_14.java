package br.com.testcodes;

import java.util.Scanner;

public class Exercicio_14 {
    public static void main (String []args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o número que deseja saber se é primo: ");
        int numeroDigitado = entrada.nextInt();
        for (int i = 2; i <= numeroDigitado; i++) {
         if (numeroDigitado % i == 0) {  
                  System.out.println("O número digitado não é primo!");  
                  break;
         }else{
             System.out.println("O número digitado é primo!");}
             break;
         
        }
        }
    
}


