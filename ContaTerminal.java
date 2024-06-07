import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira numero da conta: ");
        int numero = input.nextInt();
        System.out.println("Insira numero da agencia: ");
        String agencia = input.nextLine();
        System.out.println("Insira o nome do cliente: ");
        String nomeCliente = input.nextLine();
        System.out.println("Insira o saldo conta: ");
        double Saldo = input.nextDouble();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Nome: " +nomeCliente);
        System.out.println("Conta: " +numero);
        System.out.println("Agencia: " +agencia);
        System.out.println("Saldo: R$" +Saldo);
    }
}