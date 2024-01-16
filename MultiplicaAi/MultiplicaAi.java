package MultiplicaAi;

import java.util.Scanner;

public class MultiplicaAi {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira um numero");
        int x = input.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(x + " * " + i + " = " + x*i);
        }
        input.close();
    }
}
