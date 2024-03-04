package banco;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("João", "Financeiro", 3000.0, "01/01/2020", "123456789");
        f1.mostra();

        System.out.println("\nApós bonificação:");
        f1.bonifica(500);
        f1.mostra();

        System.out.println("\nApós demissão:");
        f1.demite();
        f1.mostra();
    }
}
