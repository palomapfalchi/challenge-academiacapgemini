import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String star = "*";

        for (int i=1; i<N; i++) {
            for (int j=0; j<(N-i); j++)
                System.out.print(" ");
                System.out.println(star.repeat(i));
        }

        System.out.print(star.repeat(N));
    }
}