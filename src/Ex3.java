import java.util.ArrayList;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a palavra que você quer analisar: ");
        String palavra = scanner.nextLine();

        ArrayList<String> anagramas = new ArrayList<>();

        for (int i = 0; i < palavra.length(); i++) {
            for (int j = 1 + i; j < palavra.length(); j++) {
                if (palavra.charAt(i) == palavra.charAt(j) && i != j && i < j) {
                    if (palavra.charAt(i) == palavra.charAt(i+1)) {
                        String substring = palavra.substring(i, i+1);
                        anagramas.add(substring.repeat(2));
                    } else {
                        anagramas.add(palavra.substring(i,i+1).repeat(2));
                        anagramas.add(palavra.substring(i+1, j+1));
                        anagramas.add(palavra.substring(i,j));
                    }
                }
            }
        }
        System.out.println("Anagramas: " + anagramas);
        System.out.println(anagramas.size());
    }
}
