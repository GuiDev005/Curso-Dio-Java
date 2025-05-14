import java.util.Scanner;

public class ContaTerminal1{
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // consumir a quebra de linha

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial:");
        double saldo = scanner.nextDouble();

        // Mensagem final formatada
        System.out.println("\nOlá " + nomeCliente + 
            ", obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua agência é " + agencia + 
            ", conta " + numero + " e seu saldo de R$" + String.format("%.2f", saldo) +
            " já está disponível para saque.");

        scanner.close();
    }
}
