import java.util.Scanner;

public class P2 {

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        int negcount = 0;

        while (true) {
            int num = sc.nextInt();

            if (num == 0) {
                System.out.println(negcount);
		negcount = 0;
              }

            else if (num < 0) {
                negcount++;
	      }
        }
    }
}
