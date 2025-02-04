import java.util.*;
public  class Reverse{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
if(x<0)
x=x*-1;
int num =x;
int reverse= 0;
while(num>0){
int digit=num%10;
reverse=reverse*10+digit;
num=num/10;
}
System.out.println(reverse);

}
}