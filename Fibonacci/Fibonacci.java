package Fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        int number1 = 0;
        int number2 = 1;
        System.out.println("Insira o tamanho da sequencia:");
        x = input.nextInt();

        System.out.print(number1 + " ");
        while(x - 1 > 0){
            System.out.print(number2 + " ");
            x--;
            int temp = number1;
            number1 = number2;
            number2 += temp;
        }
        input.close();
    }


}