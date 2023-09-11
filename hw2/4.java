import java.util.Scanner;

public class P1 {

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        double smallest = 0;

	int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            double value = sc.nextDouble();
            if (value < smallest) {
                smallest = value;
            }
        }

        System.out.print(smallest);
    }
}