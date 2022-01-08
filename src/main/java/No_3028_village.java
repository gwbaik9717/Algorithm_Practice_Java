import java.util.*;

public class No_3028_village {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int current = 1;

        for(int i=0; i<str.length(); i++){
            switch (str.charAt(i)){
                case 'A':
                    if(current == 1){
                        current = 2;
                    }else if(current == 2){
                        current = 1;
                    }
                    break;
                case 'B':
                    if(current == 2){
                        current = 3;
                    }else if(current == 3){
                        current = 2;
                    }
                    break;
                case 'C':
                    if(current == 1){
                        current = 3;
                    }else if(current == 3){
                        current = 1;
                    }
                    break;
            }
        }
        System.out.println(current);
    }
}
