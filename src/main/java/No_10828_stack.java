import java.util.*;
import java.util.Stack;
import java.io.*;

public class No_10828_stack {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<Integer>();

        for(int i=0; i<size; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            switch(st.nextToken()){
                case "push":
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if(stack.size() == 0){
                        System.out.println(-1);
                        break;
                    }
                    System.out.println(stack.pop());
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    if(stack.isEmpty())
                        System.out.println(1);
                    else
                        System.out.println(0);
                    break;
                case "top":
                    if(stack.isEmpty())
                        System.out.println(-1);
                    else
                        System.out.println(stack.peek());
                    break;
            }
        }
    }
}
