import estruturadedados.Lista;
 
 public class Corretora {
    
    private String nome;
    private String endereco;
    public Carteira carteira;
    private Lista<Investidor> clientes;
    

    public Corretora(String nome) {
        this.nome = nome;
        this.clientes = new Lista<>();
    }
    
    public String getNome() {
        return nome;
    }

    public Lista<Investidor> getClientes() {
        return clientes;
    }

    public void addClientes(Investidor investidor) {
        clientes.add(investidor);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public Carteira getCarteira() {
        return carteira;
    }

    public void setCarteira(Carteira carteira) {
        this.carteira = carteira;
    }
}