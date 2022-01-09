import java.util.*;

public class No_23343_javascript {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();


        char[] alphabet = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz".toCharArray();


        for(int i=0; i<a.length(); i++){
            for (char c : alphabet) {
                if (a.charAt(i) == c) {
                    System.out.println("NaN");
                    return;
                }
            }
        }

        for(int i=0; i<b.length(); i++){
            for (char c : alphabet) {
                if (b.charAt(i) == c) {
                    System.out.println("NaN");
                    return;
                }
            }
        }

        System.out.println(Integer.parseInt(a) - Integer.parseInt(b));
    }
}
