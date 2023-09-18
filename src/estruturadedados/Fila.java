package estruturadedados;

import java.util.LinkedList;
import java.util.Queue;

class Ordem {
    String ativo;
    double valor;

    public Ordem(String ativo, double valor) {
        this.ativo = ativo;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return ativo + ": " + valor;
    }
}

public class Fila {
    public static void main(String[] args) {
        Queue<Ordem> filaPregao = new LinkedList<>();

        // Adicionar ordens à fila
        filaPregao.add(new Ordem("AAPL", 150.0));
        filaPregao.add(new Ordem("GOOG", 2800.0));

        // Processar as ordens na fila (removendo da fila)
        while (!filaPregao.isEmpty()) {
            Ordem ordem = filaPregao.poll();
            System.out.println("Executando ordem de pregão: " + ordem);
            // Aqui você pode executar a ordem na bolsa de valores
        }
    }
}

