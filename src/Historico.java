public class Historico {
    private Ativo ativo;
    private int quantidade;
    private float valor;

    public Historico() {
    }

    public Historico(Ativo ativo, int quantidade, float valor, int tipo) {
        this.ativo = ativo;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public Ativo getAtivo() {
        return ativo;
    }
    public void setAtivo(Ativo ativo) {
        this.ativo = ativo;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
}
