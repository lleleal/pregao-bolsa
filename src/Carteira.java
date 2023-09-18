import estruturadedados.Lista;

public class Carteira {
    private Lista<Ativo> ativos;
    private Lista<Historico> historico;

    public Carteira() {
        ativos = new Lista<>();
        historico = new Lista<>();
    }
    public Lista<Ativo> getAtivos() {
        return ativos;
    }
    public Lista<Historico> getHistorico() {
        return historico;
    }
    
    public void addTransacao(Historico historico){
        this.historico.add(historico);
        ativos.add(historico.getAtivo());
    }
}
