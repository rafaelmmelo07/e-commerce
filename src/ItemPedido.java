import java.math.BigDecimal;
import java.util.ArrayList;

public class  ItemPedido{

    ControleEstoque controleEstoque = new ControleEstoque();
    private Integer quantidade;
    private Produto produto;
     private ArrayList<Produto> estoques = controleEstoque.getEstoque();
    public ItemPedido(){}

    public Produto getProduto() {
        return produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }


    public  void  listar (){
           for (Produto  i : estoques){
               System.out.println(i.getNome());
               System.out.println(i.getPreco());
           }

    }


public BigDecimal calcularSubtotal(){
    return produto.getPreco().multiply(BigDecimal.valueOf(quantidade));
}


}


