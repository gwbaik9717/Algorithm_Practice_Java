import java.util.*;
import java.util.HashMap;

public class No_1157_vocab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase();
        HashMap<String, Integer> hash = new HashMap<String, Integer>();

        for(int i=0; i<str.length(); i++){
            if(hash.containsKey(Character.toString(str.charAt(i)))){
                hash.put(Character.toString(str.charAt(i)), hash.get(Character.toString(str.charAt(i)))+1);
            }else{
                hash.put(Character.toString(str.charAt(i)),1);
            }
        }

        Set<String> keys = hash.keySet();
        Iterator<String> it = keys.iterator();

        int max = 0;
        String maxKey ="";

        while(it.hasNext()){
            String key = it.next();
            if(hash.get(key) > max){
                max = hash.get(key);
                maxKey = key;
            }
        }
        hash.remove(maxKey);

        if(hash.containsValue(max)){
            System.out.println("?");
        }else{
            System.out.println(maxKey);
        }


    }
}
