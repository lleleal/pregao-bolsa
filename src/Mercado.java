public class Mercado extends Acao {

    private int cotas;
    private Empresa empresa;

    public Mercado(String nome, double preco, int cotas, Empresa empresa) {
        super(nome, preco);
        this.cotas = cotas;
        setEmpresa(empresa);
    }

    @Override
    public double calcularValor() {
        return getPreco() * cotas;
    }

    public String getNomeEmpresa() {
        return empresa.getNome();
    }

    public void setCotas(int cotas) {
        this.cotas = cotas;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
        empresa.comprarCotas(cotas);
    }
}
