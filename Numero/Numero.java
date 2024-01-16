package Numero;

import java.util.Scanner;

public class Numero {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String odd;
        String positive;

        System.out.println("Insira um numero:");
        int number = input.nextInt();

        if(number % 2 == 0){
            odd = "par";
        } else {
            odd="impar";
        }

        if(number < 0){
            positive = "negativo.";
        } else {
            positive = "positivo.";
        }

        System.out.println(number + " é " + odd + " e " + positive);
        input.close();
    }
}