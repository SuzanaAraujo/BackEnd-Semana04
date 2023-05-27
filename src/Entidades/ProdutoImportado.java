
package Entidades;

public class ProdutoImportado extends Produto {
    private Double taxaAlfandega;

    private Double preco;

    public ProdutoImportado(String nome, Double taxa) {
        super(nome);
        this.taxaAlfandega = taxa;
    }

    @Override
    public void setPreco(Double preco) {
        this.preco = preco + taxaAlfandega;
    }

    public Double getTaxaAlfandega() {
        return taxaAlfandega;
    }

    public void setTaxaAlfandega(Double taxaAlfandega) {
        this.taxaAlfandega = taxaAlfandega;
    }
}
