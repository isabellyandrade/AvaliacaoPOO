
package quebracabeca;

import java.util.ArrayList;
import java.util.List;

public class Tabuleiro {
    private List<Peca> pecas;
    private int indiceAtual;

    public Tabuleiro() {
        this.pecas = new ArrayList<>();
        this.indiceAtual = 0;
    }
    
    public void adicionarPeca(Peca peca) {
        pecas.add(peca);
    }

    public void encaixarPecas() {
        while (indiceAtual < pecas.size()) {
            Peca pecaAtual = pecas.get(indiceAtual);
            Peca pecaProxima = (indiceAtual + 1 < pecas.size()) ? pecas.get(indiceAtual + 1) : null;

            if (pecaProxima == null) {
                System.out.println("Nao ha proxima peca para encaixar");
                break;
            }

            if (pecaAtual.encaixarCom(pecaProxima)) {
                System.out.println("Encaixe valido: " + pecaAtual);
                indiceAtual++;
            } else {
                System.out.println("Nao eh possivel encaixar a peca: " + pecaAtual);
                break;
            }
        }

        if (indiceAtual == pecas.size()) {
            System.out.println("Todas as pecas foram encaixadas com sucesso!");
        }
    }
}

