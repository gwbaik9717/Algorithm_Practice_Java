import java.util.*;

public class No_2445_stars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            for(int j=1; j<(n-i)*2-1; j++){
                System.out.print(" ");
            }
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        n--;

        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                System.out.print("*");
            }

            for(int j=0; j<2*(i+1); j++){
                System.out.print(" ");
            }

            for(int j=i; j<n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
