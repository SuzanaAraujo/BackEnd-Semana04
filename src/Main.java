import Entidades.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Produto> listaProdutos = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("CADASTRO DE PRODUTOS");
        System.out.println("");
        System.out.println("Digite o nome do produto a ser cadastrado");
        String nomeCadastro = scan.nextLine();
        System.out.println("Preço do produto");
        Double precoCadastro = scan.nextDouble();
        System.out.println("Seu produto é importado(1) ou usado (2)? Coloque apenas o numero correspondente");
        int tipoProduto = scan.nextInt();
        if (tipoProduto == 1){
            System.out.println("Qual é a taxa alfandegária do produto?");
            Double txCadastro = scan.nextDouble();
            Produto produto = new  ProdutoImportado(nomeCadastro,txCadastro);
            produto.setPreco(precoCadastro);
            listaProdutos.add(produto);
        } else {
            System.out.println("Qual é a data de fabricação do produto?");
            String dtFabricacaoCadastro = scan.nextLine();
            Produto produto = new ProdutoUsado(nomeCadastro,dtFabricacaoCadastro);
            produto.setPreco(precoCadastro);
            listaProdutos.add(produto);
        }

//        for (Produto p : listaProdutos){
//            Double precoFinal = p.setPreco();
//        }

        listaProdutos.forEach(System.out::println);
    }
}