import java.util.*;

public class implementation_chess {
    public static void main(String[] args) {
        char[] row = "123456789".toCharArray();
        char[] column= "abcdefgh".toCharArray();
        int[] dx = {-2, -2, -1, -1, 1, 1, 2, 2};
        int[] dy = {-1, 1, -2, 2, -2, 2, -1, 1};

        Scanner sc = new Scanner(System.in);
        String location = sc.next();

        int x = 0;
        int y = 0;

        for(int i=0; i<row.length; i++){
            if(row[i] == location.charAt(1)){
                x=i;
                break;
            }
        }
        for(int i=0; i<row.length; i++){
            if(column[i] == location.charAt(0)){
                y=i;
                break;
            }
        }

        int count = 0;

        for(int i=0; i<8; i++){
            if(x+dx[i] <0 || y+dy[i] < 0 || x + dx[i] >= 8 || y + dy[i] >= 8){
                continue;
            }count++;
        }
        System.out.println(count);
    }
}
