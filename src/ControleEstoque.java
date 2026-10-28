import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControleEstoque {
  private ArrayList<Produto> estoque = new ArrayList<>();

    // Construtor: Quando criamos o estoque, ele já cadastra os 10 produtos de mercado automaticamente
    public ControleEstoque() {
        this.estoque.addAll(gerarProdutosIniciais());
    }

    public List<Produto> gerarProdutosIniciais() {
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto(1, "Arroz Branco 5kg", new BigDecimal("24.90"), 30));
        produtos.add(new Produto(2, "Feijão Carioca 1kg", new BigDecimal("8.50"), 40));
        produtos.add(new Produto(3, "Óleo de Soja 900ml", new BigDecimal("6.99"), 50));
        produtos.add(new Produto(4, "Açúcar Cristal 5kg", new BigDecimal("18.00"), 25));
        produtos.add(new Produto(5, "Café em Pó 500g", new BigDecimal("16.50"), 35));
        produtos.add(new Produto(6, "Leite Integral 1L", new BigDecimal("5.29"), 60));
        produtos.add(new Produto(7, "Macarrão Espaguete 500g", new BigDecimal("4.80"), 45));
        produtos.add(new Produto(8, "Peito de Frango Congelado 1kg", new BigDecimal("19.90"), 20));
        produtos.add(new Produto(9, "Carne Bovina Moída 1kg", new BigDecimal("32.50"), 15));
        produtos.add(new Produto(10, "Pacote de Pão de Forma", new BigDecimal("7.50"), 30));

        return produtos;


    }




public void adicionarProduto(String nome, BigDecimal preco, int quantidadeEstoque) {

        Produto produto = new Produto(nome, preco, quantidadeEstoque);
         for (int i = 0; i < estoque.size(); i++) {


             if (estoque.get(i).getId() == produto.getId()){
            produto.AcrecentoID();       //0 Incrementa se o ID forigual
            i = -1;  // Reinicia a verificação do começo para garantir o novo ID gerado também não repita
        }
    }
    estoque.add(produto);
};


    public Produto  listarEstoque(){



        if (estoque.isEmpty()){
            System.out.println("O estoque esta vazio!! Adicione itens para ser listado ");

        } else {
            for (int i = 0; i < estoque.size(); i++) {
                Produto produto = estoque.get(i);

                System.out.println("NUMERO PRODUTO:  " + produto.getId());
                System.out.println(" NOME: " + produto.getNome());
                System.out.println(" PRECO: " + produto.getPreco() );
                System.out.println(" ESTOQUE " + produto.getQuantidadeEstoque()  + "\n");
            }
        }
        return null;
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



public void buscarPorID(){
    Scanner leitor =  new Scanner(System.in);
        System.out.println("Digite o id do item que deseja visualizar ");
        int idUsuario = leitor.nextInt();

    for (int i = 0;  i <estoque.size(); i++ ){
        if (estoque.get(i).getId() ==  idUsuario) {
            System.out.println(estoque.get(i).getNome());
            System.out.println(estoque.get(i).getPreco());
            break;
        }else {
            System.out.println("id nao foi encontrado no estoque ");
        }
      }
    }




}
















