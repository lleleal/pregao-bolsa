public class Empresa {
    
    private String nome;
    private int cotas;

    public Empresa(String nome, int cotas) {
        validarCotas(cotas);
        this.nome = nome;
        this.cotas = cotas;
    }

    public String getNome() {
        return nome;
    }
    
    public void comprarCotas(int cotas) {
        validarCotas(cotas);
        if (this.cotas < cotas) {
            throw new RuntimeException("O número excede o limite");
        }
        this.cotas -= cotas;
    }

    private void validarCotas(int cotas) {
        if (cotas <= 0) {
            throw new IllegalArgumentException("O número não pode ser menor ou igual a zero");
        }
    }
}
