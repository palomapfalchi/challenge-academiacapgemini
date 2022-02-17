import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma senha de no mínimo 6 digitos: ");
        String senhaDigitada = scanner.nextLine();

        if (senhaDigitada.length() < 6) {
            System.out.println("Adicione mais " + (6 - senhaDigitada.length()) + " caracteres!");
        } else {
            System.out.println("Senha válida!");
        }
    }
}