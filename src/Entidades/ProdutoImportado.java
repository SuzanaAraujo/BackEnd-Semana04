
package Entidades;

public class ProdutoImportado extends Produto {
    private Double taxaAlfandega;

    public ProdutoImportado(String nome, Double preco, Double taxaAlfandega) {
        super(nome, preco);
        this.taxaAlfandega = taxaAlfandega;
    }

    @Override
    public String toString() {
        return super.toString() + ". Taxa de alfândega de R$ " + taxaAlfandega;
    }
}
