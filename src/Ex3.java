import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.String.valueOf;

public class Ex3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a palavra que você quer analisar: ");
        String palavra = scanner.nextLine();

        ArrayList<String> listaSubstring = new ArrayList<>();
        ArrayList<String> anagramas = new ArrayList<>();

        int countIguais = 0;

        //VERIFICA INDICE POR INDICE, COMPRIMENTO DA PALAVRA INTEIRA.
        for (int i=0; i<palavra.length(); i++) {
            for (int j=1; j<palavra.length(); j++) {

                char charI = palavra.charAt(i); //0,1,2
                char charJ = palavra.charAt(j); //1,2
                String combinacaoIj = valueOf(charI) + valueOf(charJ);

                System.out.println("i: " + i + " charI: " + charI);
                System.out.println("j: " + j + " charJ: " + charJ);
                System.out.println();

                //SE CARACTERES IGUAIS = OO, BB, AA.. E INDICES DIFERENTES
                if (charI == charJ && i != j) {
                        countIguais = countIguais + 1;
                        System.out.println("elementos iguais: " + countIguais);
                        System.out.println();
                        anagramas.add(i, combinacaoIj);
                }
                if (charI != charJ) {
                    listaSubstring.add(i, combinacaoIj);
                }

            }

        }
        System.out.println("Lista de substrings: " + listaSubstring);
        System.out.println("PAR DE LETRAS IGUAIS: " + countIguais);
        System.out.println("ANAGRAMAS: " + anagramas);
    }


}

//---------------------------------------------------------------------
/*

               String combinacaoIj = valueOf(charI) + valueOf(charJ);

                //String stringJ = new StringBuilder(listaSubstring.get(j).reverse().toString());
                //StringBuilder stringInvertida = stringJ.reverse();



                System.out.println("i: " + i + " charI: " + charI);
                System.out.println("j: " + j + " charJ: " + charJ);
                System.out.println();
                //SE CARACTERES IGUAIS = OO, BB, AA..
                if (charI == charJ) {
                    if (i != j) { //conta se os indices forem diferentes: OvO, OOvo
                        countIguais = countIguais + 1;
                        System.out.println("elementos iguais: " + countIguais);
                        System.out.println();
                        listaSubstring.add(i, combinacaoIj);
                        anagramas.add(i, combinacaoIj);
                    }
                }
                //----------------------



                for (int s1=0; s1<substring.length(); s1++) {
                    if (listaSubstring.get(i).equals(stringInvertida)) {

                        System.out.println("COMBINACOES: " + countIguais);
                        System.out.println("INVERTIDAS: " + stringInvertida);
                        System.out.println();
                    }
                }

                }
            }


//SE COMBINACAO É IGUAL A OUTRA COMBINAÇÃO
        for (int s1=0; s1<substring.length(); s1++) {
            if (listaSubstring.get(j) == stringInvertida) {

                System.out.println("COMBINACOES: " + countIguais);
                System.out.println("INVERTIDAS: " + stringInvertida);
                System.out.println();
            }
        }
        String substring = listaSubstring;
        for (int i=0; i<substring.length(); i++) {
            for (int j = 0; j < substring.length(); j++) {
                substring = substring.indexOf();
                //ARMAZENA TODAS AS COMBINAÇOES EM UM ARRAY

                if (i != j) {
                    System.out.println("Substring: " + substring);
                    listaSubstring.add(i, substring);
                    System.out.println();
                }
            }
        }
    
}*/