import java.util.*;

public class No_3029_terror {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] current = sc.next().split(":");
        String[] future = sc.next().split(":");

        int[] currentInt = new int[3];
        int[] futureInt = new int[3];

        for(int i=0; i<3; i++)
        {
            currentInt[i] = Integer.parseInt(current[i]);
        }

        for(int i=0; i<3; i++)
        {
            futureInt[i] = Integer.parseInt(future[i]);
        }


        int hour;
        int min;
        int sec;

        //sec
        if(futureInt[2] < currentInt[2] && futureInt[1] > 0){
            sec = (60 + futureInt[2]) - currentInt[2];
            futureInt[1]--;
        }else if(futureInt[2] < currentInt[2] && futureInt[1] == 0 && futureInt[0] > 0){
            futureInt[0]--;
            futureInt[1] += 59;
            sec = (60 + futureInt[2]) - currentInt[2];
        }else if(futureInt[2] < currentInt[2] && futureInt[1] == 0 && futureInt[0] == 0){
            futureInt[0] += 23;
            futureInt[1] += 59;
            sec = (60 + futureInt[2]) - currentInt[2];
        } else
            sec = futureInt[2] - currentInt[2];

        //min
        if(futureInt[1] < currentInt[1] && futureInt[0] > 0){
            min = (60 + futureInt[1]) - currentInt[1];
            futureInt[0]--;
        }else if(futureInt[1] < currentInt[1] && futureInt[0] == 0){
            futureInt[0] += 23;
            min = (60 + futureInt[1]) - currentInt[1];
        }
        else
            min = futureInt[1] - currentInt[1];

        //hour
        if(futureInt[0] < currentInt[0]){
            hour = (24 + futureInt[0]) - currentInt[0];
        }else
            hour = futureInt[0] - currentInt[0];

        System.out.println(String.format("%02d", hour) + ":" + String.format("%02d", min) + ":" + String.format("%02d", sec));
    }
}
