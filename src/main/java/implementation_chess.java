import java.util.*;

public class implementation_chess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String location = sc.next();
        int x = location.charAt(1) - '1';
        int y = location.charAt(0) - 'a';

        int[] dx = {-2, -2, -1, -1, 1, 1, 2, 2};
        int[] dy = {-1, 1, -2, 2, -2, 2, -1, 1};

        int count = 0;

        for(int i=0; i<8; i++){
            if(x+dx[i] <0 || y+dy[i] < 0 || x + dx[i] >= 8 || y + dy[i] >= 8){
                continue;
            }count++;
        }
        System.out.println(count);
    }
}
