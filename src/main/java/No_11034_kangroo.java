import java.util.*;

public class No_11034_kangroo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            while(sc.hasNext()){
                int[] store = new int[3];
                String[] temp = sc.nextLine().split(" ");

                for(int i=0; i<3; i++){
                    store[i] = Integer.parseInt(temp[i]);
                }

                int frontPointer = store[0];
                int middle = store[1];
                int backPointer = store[2];
                int count = 0;

                while(true) {
                    int frontDistance = middle - frontPointer;
                    int backDistance = backPointer - middle;

                    if(frontDistance == 1 && backDistance == 1){
                        System.out.println(count);
                        break;
                    }

                    if (frontDistance <= backDistance) {
                        frontPointer = middle;
                        middle = backPointer-1;
                        count++;
                        continue;
                    } else {
                        backPointer = middle;
                        middle = frontPointer+1;
                        count++;
                        continue;
                    }
                }
            }
        }
}
