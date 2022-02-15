import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String star = "*";
        int space = 2 * N;

        for (int i = 1; i < N; i++) { //ASTERISCOS, DO 1 A N
            for (int j = space; j < 0; j = j - 2) { //ESPACOS DO N*2 A 0
                System.out.print(" ".repeat(N * 2));
                System.out.println(star.repeat(i));
            }
            System.out.print(star.repeat(N));
        }


    }
}
//           * 11
//        **
//      ***
//    **** 4
//  ***** 2
//****** 0