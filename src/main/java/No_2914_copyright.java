import java.util.*;

public class No_2914_copyright{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numSongs = sc.nextInt();
        int average = sc.nextInt();
        int totalMelodies = numSongs * (average-1) + 1;
        System.out.println(totalMelodies);
    }
}
