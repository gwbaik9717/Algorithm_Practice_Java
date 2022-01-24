import java.util.*;

class Node {

    private int x;
    private int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}


public class bfs_maze {

    public static int[][] graph = new int[201][201];
    public static int m,n;

    // 상, 하, 좌, 우 정의
    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};


    public static int bfs(int x, int y){
        Queue<Node> q = new LinkedList<Node>();

        q.offer(new Node(x, y));


        while(!q.isEmpty()){
            Node bottom = q.poll();

            x = bottom.getX();
            y = bottom.getY();

            for(int i=0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];

                //범위 초과
                if(nx < 0 || ny < 0 || nx >= m || ny >= n){
                    continue;
                }

                if(graph[nx][ny] == 1){
                    q.offer(new Node(nx, ny));
                    graph[nx][ny] = graph[x][y] + 1;
                }


            }


        }

        return graph[m-1][n-1];


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();



        for(int i=0; i<m; i++){
            String[] row = sc.next().split("");

            for(int j=0; j<n; j++){
                graph[i][j] = Integer.parseInt(row[j]);

            }
        }




        System.out.println(bfs(0,0));

    }
}
