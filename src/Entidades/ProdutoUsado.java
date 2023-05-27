package Entidades;

import java.util.Date;

public class ProdutoUsado extends Produto {
    private String fabricacao;

    private Double preco;

    public ProdutoUsado(String nome, String fabricacao) {
        super(nome);
        this.fabricacao = fabricacao;
    }

    public String getFabricacao() {
        return fabricacao;
    }

    public void setFabricacao(String fabricacao) {
        this.fabricacao = fabricacao;
    }

    @Override
    public void setPreco(Double preco) {
        preco = this.preco;
    }

}
