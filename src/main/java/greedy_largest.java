import java.util.*;

public class greedy_largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();

        int total = num.charAt(0) - '0';

        for(int i=1; i<num.length(); i++){
            int next = num.charAt(i) - '0';

            if(total <= 1 || next <= 1){
                total += next;
            }else{
                total *= next;
            }
        }

        System.out.println(total);
    }
}
