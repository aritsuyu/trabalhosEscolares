import java.time.Year;
import java.util.Scanner;
public class idade {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        
        System.out.print("Qual o seu ano de nascimento? :");
        int ano = leitura.nextInt();

        int idade = Year.now().getValue() - ano;

        if (idade < 16) {
            System.out.println("Não pode dirigir e não pode votar");
        } else if (idade > 17) {
            System.out.println("Pode votar e dirigir");
        } else{
            System.out.println("Não pode Dirigir mas pode votar");
        }
    }
}