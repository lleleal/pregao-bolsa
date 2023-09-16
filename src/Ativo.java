public class Ativo extends Acao {

    private int cotas;
    private Corretora corretora;

    public Ativo(String nome, double preco, int cotas, Corretora corretora) {
        super(nome, preco);
        this.cotas = cotas;
        this.corretora = corretora;
    }

    @Override
    public double calcularValor() {
        return getPreco() * cotas;
    }

    public Corretora getCorretora() {
        return corretora;
    }

    public void setCotas(int cotas) {
        this.cotas = cotas;
    }

    public void setLocal(Corretora corretora) {
        this.corretora = corretora;
    }
}
