/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sintaxe;

/**
 *
 * @author Cauã
 */
public class VerificacaoNumerosPares {
     public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            // Verifique se cada número é par
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
