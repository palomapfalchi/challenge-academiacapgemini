import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String palavra = scanner.nextLine();

        int count = 0;
        for (int i=0; i<palavra.length(); i++) { //indice por indice [0],[1],[2]
            for (int j=1; j<palavra.length(); j++) {
                char char1 = palavra.charAt(i); // o, v, o
                char char2 = palavra.charAt(j); // o, v, o

                System.out.println("i:" + i + " char1: " + char1);
                System.out.println("j:" + j + " char2: " + char2);
                System.out.println();

                if (char1 == char2) {

                    System.out.println("entrei no if, E SOMO!!!");
                    count = count + 1;
                    System.out.println(char1 + ", " + char2);
                    System.out.println("count: " + count);
                }

            }
        }
        System.out.println("Contador: " + count);

    }
}

/*
        int count = 0;

        for (int i = 0; i < palavraDigitada.length(); i++) { //indice por indice [0],[1],[2]
            System.out.println("entrei no for 1-" + i);
            char ch = palavraDigitada.charAt(i); //o, v, o
            for (int j = 0; j < palavraDigitada.length(); j++) {
                System.out.println("entrei no for 2-" + j);
                if (palavraDigitada.charAt(j) == ch) {
                    System.out.println("entrei no if-" + j);
                    count = count++;
                    System.out.println("Contei-" + count);
                }
                if(i != j) {
                    count = count++;}

            }
        }
        System.out.println(count);
    }
}

        int count = 0;
        boolean temLetraRepetida = true;
        int ultimoIndice = palavra.length() - 1;

        for (int i=0; i<palavra.length(); i++) { //acessa os indices da palavra digitada [0],[1]..
            for (int j=ultimoIndice; j=0; j--) {
                if (palavra.charAt(i) == palavra.charAt(j)) {
                    temLetraRepetida = true;
                    count = count++;
                    System.out.println(count);
                }
            System.out.println(palavra.charAt(i));

                }

            }
       */
