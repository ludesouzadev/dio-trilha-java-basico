import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        // Criação do objeto Scanner para ler os dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitação e leitura do número da conta bancária
        System.out.println("Por favor, digite o número da conta:");
        int numero = scanner.nextInt();
        scanner.nextLine();  // Limpa o buffer do scanner

        // Solicitação e leitura da agência
        System.out.println("Por favor, digite o número da agência:");
        String agencia = scanner.nextLine();

        // Solicitação e leitura do nome do cliente
        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();

        // Solicitação e leitura do saldo
        System.out.println("Por favor, digite o saldo da conta:");
        double saldo = scanner.nextDouble();

        // Exibição da mensagem de confirmação
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                          "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + 
                          " já está disponível para saque.";
        System.out.println(mensagem);

        // Fechamento do scanner
        scanner.close();
    }
}
