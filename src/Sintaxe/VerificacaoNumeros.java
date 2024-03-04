package Sintaxe;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Cauã
 */
public class VerificacaoNumeros {       
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        System.out.println("Digite o terceiro número inteiro: ");
        int numero3 = scanner.nextInt();

        int maior = numero1;
        if (numero2 > maior) {
            maior = numero2;
        }
        if (numero3 > maior) {
            maior = numero3;
        }

        System.out.println("O maior número é: " + maior);

        // Verifica se os números são positivos, negativos ou zero
        verificarNumero(numero1);
        verificarNumero(numero2);
        verificarNumero(numero3);

        scanner.close();
    }

    public static void verificarNumero(int numero) {
        if (numero > 0) {
            System.out.println(numero + " é positivo.");
        } else if (numero < 0) {
            System.out.println(numero + " é negativo.");
        } else {
            System.out.println(numero + " é zero.");
        }
    }
}

