import java.util.*;
public class ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int q =  (a>b)?((a>c)?a:c) : ((b>c)?b:c);
        System.out.println(q);

        
    }
    
    
}
