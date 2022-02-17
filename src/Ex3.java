import java.util.*;
public class Ex3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a palavra que você quer analisar: ");
        String palavra = scanner.nextLine();

        ArrayList<String> todasStrings = new ArrayList<>();
        ArrayList<String> anagramas = new ArrayList<>();

        int countIguais = 0;

        for (int i = 0; i < palavra.length() - 1; i++) {
            for (int j = 1 + i; j < palavra.length(); j++) {

                char charI = palavra.charAt(i);
                char charJ = palavra.charAt(j);

                String novaString = palavra.substring(i, j + 1);

                if (i != j) {
                    if (charI == charJ) {
                        countIguais = countIguais + 1;
                        anagramas.add(palavra.substring(i, i+1));
                    }
                    todasStrings.add(novaString);
                }
            }
        }
        System.out.println("Anagramas: " + anagramas.size() + " - " + anagramas);
        System.out.println("Todas Substrings: " + todasStrings);
    }
}