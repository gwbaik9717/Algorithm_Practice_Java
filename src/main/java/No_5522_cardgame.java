import java.util.*;

public class No_5522_cardgame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;

        for(int i=0; i<5; i++){
            total += scanner.nextInt();
        }

        System.out.println(total);
    }
}
