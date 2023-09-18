import estruturadedados.Lista;

public class Custodiante {
    private final String nome;
    private final Lista<Ativo> ativosCustodiados;
    public Custodiante(String nome) {
        this.nome = nome;
        this.ativosCustodiados = new Lista<>();
    }
    public String getNome() {
        return nome;
    }
    public Lista<Ativo> getAtivosCustodiados() {
        return ativosCustodiados;
    }
    public void adicionarAtivoCustodiado(Ativo ativo) {
        ativosCustodiados.add(ativo);
    }
    public void removerAtivoCustodiado(Ativo ativo) {
        ativosCustodiados.remove(ativo);
    }
    public void ListaEncadeadaarAtivosCustodiados() {
        System.out.println("Ativos custodiados por " + nome + ":");
        for (Ativo ativo : ativosCustodiados) {
            System.out.println("Código: " + ativo.getCodigo() + ", Nome: " + ativo.getNome());
        }
    }
}
