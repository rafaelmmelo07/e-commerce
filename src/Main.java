import java.math.BigDecimal;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        ControleEstoque controleEstoque = new ControleEstoque();
        ItemPedido itemPedido = new ItemPedido();
        // controleEstoque.listarEstoque();

        //===================================================== AREA DO ADM =====================================================
      int opc;
        do {
            System.out.println("\n");
            System.out.println("E-COMMERCE ");

            System.out.println("PRODUTOS: ");
            System.out.println("[1] Cadastrar produtos ");
            System.out.println("[2] Listar produtos  ");
            System.out.println("[3] Deletar produto ");
            System.out.println("[4] Buscar produto por ID ");
            System.out.println("[5] teste ");
            opc = leitor.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Digite o nome do produto :");
                    leitor.nextLine();
                    String nome = leitor.nextLine();

                    System.out.println("Digite o preço ");
                    BigDecimal preco = leitor.nextBigDecimal();

                    System.out.println("Digite a quantida no estoque");
                    int quantidadeEstoque = leitor.nextInt();

                    controleEstoque.adicionarProduto(nome, preco, quantidadeEstoque);
                    break;

                case 2:
                    controleEstoque.listarEstoque();
                    break;

                case 3:
                    int resposta;

                    System.out.println("para consultar os itens no estoque deseja consular a lista de itens \n" +
                            "[1] Sim \n [2] nao ");
                    resposta = leitor.nextInt();


                    if (resposta == 1) {
                        controleEstoque.listarEstoque();

                        System.out.println("Digite o numero do item que deseja deletar");
                        leitor.nextLine();
                        int numeroItem = leitor.nextInt();

                        controleEstoque.removerEstoque(numeroItem);


                    }
                    if (resposta == 2) {
                        System.out.println("Digite o numero do item que deseja deletar");
                        int numeroItem = leitor.nextInt();

                        controleEstoque.removerEstoque(numeroItem);
                        break;
                    }

                case 4:
                    controleEstoque.buscarPorID();
            break;
                case 5:
                     itemPedido.listar();
                    break;
            }
        } while (opc != 6);

//===============================================================================================================

        ////  =====================================   AREA DO CLIETE ========================================



    }
}