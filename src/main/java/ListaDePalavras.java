package src.main.java;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDePalavras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> listaDePalavras =new ArrayList<>();

        System.out.println("Tamanho da lista:");

        int tamanhoLista = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < tamanhoLista; i++){
            System.out.println((i + 1) + " - Palavra:");
            String palavra = sc.nextLine();
            listaDePalavras.add(palavra);
        }
        System.out.println(listaDePalavras);



    }
}
