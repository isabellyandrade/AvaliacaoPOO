
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



