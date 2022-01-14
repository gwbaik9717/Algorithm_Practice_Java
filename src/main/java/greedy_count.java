import java.util.*;

public class greedy_count {
    public static int total = 0;

    public static void count(int number, int divisor){
        total++;

        if(number == 1){
            total--;
            return;
        }

        if(number % divisor != 0){
            count(number--, divisor);
        }else{
            number /= divisor;
            count(number, divisor);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int divisor = sc.nextInt();

        count(number, divisor);
        System.out.println(total);
    }
}
