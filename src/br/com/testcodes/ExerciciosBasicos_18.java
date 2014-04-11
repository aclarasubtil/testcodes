package br.com.testcodes;


public class ExerciciosBasicos_18 {
    public static void main(String args[]) {
        double capital = 100.00;
        int ct = 0;
        
        while (capital <= 200.00) {
            capital += (capital * 0.05);
            ct++; // conta o nro de execuções, ou seja, o nro de meses necessários
            }
        
        System.out.println("Em " + (ct / 12) + " anos e " + (ct % 12) + " meses.");
        System.out.println("O capital de R$ 100.00 investido sera de R$ " + capital);
  }
 
}