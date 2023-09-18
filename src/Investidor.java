import java.util.ArrayList;

import org.omg.PortableServer.POAPackage.AdapterAlreadyExistsHelper;

public class Investidor {

    private int id;
    private String nome;
    private double saldo;
    private Corretora corretora;
    private Carteira carteira;

    public Investidor(String nome, int id, Corretora corretora) {
        this.nome = nome;
        this.id = id;
        this.saldo = 0;
        this.corretora = corretora;
        this.corretora.getClientes().add(this);
    }

    public void transferir(double quantidade){
        if (quantidade <=0 ){
            throw new IllegalArgumentException();
        }
        saldo+=quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public Corretora getCorretora() {
        return corretora;
    }

    public double getSaldo() {
        return saldo;
    }

    public Carteira getCarteira() {
        return carteira;
    }

    public void setCarteira(Carteira carteira) {
        this.carteira = carteira;
    }

    public void comprarAcao(Ativo ativo, int quantidade) {
        double custoTotal = ativo.getValor() * quantidade;
        if (custoTotal <= saldo) {
            saldo -= custoTotal;
            Historico historico = new Historico(ativo, quantidade, (float) custoTotal, 0);
            corretora.getCarteira().addTransacao(historico);
            System.out.println(nome + " comprou " + quantidade + " ações da empresa " + ativo.getNome());
        } else {
            throw new IllegalArgumentException("Saldo insuficiente para comprar ações.");
        }
    }

    public void venderAcao(Ativo ativo, int quantidade) {
        if (quantidade < 0) {
            throw new IllegalArgumentException("Inválida : não pode ser negativa.");
        }
        if (corretora.getCarteira().getAtivos().getIndex(ativo) == -1){
            throw new IllegalArgumentException("Inválida : nao possui essa ação para vender");
        }

        double valorVenda = ativo.getValor() * quantidade;
        saldo += valorVenda;
        var historico = new Historico(ativo, quantidade, (float) valorVenda, 1);
        corretora.getCarteira().addTransacao(historico);
        System.out.println(nome + " vendeu " + quantidade + " ações da empresa " + ativo.getNome());
    }
}