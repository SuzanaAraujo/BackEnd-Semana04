
package Entidades;

public class ProdutoImportado extends Produto {
    private Double taxaAlfandega;

    public ProdutoImportado(String nome, Double preco, char tipo, Double taxaAlfandega) {
        super(nome, preco, tipo);
        this.taxaAlfandega = taxaAlfandega;
    }

    @Override
    public String mostrarProduto() {
        return super.mostrarProduto() + " (Taxa: R$ " + taxaAlfandega + ")";
    }

    @Override
    public String toString() {
        return "Nome " + getNome() + "\nPreço R$ " + (getPreco()+taxaAlfandega) +
                "\n(Taxa: R$ " + taxaAlfandega + ")";
    }
}
