package Entidades;

import java.util.Date;

public class ProdutoUsado extends Produto {
    private String fabricacao;

    public ProdutoUsado(String nome, Double preco, String fabricacao) {
        super(nome, preco);
        this.fabricacao = fabricacao;
    }

    @Override
    public String toString() {
        return super.toString() + ". Produto usado com data de fabricação em "
                + fabricacao;
    }
}
