import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma senha de no mínimo 6 digitos: ");
        String senhaDigitada = scanner.nextLine();

        if (senhaDigitada.length() < 6) {
            System.out.println("Adicione mais " + (6 - senhaDigitada.length()) + " caracteres");
        } else {
            System.out.println("Senha válida!");
        }
/*
        String caractEspecial = "-";

            switch ("caractEspecial") {
                case: #
                    System.out.println("tem #");
                    break;
                default:
                    break;
            }

        senhaDigitada.contains("!");
        senhaDigitada.contains("@");
        senhaDigitada.contains("#");
        senhaDigitada.contains("$");
        senhaDigitada.contains("%");
        senhaDigitada.contains("^");
        senhaDigitada.contains("&");
        senhaDigitada.contains("*");
        senhaDigitada.contains("(");
        senhaDigitada.contains(")");
        senhaDigitada.contains("-");
        senhaDigitada.contains("+");
*/

        System.out.println("Regex: " + senhaDigitada.matches("/[^a-zA-Z0-9]+/g"));

    }
}

//Possui no mínimo 6 caracteres.OK
//Contém no mínimo 1 digito.
//Contém no mínimo 1 letra em minúsculo.
//Contém no mínimo 1 letra em maiúsculo.
//Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+
