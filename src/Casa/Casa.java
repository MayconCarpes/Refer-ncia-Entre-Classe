package casa;

public class Casa {
    private String cor;
    private Porta porta1;
    private Porta porta2;
    private Porta porta3;

    public Casa(String cor) {
        this.cor = cor;
        this.porta1 = new Porta();
        this.porta2 = new Porta();
        this.porta3 = new Porta();
    }

    public void pinta(String cor) {
        this.cor = cor;
    }

    public int quantasPortasEstaoAbertas() {
        int cont = 0;
        if (porta1.estaAberta()) cont++;
        if (porta2.estaAberta()) cont++;
        if (porta3.estaAberta()) cont++;
        return cont;
    }
}
