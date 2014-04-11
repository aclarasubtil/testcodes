package br.com.testcodes;

import java.util.Scanner;

public class Exercicio_3 {
    public static void main (String []args) {
        Scanner entrada = new Scanner(System.in);
        double n, nota = 0, contador = 0, notaMaior = 0, notaMenor = 100;
        
        System.out.println("Entre com o numero de alunos: ");
        n = entrada.nextDouble();
        
        for (int i = 1; i <= n; i++) {
        System.out.println("Digite as notas(de 0 a 100) dos alunos: ");
        nota = entrada.nextDouble();
       
        if (notaMaior < nota){
            notaMaior = nota;
        }
        if (notaMenor > nota){
            notaMenor  = nota;
            }
                              
        }
        System.out.println("A maior nota obtida foi: "+notaMaior);
        System.out.println("A menor nota obtida foi: "+notaMenor);
    }
}
        