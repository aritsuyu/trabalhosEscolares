import java.util.Arrays;
import java.util.Scanner;

public class ValoresInteiros{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite os Valores");
    System.out.println("Digite o primeiro valor:");
    int n1 = sc.nextInt();
    System.out.println("Digite o segundo valor:");
    int n2 = sc.nextInt();
    System.out.println("Digite o terceiro valor:");
    int n3 = sc.nextInt();

     int[] list = {n1, n2, n3};
     Arrays.sort(list);
     System.out.println("Os valores em ordem crescente são:");
     for (int i = 0; i < list.length; i++) {
         System.out.println(list[i]);
            }
        }
}