/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.testcodes;

/**
 *
 * @author clarinha
 */
public class Programa {
    public static void main (String []args) {
        Funcoes func=new Funcoes ();
        
        // Teste Exercício 1
        double resultado_valor_prestacao = func.valor_pretacao(15000);
        System.out.println(resultado_valor_prestacao);        
        
        double resultado_valor_prestacao_2 = func.valor_pretacao_2(1000, 10);
        System.out.println(resultado_valor_prestacao_2);
        
        
        // Teste Exercício 2
        String compensa = func.valor_combustivel(100, 90);
        System.out.println(compensa);
        
        
        // Teste Exercício 3
        double resultado_media = func.calculaMedia(100, 10);
        System.out.println(resultado_media);
        
        double resultado_soma=func.calculaSoma(3,5);
        System.out.println(resultado_soma);
        
        double resultado_multiplicacao = func.calculaMultiplicacao(100, 10);
        System.out.println(resultado_multiplicacao);
        
           
        // Teste Exercício 4
        double preco_carro = func.valor_carro(1000);
        System.out.println(preco_carro);
        
        
        // Teste Exercício 5
        double valor_conta = func.conta_final(1, 1, 1, 1, 1);
        System.out.println(valor_conta);
        
        
        // Teste Exercício 6
        double soma_fracao = func.soma_fracao(3);
        System.out.println(soma_fracao);
       
    }
}
    
