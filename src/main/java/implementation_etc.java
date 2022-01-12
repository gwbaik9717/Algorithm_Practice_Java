import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class implementation_etc {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        String store;
        store = br.readLine();
        String[] plan = store.split(" ");

        String[] directions = {"U", "R", "D", "L"};
        int[] dx = {-1, 0, 1, 0};  //U, R, D, L
        int[] dy = {0, 1, 0, -1};  //U, R, D, L


        int x=1;
        int y=1;

        for(int i=0; i< plan.length; i++){
            for(int j=0; j<4; j++){
                if(plan[i].equals(directions[j])){
                    if(x+dx[j] < 1 || y+dy[j] < 1 || x+dx[j] > size || y+dy[j] > size){
                        break;
                    }
                    x += dx[j];
                    y += dy[j];
                    break;
                }
            }
        }

        System.out.println(x + " " + y);
    }
}
