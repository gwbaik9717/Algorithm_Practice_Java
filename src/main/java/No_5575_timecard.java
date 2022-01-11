import java.util.*;

public class No_5575_timecard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] store = new int[3][6];
        for(int i=0; i<store.length; i++){
            for(int j=0; j<store[i].length; j++){
                store[i][j] = sc.nextInt();
            }
        }

        int sec;
        int min;
        int hour;

        for(int i=0; i<store.length; i++){
                //sec
                if(store[i][5] - store[i][2] < 0 && store[i][4] > 0){
                    sec = 60 + store[i][5] - store[i][2];
                    store[i][4]--;
                }else if(store[i][5] - store[i][2] < 0 && store[i][4] == 0){
                    sec = 60 + store[i][5] - store[i][2];
                    store[i][4] += 59;
                    store[i][3]--;
                }else{
                    sec = store[i][5] - store[i][2];
                }

                //min
                if(store[i][4] - store[i][1] < 0) {
                    min = 60 + store[i][4] - store[i][1];
                    store[i][3]--;
                }else
                    min = store[i][4] - store[i][1];

                //hour
                hour = store[i][3] - store[i][0];

            System.out.println(hour + " " + min + " " + sec);
        }





    }
}
