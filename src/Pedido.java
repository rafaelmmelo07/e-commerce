import java.math.BigDecimal;
import java.util.List;

public class Pedido {
    private Long id ;
    private Cliente cliente;
    private List <ItemPedido> itens;
    private ControleEstoque controleEstoque;

    private Boolean statusPedido;

    public Pedido(ControleEstoque controleEstoque){
        this.controleEstoque = controleEstoque;
    }
    public Pedido(){};


    public void adicionarItem(Produto produto, int quantidade ){

        if (produto == null){
            System.out.println("Produto nao foi encontrado chegou com o valor de null");
        }else {

        if (produto.getQuantidadeEstoque() < quantidade){
            throw new RuntimeException("Quantodade insuficiente no estoque ");
        }
        ItemPedido novoItem = new ItemPedido(produto, quantidade);
        this.itens.add(novoItem);
        System.out.println("Item foi adicionado ao carrinho de compra ");
        }
    }





    public BigDecimal calcularTotal(){
        BigDecimal total = BigDecimal.ZERO;
        for (ItemPedido item :  itens){
            total = total.add(item.calcularTotal());
        }
    return total;
    }

    public void iniciar( ){
        if (itens.isEmpty()){
             System.out.println("lista esta vazia ");
            }
        for (ItemPedido item : itens){
            item.getProduto().removerEstoque(item.getQuantidade());
            }
        }

}


