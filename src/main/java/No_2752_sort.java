import java.util.*;

public class No_2752_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[3];

        for(int i=0; i<numbers.length; i++){
            numbers[i] = sc.nextInt();
        }

        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(numbers[i] > numbers[j]){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }

    }
}
