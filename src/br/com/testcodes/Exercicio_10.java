package br.com.testcodes;

import java.util.Scanner;

public class Exercicio_10 {
    public static void main (String []args) {
        Scanner entrada = new Scanner(System.in);
        int n, i, aprovados = 0, reprovados = 0;
        double nota1, nota2, nota3, media, mediaDaClasse = 0.0;
        
        System.out.println("Digite o número de alunos: ");
        n = entrada.nextInt();
        for (i = 1; i <= n; i++) {
            System.out.println("Digite as 3 notas do aluno: "+i);
            nota1 = entrada.nextInt();
            nota2 = entrada.nextInt();
            nota3 = entrada.nextInt();
            
            media = (nota1 + nota2 + nota3) / 3;
            System.out.println("A média do aluno "+i+" foi "+media);
            
            mediaDaClasse = mediaDaClasse + media;
            if (media >= 5.0){
                aprovados = aprovados + 1;
            }else{
                reprovados = reprovados + 1;
            }
        }
            mediaDaClasse = mediaDaClasse / n;
            
            System.out.println("O número de alunos aprovados foi "+aprovados);
            System.out.println("O número de alunos reprovados foi "+reprovados);
            System.out.println("A média da classe foi "+mediaDaClasse);
        }
    }
