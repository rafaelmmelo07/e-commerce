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


    public void consultarEstoque(){
        controleEstoque.listarEstoque();
    }


//    public Boolean (int idEstoque, int quantidadeDesejada ){
//        Produto produtoEstoque = controleEstoque.buscarPorId(idEstoque);
//
//        if (idEstoque == null){
//            System.out.println("Item nao encontrado no estoque ");
//        }
    }


