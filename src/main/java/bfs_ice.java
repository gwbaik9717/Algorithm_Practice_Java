import java.util.*;
public class bfs_ice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] store = new int[a*b+1];
        boolean[] visited = new boolean[a*b+1];
        Queue<Integer> q = new LinkedList<>();



        for(int i=0; i<a; i++){
            String[] row = sc.next().split("");

            for(int j=0; j<b; j++){
                store[b*i + j + 1] = Integer.parseInt(row[j]); // 일렬로 만들기
            }
        }


        int count = 0;


        for(int i=1; i<store.length; i++){
            if(!visited[i] && store[i] == 0){
                q.offer(i);

                while(!q.isEmpty()) {
                    int bottom = q.poll();


                    //우 인접 (맨우측일 경우 제외)
                    if (bottom % b != 0 && store[bottom + 1] == 0 && !visited[bottom+1]){
                        q.offer(bottom + 1);
                        visited[bottom + 1] = true;
                    }

                    //하 인접 (맨하단일 경우 제외)
                    if (bottom + b < store.length && store[bottom + b] == 0 && !visited[bottom+b]) {
                        q.offer(bottom + b);
                        visited[bottom + b] = true;
                    }
                }
                count++;
            }
        }

        System.out.println(count);
    }
}
