import java.util.*;

public class dfs_maze {
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    public static int count = 0;



    public static boolean dfs(int x, int y){
        if(x >= graph.size() || y >= graph.get(0).size() || x<0 || y<0){
            return false;
        }

        //만약 해당 노드를 방문하지 않았다면
        if(graph.get(x).get(y) == 1){
            graph.get(x).set(y, 0);

            if(x == graph.size()-1 && y == graph.get(0).size()-1){
                count++;
                return true;
            }



            // 최단거리 이므로 우, 하를 먼저 배치한다.

            if(!(dfs(x, y+1) || dfs(x+1, y) || dfs(x-1, y) || dfs(x, y-1))){
                return false;
            }

            count++;

            return true;
        }
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        //graph에 저장
        for(int i=0; i<a; i++){
            String[] row = sc.next().split("");
            graph.add(new ArrayList<Integer>());

            for(int j=0; j<b; j++){
                graph.get(i).add(Integer.parseInt(row[j]));
            }
        }


        dfs(0,0);
        System.out.println(count);
    }
}
