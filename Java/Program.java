import java.util.Scanner;
public class Program{
    public static void main(String[] args) {

        String nome = "";
        Scanner Program = new Scanner(System.in);
        System.out.printf("informe um nome:\n");
        nome = Program.nextLine();

        Program.close();

        System.out.println("seu nome: " +nome);
    }

    
}