import java.math.BigDecimal;

public class  ItemPedido  extends  ControleEstoque{

    private Produto produto;
    private Integer quantidade;

    public ItemPedido(){}


    public Produto getProduto() {
        return produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public BigDecimal calcularSubtotal(){
      return produto.getPreco().multiply(BigDecimal.valueOf(quantidade))  ;
    };



public void adicionar(){


}

}
