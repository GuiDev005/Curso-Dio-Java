import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Entrada de dados
            System.out.println("Digite o primeiro número:");
            int primeiroNumero = scanner.nextInt();

            System.out.println("Digite o segundo número:");
            int segundoNumero = scanner.nextInt();

            // Verificação e execução
            contar(primeiroNumero, segundoNumero);

        } catch (ParametrosInvalidosException e) {
            // Tratamento da exceção personalizada
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // Método que realiza a contagem
    static void contar(int numero1, int numero2) throws ParametrosInvalidosException {
        if (numero1 > numero2) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int quantidade = numero2 - numero1;

        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

