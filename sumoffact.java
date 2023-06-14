import java.util.Scanner;
public class sumoffact {
 public static void main(String[] args) {
    Scanner in =new Scanner(System.in);
    System.out.println("Enter a number");
    int a= in.nextInt();
    int b=0;
    for (int i=1;i<=a;i++)
    {
        if(a%i==0)
        {
            b=b+i;
        }
    }
    System.out.println("Sum of the factors ="+b);
 }   
}