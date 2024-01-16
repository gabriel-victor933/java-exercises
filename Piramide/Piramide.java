package Piramide;

import java.util.Scanner;

public class Piramide {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira um numero");
        int x = input.nextInt();
        String message = "";
        for(int i = 1; i <= x; i++){
            message="";
            for(int j = 1; j <= i; j++){
                message += Integer.toString(i);
            }
            System.out.println(message);
        }

        input.close();
    }
}
