/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sintaxe;
import java.util.Scanner;
/**
 *
 * @author Cauã
 */
public class TabuadaInterativa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro para ver a tabuada: ");
        int numero = scanner.nextInt();

        int i = 1;
        while (i <= 10) {
            int resultado = numero * i;
            System.out.println(numero + " * " + i + " = " + resultado);
            i++;
        }

        scanner.close();
    }
}
