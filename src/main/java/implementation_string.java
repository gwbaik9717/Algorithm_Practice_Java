import java.util.*;

public class implementation_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int total = 0;
        ArrayList<Character> onlyAlphabet = new ArrayList<Character>();

        // 알파벳만 선별하기
        for(int i=0; i<input.length(); i++){
            char target = input.charAt(i);
            if((int)'A' <= (int)target && (int)target <= (int)'Z'){
                onlyAlphabet.add(target);
            }else{
                total += Integer.parseInt(String.valueOf(target));
            }
        }

        // 알파벳 정렬하기
        for(int i=0; i<onlyAlphabet.size()-1; i++){
            for(int j=i+1; j<onlyAlphabet.size(); j++){
                if((int)onlyAlphabet.get(i) > (int)onlyAlphabet.get(j)){
                    char temp = onlyAlphabet.get(i);
                    onlyAlphabet.set(i, onlyAlphabet.get(j));
                    onlyAlphabet.set(j, temp);
                }
            }
        }

        for(int i=0; i<onlyAlphabet.size(); i++){
            System.out.print(onlyAlphabet.get(i));
        }
        System.out.print(total);
    }
}
