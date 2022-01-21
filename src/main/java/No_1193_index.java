import java.util.Scanner;

public class No_1193_index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();

        if(index == 1){
            System.out.println("1/1");
            return;
        }

        int i = 1;
        int count = 0;

        while(count*(count+1)/2  < index){
            count++;
        }

        int a = 0;
        int b = 0;
        int start = 1;
        int end = count;

        for(int j =0; j <index - count*(count-1)/2; j++ ){
            if(count % 2 == 0){
                a = start;
                b = end;

            }else{
                a = end;
                b = start;
            }

            start ++;
            end --;
        }

        System.out.println(a + "/" + b);






    }
}
