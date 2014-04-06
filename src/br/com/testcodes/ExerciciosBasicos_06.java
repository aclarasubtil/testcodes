package br.com.testcodes;

public class ExerciciosBasicos_06 {

    public static void main(String[] args) {
        int x = 10;
        while (x < 30) {
            System.out.println(x);
            x ++; // Isso é um incremento, significa que cada vez que o laço while chegar aqui a variável x  receberá mais um. É o mesmo que x = x + 1.
        }
        // Transformando em do-while
        System.out.println("Tranformando em do-while");
        do {
            System.out.println(x);
            x ++;
        }
        while (x < 50);
    }
    
}
