
package quebracabeca;

class PecaSimples extends Peca {
    private int valorTopo;
    private int valorDireita;
    private int valorFundo;
    private int valorEsquerda;
    
    public PecaSimples(String nome, int topo, int direita, int fundo, int esquerda) {
        this.nome = nome;
        this.valorTopo = topo;
        this.valorDireita = direita;
        this.valorFundo = fundo;
        this.valorEsquerda = esquerda;
    }

    @Override
    public boolean encaixarCom(Peca outraPeca) {
        if (outraPeca instanceof PecaSimples) {
            PecaSimples peca = (PecaSimples) outraPeca;

            return this.valorFundo == peca.valorTopo || this.valorDireita == peca.valorEsquerda;
        }
        return false; 
    }
    
    @Override
    public String toString() {
        return "PecaSimples{" +
                "nome='" + nome + '\'' +
                ", valorTopo=" + valorTopo +
                ", valorDireita=" + valorDireita +
                ", valorFundo=" + valorFundo +
                ", valorEsquerda=" + valorEsquerda +
                '}';
    }
}