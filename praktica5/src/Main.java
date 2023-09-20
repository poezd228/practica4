
public class Main {
    static int num = 123456789;
    static int SumOfNum;
    public static int sum(int n){
        if (n == 0){
            return SumOfNum;
        }
        SumOfNum = SumOfNum + n%10;
        n = n/10;
        return sum(n);
    }

    public static void main(String[] args) {
        System.out.println(sum(num));



        }

    }
