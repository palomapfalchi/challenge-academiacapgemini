
import java.sql.SQLOutput;
import java.util.*;

import static java.lang.String.valueOf;

public class Ex3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a palavra que você quer analisar: ");
        String palavra = scanner.nextLine();



        System.out.println("MINHA STRING: " + palavra);
        StringBuilder strb = new StringBuilder(palavra);
        palavra = strb.reverse().toString();
        System.out.println("MINHA STRING REVERSA: " + palavra);


        //String paalvraInvertida = palavra.repl

        ArrayList<String> listaSubstring = new ArrayList<>();
        ArrayList<String> listaReversa = new ArrayList<>();
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
                        anagramas.add(novaString);
                    }
                    listaSubstring.add(novaString);

                }
            }
        }
    }
}
