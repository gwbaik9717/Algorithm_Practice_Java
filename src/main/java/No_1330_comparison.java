import java.util.*;

public class No_1330_comparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a-b == 0){
            System.out.println("==");
        }else if(a-b > 0){
            System.out.println(">");
        }else{
            System.out.print("<");
        }

    }
}
