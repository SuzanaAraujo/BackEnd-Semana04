import Entidades.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Produto> listaProdutos = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("CADASTRO DE PRODUTOS");
        System.out.println("");
        System.out.println("Digite o nome do produto a ser cadastrado ou digite FIM para cancelar");
        String nomeCadastro = scan.next();

        while (!nomeCadastro.equalsIgnoreCase("fim")){

            System.out.println("Preço do produto");
            Double precoCadastro = scan.nextDouble();
            System.out.println("Seu produto é importado(1), usado (2) ou outra opção (3)? Coloque apenas o numero correspondente");
            int tipoProduto = scan.nextInt();

            switch (tipoProduto) {
                case 1 -> {
                    System.out.println("Qual é a taxa alfandegária do produto?");
                    Double txAlfandegariaCadastro = scan.nextDouble();
                    listaProdutos.add(new ProdutoImportado(nomeCadastro, precoCadastro, txAlfandegariaCadastro));
                }
                case 2 -> {
                    System.out.println("Qual é a data de fabricação do produto?");
                    String dtFabricacaoCadastro = scan.next();
                    listaProdutos.add(new ProdutoUsado(nomeCadastro, precoCadastro, dtFabricacaoCadastro));
                }
                case 3 -> listaProdutos.add(new Produto(nomeCadastro, precoCadastro));
                default -> System.out.println("Entrada incorreta. Cadastro inválido");
            }
            System.out.println("Digite o nome do produto a ser cadastrado ou digite FIM para cancelar");
            nomeCadastro = scan.next();
        }

        listaProdutos.forEach(System.out::println);
    }
}