
package quebracabeca;

public class QuebraCabeca {

    public static void main(String[] args) {
        Peca peca1 = new PecaSimples("Peca 1", 1, 2, 3, 4);
        Peca peca2 = new PecaSimples("Peca 2", 3, 2, 4, 1);
        Peca peca3 = new PecaEspecial("Peca 3", 4, 5, 6, 1);
        
        Tabuleiro tabuleiro = new Tabuleiro();
        
        tabuleiro.adicionarPeca(peca1);
        tabuleiro.adicionarPeca(peca2);
        tabuleiro.adicionarPeca(peca3);

        tabuleiro.encaixarPecas();
    }
    
}
