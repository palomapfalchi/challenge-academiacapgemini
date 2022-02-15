import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String senhaDigitada = scanner.nextLine();

        if (senhaDigitada.length() < 6) {
            System.out.println(6 - senhaDigitada.length());
        } else {
            System.out.println("Senha válida!");
        }
    }
}
