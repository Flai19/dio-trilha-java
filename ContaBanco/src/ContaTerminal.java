import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Criação do objeto Scanner para ler dados do terminal
        Scanner scanner = new Scanner(System.in);

        // Solicitar e ler o número da agência
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        // Solicitar e ler o número da conta
        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();

        // Limpar o buffer do scanner
        scanner.nextLine();

        // Solicitar e ler o nome do cliente
        System.out.print("Por favor, digite o Nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        // Solicitar e ler o saldo
        System.out.print("Por favor, digite o Saldo: ");
        double saldo = scanner.nextDouble();

        // Exibir a mensagem final com as informações coletadas
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + numero +
                " e seu saldo " + saldo + " já está disponível para saque.";

        System.out.println(mensagem);

        // Fechar o scanner
        scanner.close();
    }
}
