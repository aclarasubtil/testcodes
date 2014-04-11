// Os métodos são testados no arquivo "Programa.java"
package br.com.testcodes;

/**
 *
 * @author clarinha
 */
public class Funcoes {

    // Exercício 1 (parte 1)
    double valor_pretacao(double num1) {
        double result = num1 / 15;
        return result;

    }

    //Exercício 1 (parte 2)
    double valor_pretacao_2(double num1, double num2) {
        double result = num1 / num2;
        return result;

    }

    // Exercício 2
    String valor_combustivel(double num1, double num2) {
        double porcentagem = num1 * (70.0 / 100.0);
        String a = "Compensa comprar Gasolina";
        String b = "Compensa comprar Etanol";

        if (porcentagem > num2) {
            return b;
        } else {
            return a;
        }

    }

    // Exercício 3 (parte 1)
    double calculaMedia(double num1, double num2) {
        double result = (num1 + num2) / 2;
        return result;

    }

    // Exercício 3 (parte 2)
    double calculaSoma(double num1, double num2) {
        double result = num1 + num2;
        return result;

    }

    // Exercício 3 (parte 3)
    double calculaMultiplicacao(double num1, double num2) {
        double result = num1 * num2;
        return result;

    }

    // Exercício 4
    double valor_carro(double num1) {
        double porcentagem_distribuidor = num1 * (12.0 / 100.0);
        double porcentagem_impostos = num1 * (45.0 / 100.0);
        double preco_final = num1 + porcentagem_distribuidor + porcentagem_impostos;
        return preco_final;

    }

    // Exercício 5
    double conta_final(double num1, double num2, double num3, double num4, double num5) {
        double valor_hamburguer = num1 * 3.30;
        double valor_cheeseburguer = num2 * 2.50;
        double valor_fritas = num3 * 2.50;
        double valor_refrigerante = num4 * 1.00;
        double valor_milkshake = num5 * 3.00;
        double conta_final = valor_hamburguer + valor_cheeseburguer + valor_fritas + valor_refrigerante + valor_milkshake;
        return conta_final;

    }
    
    // Exercício 6
    double soma_fracao (double controle) {
        double denominador = 1;
        double soma = 0;
        for (int i = 0; i < controle; i++) {
            soma = soma + (1 / denominador);
            denominador = denominador +1;
            }
        return soma;
    }
}
