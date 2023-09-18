public class Ativo {

    private String nome;
    private String codigo;
    private double valor;

    public Ativo(String nome, String codigo, double valor) {
        this.nome = nome;
        this.codigo = codigo;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getValor() {
        return valor;
    }
}