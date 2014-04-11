package br.com.testcodes;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ExerciciosBasicos_11 {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o salário integral do funcionário: ");
        double salarioIntegral = entrada.nextDouble();
        System.out.println("Digite o total de dias trabalhados pelo funcionário: ");
        int diasTrabalhados = entrada.nextInt();
        double salarioRecebido = salarioIntegral / 22 * diasTrabalhados;
        DecimalFormat limitaCasaDecimal = new DecimalFormat("0.00");
        System.out.println("O salário a ser recebido pelo funcionário é de R$ "+(limitaCasaDecimal.format(salarioRecebido)));
    }
}     
    
