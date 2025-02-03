import java.util.*;

public class NegAddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close(); 

        
        int difference = Math.abs(num1 - num2);
        int sum = Math.abs(num1 + num2);
        System.out.println(difference);
        System.out.println(sum);
    }
}
