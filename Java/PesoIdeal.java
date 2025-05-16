import java.util.Scanner;
public class PesoIdeal {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite seu sexo (1 = Masculino | 2 = Feminino): ");
    int sexo = sc.nextInt();
    System.out.println("(Coloque ',' Ex: 1,70) Digite sua altura em metros: ");
    double altura = sc.nextDouble();
    double pesoIdeal = 0;
    if (sexo == 1) {
        pesoIdeal = (72.7 * altura) - 58;
    } else if (sexo == 2) {
        pesoIdeal = (62.1 * altura) - 44.7;
    } else {
        System.out.println("Sexo inválido.");
            sc.close();
            return;
        }
    System.out.printf("Seu peso ideal é: %.2f kg\n", pesoIdeal);
    System.out.println("Digite seu peso atual: ");
    double pesoAtual = sc.nextDouble();
    if (pesoAtual < pesoIdeal) {
        System.out.println("Você está abaixo do peso ideal.");
    } else if (pesoAtual > pesoIdeal) {
        System.out.println("Você está acima do peso ideal.");
    } else {
        System.out.println("Você está no peso ideal.");
    }
        sc.close();
    }
}