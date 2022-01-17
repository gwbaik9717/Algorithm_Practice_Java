import java.util.*;

public class No_14659_dragon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] store = new int[size];

        for(int i=0; i<size; i++){
            store[i] = sc.nextInt();
        }

        int pointer = 0;
        int max_count = 0;
        int count = 0;

        for(int i=1; i<store.length; i++){
            if(store[pointer] > store[i]){
                count++;
            }else{
                pointer = i;
                count = 0;
            }
            if(max_count < count){
                max_count = count;
            }
        }
        System.out.println(max_count);
    }
}
