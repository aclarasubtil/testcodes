package br.com.testcodes;

import java.util.Scanner;
import java.util.Calendar;

public class Exercicio_12 {
    public static void main (String []args) {
        Scanner entrada = new Scanner(System.in);
        // Data inicial
        Calendar dataInicio = Calendar.getInstance();
        // Atribui a data de 10/FEV/2008
        dataInicio.set(1983, Calendar.MARCH, 27);
        // Data de hoje
        Calendar dataFinal = Calendar.getInstance();
        // Calcula a diferença entre hoje e da data de inicio
        long diferenca = dataFinal.getTimeInMillis() -
                         dataInicio.getTimeInMillis();
        // Quantidade de milissegundos em um dia
        int tempoDia = 1000 * 60 * 60 * 24;
        long diasDiferenca = diferenca / tempoDia;
        System.out.println("Entre a data inicial e final são " +
                            diasDiferenca + " dias de diferença.");
    }
}
