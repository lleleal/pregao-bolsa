import java.rmi.activation.ActivationInstantiator;

import estruturadedados.*;

public class Bolsa {
    private String nome;

    public Bolsa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;

    }

    public static void main(String[] args) {
        Pilha pregao = new Pilha();
    
        pregao.adicionarAtivo("AAPL");
        pregao.adicionarAtivo("GOOGL");
    
        pregao.listarAtivos();
    
        pregao.removerAtivo();
        pregao.listarAtivos();
    
        System.out.println("O pregão está vazio? " + pregao.estaVazio());
        System.out.println("Tamanho do pregão: " + pregao.tamanho());
    }
}