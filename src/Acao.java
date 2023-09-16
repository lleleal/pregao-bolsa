public class Acao implements Calculo {

    private String nome;
    private double preco;

    public Acao(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public double calcularValor() {
        // Inserir processo para calcular o valor da ação. 
        return 0.0; 
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}