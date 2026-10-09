import java.math.BigDecimal;

public class Produto {
    private String nome;
    private int id = 0;
    private BigDecimal preco;
    private  Integer quantidadeEstoque;


    public Produto(String nome, BigDecimal preco){
        this.nome = nome;
        this.preco = preco;

    };

    public Produto(){};

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }


public void AcrecentoID(){
        this.id = (id + 1);
}





}






