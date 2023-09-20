import java.util.Scanner;
public class multipliers {


    public static boolean Multipliers(int num, int devider) {
        while (devider >= 1 ) {
            if (num % devider ==  0) {
                System.out.print(devider + " ");
                return Multipliers(num, devider - 1);
            } else return Multipliers(num, devider - 1);


        }
        return false;





    }

    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        System.out.println(Multipliers(num, num));
    }
}

