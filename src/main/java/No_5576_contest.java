import java.util.*;

public class No_5576_contest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] storage = new int[2][10];

        for (int i = 0; i < storage.length; i++) {
            for (int j = 0; j < storage[i].length; j++) {
                storage[i][j] = sc.nextInt();
            }
        }

        // 삽입정렬 사용하기
        for (int i = 0; i < storage.length; i++) {
            for (int j = 1; j < storage[i].length; j++) {
                int key = storage[i][j];

                for (int k = j - 1; k >= 0; k--) {
                    if (key < storage[i][k]) {
                        storage[i][k + 1] = storage[i][k];
                        storage[i][k] = key;
                    }
                }
            }
        }


        for (int i = 0; i < storage.length; i++) {
            int total = 0;

            for (int j = storage[i].length-1; j >= storage[i].length-3; j--) {
                total += storage[i][j];
            }
            System.out.print(total + " ");
        }
    }
}
