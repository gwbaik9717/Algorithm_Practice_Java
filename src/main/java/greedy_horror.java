import java.util.*;

public class greedy_horror {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] people = new int[n];

        for (int i = 0; i < n; i++) {
            people[i] = sc.nextInt();
        }

        //정렬
        for (int i = 0; i < people.length - 1; i++) {
            for (int j = i + 1; j < people.length; j++) {
                if (people[i] > people[j]) {
                    int temp = people[i];
                    people[i] = people[j];
                    people[j] = temp;
                }
            }
        }

        int count = 1;
        int pointer = 0;
        int total = 0;

        while(pointer < people.length){
            if(people[pointer] == 1){
                pointer++;
                total++;
            }else{
                if(count < people[pointer]){
                    pointer++;
                    count++;
                }else{
                    pointer++;
                    count=1;
                    total++;
                }
            }
        }

        System.out.println(total);
    }
}
