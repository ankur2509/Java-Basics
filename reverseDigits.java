import java.util.*;

public class rev {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the number>> ");
        int n = read.nextInt();
        int b = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            b = (b * 10) + rem;

        }
        System.out.print(b);
    }

}
