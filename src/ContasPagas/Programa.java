package contasPagas;

public class Programa {
    public static void main(String[] args) {
        // Instanciando objetos Cliente
        Cliente cliente1 = new Cliente("João", "123.456.789-10");
        Cliente cliente2 = new Cliente("Maria", "987.654.321-00");

        // Instanciando objetos Produto
        Produto produto1 = new Produto("Notebook", 2500.0);
        Produto produto2 = new Produto("Smartphone", 1500.0);

        // Instanciando objetos Conta
        Conta conta1 = new Conta(1, "01/02/2024", "01/02/2024", produto1, cliente1);
        Conta conta2 = new Conta(2, "15/02/2024", "15/02/2024", produto2, cliente2);

        // Visualizando contas
        System.out.println("Conta 1:");
        conta1.visualizarConta();
        System.out.println("\nConta 2:");
        conta2.visualizarConta();
    }
}
