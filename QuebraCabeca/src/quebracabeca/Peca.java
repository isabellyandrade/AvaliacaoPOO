
package quebracabeca;

abstract class Peca {
    String nome;

    public abstract boolean encaixarCom(Peca outraPeca);

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Peca{" + "nome='" + nome + '\'' + '}';
    }
}



public class Main {
    public static void main(String[] args) {
        // Criando peças do tipo PecaSimples
        Peca peca1 = new PecaSimples("Peça 1", 1, 2, 3, 4);
        Peca peca2 = new PecaSimples("Peça 2", 3, 2, 4, 1);
        Peca peca3 = new PecaEspecial("Peça Especial 1", 4, 5, 6, 2);
        Peca peca4 = new PecaSimples("Peça 3", 6, 7, 8, 3);

        // Criando o jogo e adicionando as peças
        Jogo jogo = new Jogo();
        jogo.adicionarPeca(peca1);
        jogo.adicionarPeca(peca2);
        jogo.adicionarPeca(peca3);
        jogo.adicionarPeca(peca4);

        // Realizando o encaixe das peças
        jogo.encaixarPecas();
    }
}
Explicação das modificações:
Herança: Criamos uma classe abstrata Peca, e duas subclasses, PecaSimples e PecaEspecial, que implementam o comportamento específico do encaixe.
Abstração: A classe Peca é abstrata, o que força as subclasses a implementarem o método encaixarCom(). Isso oculta os detalhes de implementação do encaixe e permite uma interface comum para todas as peças.
Polimorfismo: A classe Jogo pode manipular objetos do tipo Peca, seja ela PecaSimples ou PecaEspecial, e chama o método encaixarCom() que será implementado de forma diferente para cada tipo de peça.
Resultado Esperado:
Quando você executar o código, ele verificará o encaixe das peças, e a saída será:

css
Copiar código
Encaixe válido: PecaSimples{nome='Peça 1', valorTopo=1, valorDireita=2, valorFundo=3, valorEsquerda=4}
Encaixe válido: PecaSimples{nome='Peça 2', valorTopo=3, valorDireita=2, valorFundo=4, valorEsquerda=1}
Não é possível encaixar a peça: PecaEspecial{nome='Peça Especial 1', valorTopo=4, valorDireita=5, valorFundo=6, valorEsquerda=2}
Agora, o código utiliza herança, abstração e polimorfismo de forma clara e eficiente, atendendo a todos os requisitos solicitados.




