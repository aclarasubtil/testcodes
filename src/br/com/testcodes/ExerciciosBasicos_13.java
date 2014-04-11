package br.com.testcodes;

import java.util.Scanner;

public class ExerciciosBasicos_13 {
    
    public static void main (String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: \n"+
                "1 – calcular o fatorial de um número dado\n" +
                "2 – calcular a raiz quadrada de 3 números dados\n" +
                "3 – imprimir a tabuada completa de 1 a 10\n"+
                "4 – sair do programa");
        int escolha = entrada.nextInt();
        switch(escolha){
                case 1:
                    System.out.println("Digite um número para calcular o fatorial: ");
                    double numero = entrada.nextDouble();// aqui criamos uma variável que irá armazenar o numero do fatorial
                    double numero2 = numero;
                    double fatorial = numero; // aqui criamos outra var. Será o resultado temporário da multiplicação
                    while (numero > 1){ // Enquanto x for menor que 1 faça o que está entre as chaves
                        fatorial = fatorial*(numero - 1); // A variável temporária ira receber o resultado da multiplicação dela, pelo valor de x menos 1
                        numero--; // aqui decrementamos o valor de x em um, no final do loop
                    }
                    System.out.println("O fatorial de "+numero2+" é: "+fatorial); // Esse comando imprime o valor de f. O último será o valor final do Fatorial.
                    break;
                case 2:
                    System.out.println("Digite o primeiro número para calcular a raiz quadrada: ");
                    double num1 = entrada.nextDouble();
                    System.out.println("Digite o segundo número para calcular a raiz quadrada: ");
                    double num2 = entrada.nextDouble();
                    System.out.println("Digite o terceiro número para calcular a raiz quadrada: ");
                    double num3 = entrada.nextDouble();
                    System.out.println("As raizes quadradas dos números são, respectivamente: "+Math.sqrt(num1)+", "+Math.sqrt(num2)+" e "+Math.sqrt(num3));
                    break;
                case 3:
                    for (int i = 1; i<=10; i++){
                        System.out.println ("Tabuada de: "+i);
                        for (int j = 1; j<=10; j++)
                            System.out.println (i+" x "+j+" = "+ i*j);
                    }
                    break;
                case 4:
                    System.out.println("Saindo do programa.");
                    break;
        
                    }
                                                         }
}