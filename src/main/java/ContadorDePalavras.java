package src.main.java;

import java.util.Scanner;

public class ContadorDePalavras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String texto;
        System.out.println("Digite uma palavra:");
        int quantidadeDePalavras = 0;

        texto = sc.nextLine();
        quantidadeDePalavras +=texto.split(" ").length;

        System.out.println(quantidadeDePalavras);
    }
}
