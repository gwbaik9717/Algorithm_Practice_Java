import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.io.BufferedReader;

public class No_9093_vocab {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            StringBuilder string = new StringBuilder();
            while(st.hasMoreTokens()){
                String part = st.nextToken();
                String reversed = new StringBuffer(part).reverse().toString();
                string.append(reversed).append(" ");
            }
            System.out.print(string.toString().trim());
            System.out.println();
        }
    }
}
