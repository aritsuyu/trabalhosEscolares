import java.util.Scanner;
public class Triangulo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do lado A:");
        double a = sc.nextDouble();
        System.out.println("Digite o valor do lado B:");
        double b = sc.nextDouble();
        System.out.println("Digite o valor do lado C:");
        double c = sc.nextDouble();

        if (a == b && b == c) {
            System.out.println("O triângulo é equilátero.");
        } else if (a == b || a == c || b == c) {
            System.out.println("O triângulo é isósceles.");
        } else {
            System.out.println("O triângulo é escaleno.");
        }
        
    }
}