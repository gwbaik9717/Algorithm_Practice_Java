import java.util.*;

public class No_16770_cow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] store = new int[n][3];
        int[] calender = new int[1000];

        for(int i=0; i<n; i++){
            for(int j=0; j<3; j++) store[i][j] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            for(int j=store[i][0]; j<store[i][1]; j++){
                calender[j] += store[i][2];
            }
        }

        int max = 0;

        for(int i=0; i< calender.length; i++){
            if(calender[i] > max)
                max = calender[i];
        }

        System.out.println(max);


    }
}
