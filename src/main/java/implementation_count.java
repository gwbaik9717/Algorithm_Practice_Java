import java.util.*;

public class implementation_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int total = 0;

        for(int hour=0; hour<=n; hour++){
            if(Integer.toString(hour).contains("3")){
                total += 3600;
            }else{
                for(int min=0; min<60; min++) {
                    if (Integer.toString(min).contains("3")) {
                        total += 60;
                    }else{
                        for(int sec=0; sec<60; sec++){
                            if (Integer.toString(sec).contains("3")) {
                                total += 1;
                            }
                        }
                    }
                }
            }
        }

        System.out.println(total);
    }
}
