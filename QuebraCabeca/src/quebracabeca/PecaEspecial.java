
package quebracabeca;

public class PecaEspecial extends Peca{
    private int valorTopo;
    private int valorDireita;
    private int valorFundo;
    private int valorEsquerda;

    public PecaEspecial(String nome, int topo, int direita, int fundo, int esquerda) {
        this.nome = nome;
        this.valorTopo = topo;
        this.valorDireita = direita;
        this.valorFundo = fundo;
        this.valorEsquerda = esquerda;
    }

    @Override
    public boolean encaixarCom(Peca outraPeca) {
        if (outraPeca instanceof PecaEspecial) {
            PecaEspecial peca = (PecaEspecial) outraPeca;

            return this.valorFundo == peca.valorTopo || this.valorDireita == peca.valorEsquerda;
        }
        return false; 
    }

    @Override
    public String toString() {
        return "PecaEspecial{" +
                "nome='" + nome + '\'' +
                ", valorTopo=" + valorTopo +
                ", valorDireita=" + valorDireita +
                ", valorFundo=" + valorFundo +
                ", valorEsquerda=" + valorEsquerda +
                '}';
    }
}

