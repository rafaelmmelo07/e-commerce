import java.math.BigDecimal;
import java.util.ArrayList;

public class ItemPedido {

    private Integer quantidade;
    private Produto produto;


    public ItemPedido(Produto produto, Integer quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public ItemPedido(){};

    public Produto getProduto() {
        return produto;
    }
    public Integer getQuantidade() {
        return quantidade;
    }

    public BigDecimal calcularTotal(){
        return  produto.getPreco().multiply(new BigDecimal(quantidade));
    }

}


