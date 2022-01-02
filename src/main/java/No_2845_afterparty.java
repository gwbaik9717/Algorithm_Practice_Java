import java.util.*;

public class No_2845_afterparty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int area = sc.nextInt();
        int total = n * area;

        for(int i=0; i<5; i++){
            int comparison = sc.nextInt();
            System.out.print(comparison - total + " ");
        }

    }
}
