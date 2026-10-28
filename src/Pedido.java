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


    }


