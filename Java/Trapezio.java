import java.util.Scanner;

public class Trapezio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Base maior do trapézio: ");
        float baseMaior = scanner.nextFloat();
//Base Menor
        System.out.print("Base menor do trapézio: ");
        float baseMenor = scanner.nextFloat();
//Altura
        System.out.print("Altura do trapézio: ");
        float altura = scanner.nextFloat();
        scanner.close();

        // Calcula a área do trapézio
        float area = ((baseMaior + baseMenor) * altura) / 2;

        // Exibe o resultado
        System.out.printf("A área do trapézio é: %.2f%n", area);
    }
}