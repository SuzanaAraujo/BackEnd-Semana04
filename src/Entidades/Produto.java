package Entidades;

public abstract class Produto {
    private String nome;

    public Produto(String nome) {
        this.nome = nome;
    }

    public abstract void setPreco(Double preco);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
