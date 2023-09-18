package estruturadedados;

public class Arvore {
    class Pregao {
        String ativo;
        double valor;
        Pregao esquerda, direita;
    
        public Pregao(String acao, double preco) {
            this.esquerda = null;
            this.direita = null;
        }
    }
    
    class ArvorePregao {
        Pregao raiz;
    
        ArvorePregao() {
            raiz = null;
        }
    
        void inserir(String acao, double preco) {
            raiz = inserirRecursivo(raiz, acao, preco);
        }
    
        Pregao inserirRecursivo(Pregao raiz, String acao, double preco) {
            if (raiz == null) {
                raiz = new Pregao(acao, preco);
                return raiz;
            }
    
            if (acao.compareTo(raiz.ativo) < 0) {
                raiz.esquerda = inserirRecursivo(raiz.esquerda, acao, preco);
            } else if (acao.compareTo(raiz.ativo) > 0) {
                raiz.direita = inserirRecursivo(raiz.direita, acao, preco);
            }
    
            return raiz;
        }
    
        void emOrdem(Pregao raiz) {
            if (raiz != null) {
                emOrdem(raiz.esquerda);
                System.out.println(raiz.ativo + ": " + raiz.ativo);
                emOrdem(raiz.direita);
            }
        }
    
        public {
            ArvorePregao arvore = new ArvorePregao();
            arvore.inserir("AAPL", 150.0);
            arvore.inserir("GOOG", 2800.0);
    
            System.out.println("Pregão em ordem:");
            arvore.emOrdem(arvore.raiz);
        }
    }
}
