import java.util.*;

public class No_1159_basketball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        ArrayList<Character> arrayList = new ArrayList<Character>();


        int size = sc.nextInt();

        for(int i=0; i<size; i++){
            char firstChar = sc.next().charAt(0);
            if(hashMap.containsKey(firstChar)){
                hashMap.put(firstChar, hashMap.get(firstChar) + 1);
            }else{
                hashMap.put(firstChar, 1);
            }
        }

        Set<Character> keys = hashMap.keySet();
        Iterator<Character> it = keys.iterator();

        while(it.hasNext()){
            char key = it.next();
            if(hashMap.get(key) >= 5){
                arrayList.add(key);
            }
        }

        if(arrayList.size() == 0){
            System.out.println("PREDAJA");
        }else{
            Collections.sort(arrayList);

            Iterator<Character> it2 = arrayList.iterator();
            while(it2.hasNext()){
                System.out.print(it2.next());
            }
        }
    }
}
