import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class ControleEstoque {
    private  ArrayList<Produto> estoque = new ArrayList<>();

    public ControleEstoque(){}


public void adicionarProduto(String nome, BigDecimal preco) {
    Produto produto = new Produto(nome, preco);

    for (int i = 0; i < estoque.size(); i++) {
        if (estoque.get(i).getId() == produto.getId()) {
            produto.AcrecentoID();       //0 Incrementa se o ID for igual
            i = -1;  // Reinicia a verificação do começo para garantir o novo ID gerado também não repita
        }
    }
    estoque.add(produto);
};


    public void listarEstoque(){
        if (estoque.isEmpty()){
            System.out.println("O estoque esta vazio!! Adicione itens para ser listado ");

        } else {
            for (int i = 0; i < estoque.size(); i++) {
                Produto produto = estoque.get(i);

                System.out.println("NUMERO PRODUTO:  " + produto.getId());
                System.out.println(" NOME: " + produto.getNome());
                System.out.println(" PRECO: " + produto.getPreco());

            }
        }
    };

    public void removerEstoque( int numeroItem){
        for (int i = 0; i < estoque.size(); i++) {
                    if (estoque.get(i).getId() ==
                            (numeroItem)) {
                        estoque.remove(i);
                        return;
                    }
                }
            }
public void acrecentoID() {
        for (int i = 0; i < estoque.size(); i++) {
            estoque.get(i).getId();
        }
    }
}
















