import java.util.*;

public class No_2810_cupholder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt(); //총 사람수

        char[] store = sc.next().toCharArray();

        int countL = 0;

        for(int i=0; i<size; i++){
            if(store[i] == 'L'){
                countL++;
            }
        }

        int totalCount = (size+1) - countL/2; // 총 *의 개수
        int finalCount = totalCount - 2; // 양 끝 * 제외

        if((size - 2) < finalCount){
            System.out.println(size);
        }else{
            System.out.println(2 + finalCount);
        }

    }
}
