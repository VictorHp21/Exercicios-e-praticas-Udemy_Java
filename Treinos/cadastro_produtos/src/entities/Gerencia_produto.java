package entities;

import java.util.ArrayList;
import java.util.List;

public class Gerencia_produto {

    private List<Produto> produtos = new ArrayList<>();
    private int contador = 0;

    public List<Produto> listar() {
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println("ID: " + produtos.get(i).getId());
            System.out.println("Nome: " + produtos.get(i).getNome());
            System.out.println("Preço: " + "R$" + produtos.get(i).getPreco());
        }
        return produtos;
    }


    public void cadastrar(Produto produto) {
        contador++;
        produto.setId(contador);
        produtos.add(produto);
    }

    public void buscar(String nome) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getNome().equals(nome)) {
                System.out.println("Nome: " + produtos.get(i).getNome());
                System.out.println("Preço: " + "R$" + produtos.get(i).getPreco());
            } else {
                System.out.println("Produto nao encontrado");
            }
        }
    }

    public void remover(String nome) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getNome().equals(nome)) {
                produtos.remove(i);
            }
               return;

        }

        System.out.println("Produto nao encontrado");
    }
}
