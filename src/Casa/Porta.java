package casa;

public class Porta {
    private boolean aberta;
    private String cor;
    private double dimensaoX;
    private double dimensaoY;
    private double dimensaoZ;

    public Porta() {
        this.aberta = false;
        this.cor = "branco";
        this.dimensaoX = 0.8; // Valores padrão para dimensões
        this.dimensaoY = 2.0;
        this.dimensaoZ = 0.1;
    }

    public void abre() {
        this.aberta = true;
    }

    public void fecha() {
        this.aberta = false;
    }

    public void pinta(String cor) {
        this.cor = cor;
    }

    public boolean estaAberta() {
        return this.aberta;
    }
}
