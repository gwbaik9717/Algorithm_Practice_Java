import java.util.*;

public class No_1550_hex {
    public static int toInt(char n){
        if (n<58)
            return (n - 48);
        return (n - 55);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int total = 0;
        for(int i=0; i<n.length(); i++){
            total += toInt(n.charAt(i)) * Math.pow(16, n.length()-1-i);
        }
        System.out.println(total);
    }
}
