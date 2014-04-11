package br.com.testcodes;

public class ExerciciosBasicos_08 {
    
    public static void main(String[] args) {
        EXTERNO:
        for(int i = 0; i <= 10; i++){
            for(int j = 0; j <= 10; j++){
                if(i == j){
                    continue EXTERNO;  
            }  
            System.out.println("i = "+i);  
            System.out.println("J = "+j);  
            System.out.println("\n");
            }
        }  
    }
}

                 
   
  
