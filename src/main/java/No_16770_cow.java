import java.util.*;

public class No_16770_cow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] store = new int[n][3];
        for(int i=0; i<n; i++){
            for(int j=0; j<3; j++){
                store[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(store[i][0] > store[j][0]){
                    int[] temp = store[i];
                    store[i] = store[j];
                    store[j] = temp;
                }
            }
        }

        boolean[][] buckets = new boolean[10][1000];

        for(int i=0; i< store.length; i++){
            int pointer = 0;
            int count = 0;

            while(count < store[i][2]){
                if(buckets[pointer][store[i][0]-1] == true){
                    pointer ++;
                    continue;
                }else{
                    for(int j=store[i][0]-1; j<store[i][1]; j++){
                        buckets[pointer][j] = true;
                    }
                    count++;
                }
            }
        }

        int total = 0;

        for(int i=0; i< buckets.length; i++){
            for(int j=0; j< buckets[i].length; j++){
                if(buckets[i][j] == true){
                    total++;
                    break;
                }
            }
        }

        System.out.println(total);
    }
}
