import java.util.*;

public class No_1526_keum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] ans = sc.next().split("");
        int[] input = new int[ans.length];
        for(int i=0; i<ans.length; i++){
            input[i] = Integer.parseInt(ans[i]);
        }


        loopOut:
        for(int i=0; i<input.length; i++){
            int num =input[i];
            if(num > 7){
                input[i] = 7;
            }else if(num == 7) {
                input[i] = 7;
                continue;
            }else if(num > 4){
                input[i] = 4;
            }else if(num == 4){
                input[i] = 4;
                continue;
            }else
            {
                if(i == 0){
                    input[0] = 0;
                }else{
                    input[i-1] = input[i-1]-1;
                    i-=2;
                    continue;
                }
            }

            for(int j=i+1; j<input.length; j++){
                input[j] = 7;
            }
            break loopOut;

        }

        for(int i=0; i<input.length; i++){
            if(input[i]==0){
                continue;
            }
            System.out.print(input[i]);
        }

    }
}
