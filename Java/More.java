import java.util.Scanner;

public class More {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma operação (+, -, *, /):");
        char operador = scanner.next().charAt(0);

        System.out.println("Digite o primeiro número: ");
        int n1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int n2 = scanner.nextInt();

        int total = 0;
        boolean operacaoValida = true;

        switch (operador) {
            case '+':
                total = n1 + n2;
                System.out.println("Resultado da soma: " + total);
                break;
            case '-':
                total = n1 - n2;
                System.out.println("Resultado da subtração: " + total);
                break;
            case '*':
                total = n1 * n2;
                System.out.println("Resultado da multiplicação: " + total);
                break;
            case '/':
                if (n2 != 0) {
                    total = n1 / n2;
                    System.out.println("Resultado da divisão: " + total);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            default:
                operacaoValida = false;
                System.out.println("Operador inválido.");
        }

        if (operacaoValida) {
            System.out.println("Conta concluida com sucesso.");
        }

        scanner.close();
    }
}