import java.util.*;

public class dfs_ice {
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

    public static boolean dfs(int x, int y){
        if(x >= graph.size() || y >= graph.get(0).size()){
            return false;
        }

        //만약 해당 노드를 방문하지 않았다면
        if(graph.get(x).get(y) == 0){
            graph.get(x).set(y, 1);

            // 우 인접
                dfs(x, y+1);

            // 하 인접
                dfs(x+1, y);

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

        // graph 검사

        int count = 0;

        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                if(dfs(i, j)){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
