import java.io.*;
import java.util.*;

public class No_2675_string {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());


        for(int i=0; i<size; i++){
            StringTokenizer st= new StringTokenizer(br.readLine(), " ");
            int repeat = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            char[] save = new char[str.length()*repeat];
            for(int j=0; j<str.length(); j++){
                for(int k=j*repeat; k<j*repeat+repeat; k++){
                    save[k] = str.charAt(j);
                }
            }
            String ans = new String(save);
            System.out.println(ans);
        }


    }
}

