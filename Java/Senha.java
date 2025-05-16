import java.util.Scanner;
public class Senha{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a senha:");
        String senha = sc.nextLine();
        String senhaCorreta = "1234";
        if (senha.equals(senhaCorreta)) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso negado");
        }
        sc.close();
    }
}