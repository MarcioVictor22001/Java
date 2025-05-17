package src.main.java;

import java.util.Scanner;

public class AdivinharNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = 5;
        int guess = -1;

        while (guess != number){
            System.out.println("Digite um numero:");
            guess = sc.nextInt();
        }

        System.out.println("Correto a resposta");

    }
}
