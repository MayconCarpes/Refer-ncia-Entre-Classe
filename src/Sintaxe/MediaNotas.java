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
public class MediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de alunos da turma: ");
        int numAlunos = scanner.nextInt();
        // Cria um vetor para armazenar as notas dos alunos
        double[] notas = new double[numAlunos];

        for (int i = 0; i < numAlunos; i++) {
            System.out.println("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / numAlunos;
        System.out.println("A média das notas da turma é: " + media);
        scanner.close();
    }
}
