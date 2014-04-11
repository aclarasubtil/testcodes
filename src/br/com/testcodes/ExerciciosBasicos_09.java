package br.com.testcodes;

import java.util.Scanner;

public class ExerciciosBasicos_09 {
    
        public static void main(String args[]) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite um número de quatro dígitos: ");
            int numeroInverte = entrada.nextInt();     
            int numeroInvertido = 0;
            
            
            /* Enquanto (123456789 > 0) Faca */  
            /* No proximo while sera */  
            /* Enquanto (12345678 > 0) Faca */  
            /* Quando terminar a ultima divisão ou seja numeroInverte = 1 / 10 = 0, o  contador para */    
            while (numeroInverte > 0) {
                /* Inicia com numeroInvertido 0 = 0 x 10 = 0 */  
                /* No proximo while numeroInvertido sera  
                /* 9 x 10 = 90 */  
                numeroInvertido = numeroInvertido *10; 
                /* numeroInvertido recebe 0 = 0 + (%) Resto da Divisão  numeroInverte 0 */  
                /* (%) Retorna o resto de uma divisão por um numero no caso acima 10: 
                /* 123456789 / 10 = 12345678 e Seu resto 123456789 % 10 = 9, */  
                /* No proximo while sera  
                /* 12345678 / 10 = 1234567 e Seu resto 12345678 % 10 = 8, */  
                /*     0       =      0         + (       9          )*/   
                numeroInvertido = numeroInvertido + (numeroInverte % 10);     
                /* 123456789 = 123456789 / 10 - numeroInverte passa a valer 12345678 */  
                /* No proximo while   
                /* 12345678 = 12345678 / 10 - numeroInverte passa a valer 1234567 */  
                numeroInverte = numeroInverte / 10;     
        }  
            /* Mostra o resultado da inversao de numeros */  
            System.out.println(numeroInvertido);     
    }     
}  
        
