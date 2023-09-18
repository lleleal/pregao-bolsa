public class Main {
    public static void main(String[] args) throws IllegalAccessException {

        Bolsa bolsa = new Bolsa("Bolsa de Valores 1");

        Corretora corretora = new Corretora("Corretora 1");

        Investidor investidor = new Investidor("Investidor 1", 1, corretora);
        investidor.transferir(100000);

        Carteira carteira = new Carteira();
        investidor.getCorretora().setCarteira(carteira);

        Ativo ativo1 = new Ativo("GOOGL", "Alphabet Inc.", 2800.0);

        Ativo ativo2 = new Ativo("AAPL", "Apple Inc.", 150.0);

        investidor.comprarAcao(ativo1, 1);
        investidor.comprarAcao(ativo2, 30);
        investidor.venderAcao(ativo2, 90);

        System.out.println("Histórico de Transações da Carteira de " + investidor.getNome() + ":");
        for (Historico transacao : carteira.getHistorico()) {
            System.out.println("Ativo: " + transacao.getAtivo().getNome() +
                    ", Quantidade: " + transacao.getQuantidade() +
                    ", Valor: " + transacao.getValor());
        }
        System.out.println("Saldo atual: " + investidor.getSaldo());
    }
}
