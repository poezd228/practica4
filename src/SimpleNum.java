import java.util.Scanner;
public class SimpleNum {
    public static int num;
    public static boolean SimpleNum(int num, int devider) {

        while (devider >= 2) {
            if (num % devider == 0) {
                return false;
            } else return SimpleNum(num, devider - 1);
        }
        return true;


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        System.out.println(SimpleNum(num, num-1));

    }
}
