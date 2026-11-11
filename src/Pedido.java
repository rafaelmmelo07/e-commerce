import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Long id;
    private Cliente cliente;
    private List<ItemPedido> itens = new ArrayList<>();
    private ControleEstoque controleEstoque;

    private Boolean statusPedido;

    public Pedido(ControleEstoque controleEstoque) {
        this.controleEstoque = controleEstoque;
    }

    public Pedido() {
    }

    public ItemPedido adicionarItem(Produto produto, int quantidade) {

        if (produto == null) {
            System.out.println("Produto nao foi encontrado chegou com o valor de null");
        } else {

            if (produto.getQuantidadeEstoque() < quantidade) {
                throw new RuntimeException("Quantodade insuficiente no estoque ");
            }
            ItemPedido novoItem = new ItemPedido(produto, quantidade);
            itens.add(novoItem);
            System.out.println("Produto adicionado ao carrinho com sucesso !!!");
            return novoItem;


        }

        return null;
    }

    public BigDecimal calcularTotal() {
        BigDecimal total = BigDecimal.ZERO;
        for (ItemPedido item : itens) {
            total = total.add(item.calcularTotal());
            System.out.println("Compra registrada no valor de: " + total);
        }
        return null;
    }

    public void iniciar(ControleEstoque controleEstoque) {
        if (itens.isEmpty()) {
            System.out.println("lista esta vazia ");
            return;
        }
        for (ItemPedido item : itens) {
            item.getProduto().removerEstoque(item.getQuantidade());
        }
    }

}


