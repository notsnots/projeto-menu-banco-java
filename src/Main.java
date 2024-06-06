import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nome = "";
        String tipoConta = "Corrente";
        double saldo = 1725.51;
        int opcao;

        nome = nomeCliente(in);
        opcao = menu(in);

        if(opcao == 1){
            System.out.println("Seu saldo é: " + saldo);
            menu(in);
        }
        if(opcao == 2){
            transferirValor(saldo, in);
            menu(in);
        }
    }

    public static String nomeCliente(Scanner in){
        System.out.println("Qual seu nome?");
        return in.nextLine();
    }
    public static int menu(Scanner in){
        int opcao;
        do {
            System.out.println("Digite a opcao que voce deseja:");
            System.out.println("1- Conferir saldo");
            System.out.println("2- Transferir valor");
            System.out.println("3- Receber pagamento");
            System.out.println("4- Fechar o aplicativo");
            opcao = in.nextInt();

            if(opcao > 4 || opcao < 1){
                System.out.println("Opcao nao encontrada, digite novamente.");
            }
        }while(opcao > 4 || opcao < 1);
        return opcao;
    }
    public static double transferirValor(double saldo, Scanner in){
        double valorTransferir;
        do {
            System.out.println("Quanto voce deseja transferir do seu saldo de R$" + saldo + "?");
            valorTransferir = in.nextDouble();
            if(valorTransferir > saldo) {
                System.out.println("Nao é possível transferir o valor. Digite outro valor!");
            }

        }while(valorTransferir > saldo);

        return saldo - valorTransferir;
    }
}
