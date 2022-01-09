import java.util.*;

public class No_16408_poker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] store = new String[5];

        for (int i = 0; i < 5; i++) {
            store[i] = sc.next();
        }

        HashMap<Character, Integer> hash = new HashMap<Character, Integer>();

        for (int i = 0; i < 5; i++) {
            char key = store[i].charAt(0);
            if (!hash.containsKey(key)) {
                hash.put(key, 1);
            } else {
                hash.put(key, hash.get(key) + 1);
            }
        }

        Set<Character> keys = hash.keySet();
        Iterator<Character> it = keys.iterator();

        int max = 0;

        while (it.hasNext()) {
            Character key = it.next();
            if (hash.get(key) > max) {
                max = hash.get(key);
            }
        }
        System.out.println(max);
    }
}





