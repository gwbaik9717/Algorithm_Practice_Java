import java.util.*;

public class No_1032_prompt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        String[] store = new String[size];

        for(int i=0; i<size; i++){
            store[i] = sc.next();
        }

        ArrayList<Character> ans = new ArrayList<Character>();

        if(size == 1){
            System.out.println(store[0]);
        }else{
            outer:
            for(int i=0; i<store[0].length(); i++){
                char std = store[0].charAt(i);
                for(int j=1; j<size; j++){
                    if(store[j].charAt(i) != std){
                        ans.add('?');
                        continue outer;
                    }
                }
                ans.add(std);
            }

            for (Character an : ans) {
                System.out.print(an);
            }

        }
    }
}
