package estruturadedados;

import java.util.Stack;

class Pregao {
    private Stack<String> ativos;

    public Pregao() {
        ativos = new Stack<>();
    }

    // Método para adicionar um ativo a pilha
    public void adicionarAtivo(String ativo) {
        ativos.push(ativo);
        System.out.println("Ativo adicionado ao pregão: " + ativo);
    }

    // Método para remover e retornar o ativo mais recente da pilha
    public String removerAtivo() {
        if (ativos.isEmpty()) {
            System.out.println("O pregão está vazio.");
            return null;
        }
        String ativoRemovido = ativos.pop();
        System.out.println("Ação removida do pregão: " + ativoRemovido);
        return ativoRemovido;
    }

    // Método para verificar se o pregão está vazio
    public boolean estaVazio() {
        return ativos.isEmpty();
    }

    // Método para verificar quantos ativos estão no pregão
    public int tamanho() {
        return ativos.size();
    }

    // Método para imprimir todas os ativos no pregão
    public void listarAcoes() {
        System.out.println("Ativos no pregão:");
        for (String ativo : ativos) {
            System.out.println(ativo);
        }
    }
}
