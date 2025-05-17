package src.main.java;

import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valor1, valor2, resultado;
        int operador;
        System.out.println("Digite o primeiro valor:");

        valor1 = sc.nextDouble();

        System.out.println("Digite o segundo valor:");
        valor2 = sc.nextDouble();

        System.out.println("Digite o operador:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtrcao");
        System.out.println("3 - Multiplicacao");
        System.out.println("4 - Divisao");
        operador = sc.nextInt();

        switch (operador){
            case 1:
                    resultado = valor1 + valor2;
                    System.out.println("Resultado: " + resultado);
            break;
            case 2:
                    resultado = valor1 - valor2;
                    System.out.println("Resultado: " + resultado);
            break;
            case 3:
                    resultado = valor1 * valor2;
                    System.out.println("Resultado: " + resultado);
            break;
            case 4:
                    resultado = valor1 / valor2;
                    System.out.println("Resultado: " + resultado);
            break;
            default:
                System.out.println("Verifique se está tudo correto!");
        }

    }
}
