package casa;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void fazAniversario() {
        this.idade++;
    }

    public void mostraNomeEIdade() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
