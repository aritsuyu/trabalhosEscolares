import java.util.Scanner;

public class cpg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro termo da P.G:");
        float an = scanner.nextFloat();

        System.out.println("Informe a razão da P.G:");
        float r = scanner.nextFloat();

        System.out.println("Informe o número de termos da P.G:");
        int n = scanner.nextInt();

        float resultado;

        if (r == 1) {
            resultado = an * n;
        } else {
            resultado = (float)(an * (1 - Math.pow(r, n)));
        }

        System.out.println("A soma dos " + n + " termos da P.G é: " + resultado);

        scanner.close();
    }
}
