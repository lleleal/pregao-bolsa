import java.util.ArrayList; 

public class Investidor {

    private int cpf;
    private String nome;
    private double saldo;
    private ArrayList<Acao> carteira;

    public Investidor(int cpf, String nome, double saldo) {
        inicializarInvestidor(cpf, nome, saldo);
    }

    public Investidor(int cpf, String nome) {
        inicializarInvestidor(cpf, nome, 0.0);
    }

    private void inicializarInvestidor(int cpf, String nome, double saldoInicial) {
        this.cpf = cpf;
        this.nome = nome;
        this.saldo = saldoInicial;
        this.carteira = new ArrayList<>();
    }

    public void comprarAcao(Acao acao) {
        double valorAcao = acao.calcularValor();
        if (valorAcao > saldo) {
            throw new RuntimeException("Saldo insuficiente para a compra desta ação");
        }
        carteira.add(acao);
        saldo -= valorAcao;
    }

    public double calcularTotal() {
        double valorTotal = 0.0;
        for (Acao acao : carteira) {
            valorTotal += acao.calcularValor();
        }
        return valorTotal;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNome() {
        return nome;
    }

    public int getCpf() {
        return cpf;
    }
}