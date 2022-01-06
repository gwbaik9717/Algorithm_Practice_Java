import java.util.*;

public class No_2884_alarm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();


        if(min - 45 < 0){
            //hour
            if(hour == 0)
                hour = 23;
            else
                hour -= 1;

            //min
            min = 60 + (min-45);

        }else {
            min -= 45;
        }

        System.out.println(hour + " " + min);

    }
}
