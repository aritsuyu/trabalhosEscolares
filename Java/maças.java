import java.util.Scanner;
public class maças {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Quantas maçãs você deseja comprar? (DESCONTO NA DUZIA!)");
        int quantidade = leitura.nextInt();
        double preco = 0.30;
        if (quantidade >= 12) {
            preco = 0.25;
        }
        double total = quantidade * preco;
        System.out.printf("O total a pagar é: R$ %.2f\n", total);
        
    }
}