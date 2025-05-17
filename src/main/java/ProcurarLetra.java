package src.main.java;

import java.util.Scanner;

public class ProcurarLetra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] letras = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        System.out.println("Digite a letra");
        char letraEscolhida = sc.nextLine().toLowerCase().charAt(0);

        boolean letraEncontrada = false;
        for (char letra : letras){
            if (letra == letraEscolhida){
                letraEncontrada = true;
                break;
            }
        }

        if (letraEncontrada){
            System.out.println("Letra: "+letraEscolhida);
        }else {
            System.out.println("ERROR");
        }
    }
}
