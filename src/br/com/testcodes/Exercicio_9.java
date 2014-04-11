package br.com.testcodes;

import java.util.Scanner;

public class Exercicio_9 {
    public static void main (String []args) {
        Scanner entrada = new Scanner(System.in);
        int i, n;
        double x, y;
        
        System.out.println("Digite o numero de pontos: ");
        n = entrada.nextInt();
        
        for (i = 0; i < n; i++){
            System.out.println("Digite as coordenadas de um ponto: ");
            x = entrada.nextInt();
            y = entrada.nextInt();
            if (x >= 0 && y >= 0 && (x*x + y*y <= 1)){
                System.out.println("O ponto "+x+","+y+" pertence a região.");
            }else{
                System.out.println("O ponto "+x+","+y+" não pertence a região.");
            }
            
        }
    }
}