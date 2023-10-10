import java.util.*;

public class duck {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int a = read.nextInt();
        int b = 0;
        while (a != 0) {
            int x = a % 10;
            if (x == 0) {
                b = b + 1;
            }
            a = a / 10;

        }
        if (b > 0) {
            System.out.println("its a duck number");
        } else {
            System.out.println("it is not a duck number");
        }
    }

}
