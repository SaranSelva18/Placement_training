import java.util.Random;
public class random{
public static void main(String[] args){
Random rand = new Random();
char a =(char)('A'+rand.nextInt(26));
char b =(char)('A'+rand.nextInt(26));
System.out.println(a+ "<"+b +":"+(a<b));
System.out.println(a +"<="+b +":"+(a<=b));
System.out.println(a +">"+b +":"+(a>b));
System.out.println(a +">="+b +":"+(a>=b));
System.out.println(a +"=="+b +":"+(a==b));
System.out.println(a +"!="+b +":"+(a!=b));
}
}